package com.jy.administrator.zeka.application;

import android.app.Application;

/**
 * Created by JY on 2018/9/25 0025.
 * 单例
 * 1.提供整个应用的上下文
 * 2.程序入口
 * 3.初始化工作
 */
public class MyApplication extends Application {

    private static MyApplication application=null;

    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
    }

    public static MyApplication getInstance(){
        return application;
    }
}
