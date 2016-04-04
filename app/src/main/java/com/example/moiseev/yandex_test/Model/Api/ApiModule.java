package com.example.moiseev.yandex_test.model.api;

import com.squareup.okhttp.OkHttpClient;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by moise on 05.04.2016.
 */
public class ApiModule {
    public static ApiInterface getApiInterface(String baseUrl){
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(baseUrl);
        builder.addConverterFactory(GsonConverterFactory.create());
        builder.addCallAdapterFactory(RxJavaCallAdapterFactory.create());
        ApiInterface api = builder.build().create(ApiInterface.class);
        return api;
    }
}
