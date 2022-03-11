package com.example.hakaton.Api;

import com.example.hakaton.Model.Example;
import com.example.hakaton.Model.Offers;

import java.util.Map;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {
    @FormUrlEncoded
    @POST("rationDetail")
    Call<Example> createUser(@FieldMap Map<String, String> params);
    @FormUrlEncoded
    @POST("startCalculation")
    Call<Offers> createInsurance(@FieldMap Map<String, String> newParams);

}
