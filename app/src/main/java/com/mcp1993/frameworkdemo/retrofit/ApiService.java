package com.mcp1993.frameworkdemo.retrofit;

import android.database.Observable;

import com.mcp1993.frameworkdemo.retrofit.bean.MovieBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by mcp1993 on 2017/11/16.
 * @funtion 定义HTTP API使用接口
 * Retrofit支持5中类型的注解：GET,POST,PUT,DELETE和HEAD.
 * @Url里定义完整URL路径，这种情况下BaseUrl会被忽略
 *
 * @Path用于替换url地址中{和}所括的部分
 */

public interface ApiService {

    String  API_SERVER_URL="http://op.juhe.cn/";

    @GET("onebox/movie/video")
    Call<MovieBean> getTopViewBean(@Query("key")String key, @Query("q")String q);
}
