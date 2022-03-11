package com.example.hakaton.Dialogs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;

import androidx.cardview.widget.CardView;

import com.example.hakaton.R;

public class ClickItemDialog {
    CardView cityregister, carPower, counterDriver, oldDriver, minimumDriverExperience, yearsNoAccidents;

    public void dialogOpen(Context activity) {

        initId(activity);// метод инициализации полей
        // класс открытия самого диалога
        DialogOpen openDialog = new DialogOpen();
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.cityregister:
                        openDialog.setDialogView(((Activity) activity),0);
                        break;
                    case R.id.carPower:
                        openDialog.setDialogView(((Activity) activity),1);
                        break;
                    case R.id.counterDriver:
                        openDialog.setDialogView(((Activity) activity),2);
                        break;
                    case R.id.oldDriver:
                        openDialog.setDialogView(((Activity) activity),3);
                        break;
                    case R.id.minimumDriverExperience:
                        openDialog.setDialogView(((Activity) activity),4);
                        break;
                    case R.id.yearsNoAccidents:
                        openDialog.setDialogView(((Activity) activity),5);
                        break;
                }
            }
        };
        cityregister.setOnClickListener(onClickListener);
        carPower.setOnClickListener(onClickListener);
        counterDriver.setOnClickListener(onClickListener);
        oldDriver.setOnClickListener(onClickListener);
        minimumDriverExperience.setOnClickListener(onClickListener);
        yearsNoAccidents.setOnClickListener(onClickListener);


    }
    public  void initId(Context activity){
        cityregister =((Activity) activity).findViewById(R.id.cityregister);
        carPower = ((Activity) activity).findViewById(R.id.carPower);
        counterDriver = ((Activity) activity).findViewById(R.id.counterDriver);
        oldDriver = ((Activity) activity).findViewById(R.id.oldDriver);
        minimumDriverExperience = ((Activity) activity).findViewById(R.id.minimumDriverExperience);
        yearsNoAccidents = ((Activity) activity).findViewById(R.id.yearsNoAccidents);
    }
}
