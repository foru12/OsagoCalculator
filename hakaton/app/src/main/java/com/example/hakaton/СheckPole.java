package com.example.hakaton;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hakaton.Activity.Insurance;

public class СheckPole {
    RelativeLayout result;
    TextView txtResult;
    TextView txtKM,txtKT,txtKBM,txtKO,txtKVS;
    TextView txtListBT,txtListKM,txtListKT,txtListKBM,txtListKBS,txtListKO;
    TextView edpowercar, edHowManyCars, edAgeOfTheYoungestDriver, edMinimumDriverExperience, edHowManyYears;
    public boolean flag(Context activity){
        initID(activity);
        boolean flag = false;
        if(!txtListBT.getText().toString().equals("") &&
                !txtListKM.getText().toString().equals("") &&
                !txtListKT.getText().toString().equals("") &&
                !txtListKBM.getText().toString().equals("") &&
                !txtListKBS.getText().toString().equals("") &&
                !txtListKO.getText().toString().equals("") &&
                !txtKM.getText().toString().equals("") &&
                !txtKT.getText().toString().equals("") &&
                !txtKBM.getText().toString().equals("") &&
                !txtKO.getText().toString().equals("") &&
                !txtKVS.getText().toString().equals("") &&
                !edpowercar.getText().toString().equals("") &&
                !edHowManyCars.getText().toString().equals("") &&
                !edAgeOfTheYoungestDriver.getText().toString().equals("") &&
                !edMinimumDriverExperience.getText().toString().equals("") &&
                !edHowManyYears.getText() .toString().equals(""))
        {
            flag = true;
        }
        return flag;
    }

    public  void initID(Context activity){

         txtKM = ((Activity) activity).findViewById(R.id.txtKM);
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

        //Поля ввода данных
        edpowercar = ((Activity) activity).findViewById(R.id.edpowercar);
        edHowManyCars = ((Activity) activity).findViewById(R.id.edHowManyCars);
        edAgeOfTheYoungestDriver = ((Activity) activity).findViewById(R.id.edAgeOfTheYoungestDriver);
        edMinimumDriverExperience = ((Activity) activity).findViewById(R.id.edMinimumDriverExperience);
        edHowManyYears = ((Activity) activity).findViewById(R.id.edHowManyYears);
    }

    //Метод установки клика
    public void calculate(Context activity){
        result =  ((Activity) activity).findViewById(R.id.result);
        txtResult = ((Activity) activity).findViewById(R.id.txtResult);
        result.setClickable(true);
        result.setBackgroundResource(R.drawable.android_active);
        txtResult.setTextColor(Color.WHITE);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, Insurance.class);
                activity.startActivity(intent);
            }
        });
    }
    @SuppressLint("ResourceAsColor")
    public void noCalculate(Context context){
        result =  ((Activity) context).findViewById(R.id.result);
        txtResult = ((Activity) context).findViewById(R.id.txtResult);
        result.setClickable(false);
        result.setBackgroundResource(R.drawable.android);
        txtResult.setTextColor(R.color.textOff);

    }
}
