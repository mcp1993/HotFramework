package com.mcp1993.frameworkdemo.retrofit.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public class MovieBean implements Serializable{
    private String reason;
    private MovieResult result;
    private String error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public MovieResult getResult() {
        return result;
    }

    public void setResult(MovieResult result) {
        this.result = result;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "MovieBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code='" + error_code + '\'' +
                '}';
    }
}
