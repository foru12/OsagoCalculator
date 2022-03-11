package com.example.hakaton.Retrofit;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.hakaton.Model.Example;
import com.example.hakaton.Model.Factor;
import com.example.hakaton.R;
import com.example.hakaton.СheckPole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetInfoRetrofit {
    TextView txtKM,txtKT,txtKBM,txtKO,txtKVS;
    TextView txtListBT,txtListKM,txtListKT,txtListKBM,txtListKBS,txtListKO;

    public void getInfoRetrofit(Context activity){




        //Синие коеффы
        txtKM = ((Activity) activity).findViewById(R.id.txtKM);
        txtKT = ((Activity) activity).findViewById(R.id.txtKT);
        txtKBM = ((Activity) activity).findViewById(R.id.txtKBM);
        txtKO = ((Activity) activity).findViewById(R.id.txtKO);
        txtKVS = ((Activity) activity).findViewById(R.id.txtKVS);

        //коэфы в шторке
        txtListBT = ((Activity) activity).findViewById(R.id.txtListBT);
        txtListKM = ((Activity) activity).findViewById(R.id.txtListKM);
        txtListKT = ((Activity) activity).findViewById(R.id.txtListKT);
        txtListKBM = ((Activity) activity).findViewById(R.id.txtListKBM);
        txtListKBS = ((Activity) activity).findViewById(R.id.txtListKBS);
        txtListKO = ((Activity) activity).findViewById(R.id.txtListKO);


        HashMap<String, String> map = new HashMap<String, String>();

        map.put("pay", "insurance");
        map.put("years", "20");

        try {

            RetrofitClient
                    .getInstance()
                    .getApi()
                    .createUser(map)
                    .enqueue(new Callback<Example>() {
                        @Override
                        public void onResponse(@NonNull Call<Example> call, @NonNull Response<Example> response) {

                            Example example = response.body();
                            List<Factor> list = new ArrayList<>(Arrays.asList(example.getFactors()));

                            //установка текста в поля шторки
                            txtListBT.setText(list.get(0).getValue());
                            txtListKM.setText(list.get(1).getValue());
                            txtListKT.setText(list.get(2).getValue());
                            txtListKBM.setText(list.get(3).getValue());
                            txtListKBS.setText(list.get(4).getValue());
                            txtListKO.setText(list.get(5).getValue());

                            //Установка текста в поля коэфов
                            txtKM.setText(list.get(1).getValue());
                            txtKT.setText(list.get(2).getValue());
                            txtKBM.setText(list.get(3).getValue());
                            txtKO.setText(list.get(4).getValue());
                            txtKVS.setText(list.get(5).getValue());

                        }
                        @Override
                        public void onFailure(Call<Example> call, Throwable t) {
                            Log.i("Throwable", t.getMessage());
                        }
                    });

        }
        catch (Exception e){
            Log.e("er"," " + e);
        }
    }


}
