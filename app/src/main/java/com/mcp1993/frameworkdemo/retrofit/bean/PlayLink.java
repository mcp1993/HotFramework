package com.mcp1993.frameworkdemo.retrofit.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public class PlayLink implements Serializable{
    private String qq;

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public String toString() {
        return "PlayLink{" +
                "qq='" + qq + '\'' +
                '}';
    }
}
