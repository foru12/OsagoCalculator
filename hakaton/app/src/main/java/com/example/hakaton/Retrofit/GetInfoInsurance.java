package com.example.hakaton.Retrofit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hakaton.Adapters.AdapterInsurance;
import com.example.hakaton.Model.DataOffers;
import com.example.hakaton.Model.Offers;
import com.example.hakaton.R;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetInfoInsurance {
    RecyclerView rcInsurance;
    List<DataOffers> arrayList;
    public void getInfoInsurance(Context context) {

        HashMap<String, String> newMap = new HashMap<String, String>();
        newMap.put("pay", "insurance");
        newMap.put("years", "20");

        try {

            RetrofitClient
                    .getInstance()
                    .getApi()
                    .createInsurance(newMap)
                    .enqueue(new Callback<Offers>() {


                        @SuppressLint("NotifyDataSetChanged")
                        @Override
                        public void onResponse(@NonNull Call<Offers> call, @NonNull Response<Offers> response) {

                            Offers offers = response.body();
                            arrayList = offers.getOffers();


                            List<DataOffers> dataOffers = offers.getOffers();
                            dataOffers.get(0).getName();

                            Log.e("Insurance", "" + dataOffers.get(0).getName());


                            rcInsurance = ((Activity) context).findViewById(R.id.rcInsurance);
                            rcInsurance.setLayoutManager(new LinearLayoutManager(context));
                            AdapterInsurance adapterInsurance = new AdapterInsurance(arrayList, context);
                            rcInsurance.setAdapter(adapterInsurance);
                            rcInsurance.setNestedScrollingEnabled(false);
                            adapterInsurance.notifyDataSetChanged();

                        }

                        @Override
                        public void onFailure(Call<Offers> call, Throwable t) {

                        }
                    });
        } catch (Exception e) {
            Log.e("er", " " + e);
        }
    }
}
