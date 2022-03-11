package com.example.hakaton.Retrofit;
import com.example.hakaton.Api.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {


    private static final String BASE_URL = "http://mock.sravni-team.ru/mobile/internship/v1/osago/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;

    private Api api;

    private  RetrofitClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized  RetrofitClient getInstance(){
        if (mInstance == null)mInstance = new RetrofitClient();
        return mInstance;
    }

    public Api getApi(){
        return retrofit.create(Api.class);
    }




}
