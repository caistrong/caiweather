package com.caistrong.caiweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 蔡晓聪 on 2017/9/20.
 */

//    这里的封装好了这个函数
//    后面使用的话直接传入请求的地址和回调即可
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
