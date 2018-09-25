package com.jy.administrator.zakasdk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by JY on 2018/9/25 0025.
 */
class BaseOkhttpTestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 用okhttp发送一个最基本的请求
     */
    private void sendRequest() {
        //创建okhttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        //创建一个request对象
        final Request request = new Request.Builder()
                .url("https://www/imooc.com/")
                .build();
        //new call
        Call call = mOkHttpClient.newCall(request);
        //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        });
    }
}
