package com.mcp1993.frameworkdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mcp1993.frameworkdemo.retrofit.RetrofitActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn_goRetrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_goRetrofit = (Button) findViewById(R.id.btn_goRetrofit);
        btn_goRetrofit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btn_goRetrofit:
                intent = new Intent(MainActivity.this, RetrofitActivity.class);
                startActivity(intent);
                break;
        }
    }
}
