package com.mcp1993.frameworkdemo.retrofit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.mcp1993.frameworkdemo.R;
import com.mcp1993.frameworkdemo.retrofit.bean.MovieBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mcp1993 on 2017/11/16.
 */

public class RetrofitActivity extends AppCompatActivity {
    private Button btn_request;
    private TextView tv_show;
    private String key = "e7b0e23a310f7ae5c102611fd0e2359b";
    private String q = "西游降魔篇";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        btn_request = (Button) findViewById(R.id.btn_request);
        tv_show = (TextView) findViewById(R.id.tv_show);
        //构造Retrofit实例
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.API_SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);
        Call<MovieBean> call =  service.getTopViewBean(key,q);

        call.enqueue(new Callback<MovieBean>() {
            @Override
            public void onResponse(Call<MovieBean> call, Response<MovieBean> response) {
                Log.e("MovieBean",response.body().toString());
                Log.e("MovieBean",response.toString());
                tv_show.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<MovieBean> call, Throwable t) {
                Log.e("Throwable",t.toString());
            }
        });
    }
}
