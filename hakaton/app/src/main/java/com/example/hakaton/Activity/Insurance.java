package com.example.hakaton.Activity;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hakaton.OpenList;
import com.example.hakaton.R;
import com.example.hakaton.Retrofit.GetInfoInsurance;
import com.example.hakaton.Retrofit.GetInfoRetrofit;

public class Insurance extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);

        //класс раскрытия списка коэф.
        OpenList openListDialog = new OpenList();
        openListDialog.openlist(this);


        //Класс получения коэфов с Json
        GetInfoRetrofit getRetrofit = new GetInfoRetrofit();
        getRetrofit.getInfoRetrofit(this);



        GetInfoInsurance getInsurance = new GetInfoInsurance();
        getInsurance.getInfoInsurance(this);

        back(this);


    }

    public void back(Context activity){
        RelativeLayout back;
        back =  ((Activity) activity).findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Insurance.this, MainActivity.class);
                startActivity(back);
            }
        });
    }

    public void setBtn(Context activity){
        RelativeLayout result;
        TextView txtRes;
        result = ((Activity) activity).findViewById(R.id.result);
        txtRes = ((Activity) activity).findViewById(R.id.txtResult);
        result.setBackgroundResource(R.drawable.android_active);
        txtRes.setTextColor(Color.WHITE);

    }


}