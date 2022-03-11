package com.example.hakaton.Dialogs;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hakaton.Retrofit.GetInfoRetrofit;
import com.example.hakaton.R;
import com.example.hakaton.СheckPole;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class DialogOpen {
    RelativeLayout btn,btnback,bottomDialog;
    TextView edpowercar, edHowManyCars, edAgeOfTheYoungestDriver,
            edMinimumDriverExperience, edHowManyYears,txtbtn,title,city, entercity;
    EditText edcity;
    BottomSheetDialog Mydialog;

    public void setDialogView(Context activity, int id) {

        View dialogView = ((Activity) activity).getLayoutInflater().inflate(R.layout.custom_my_dialog, null);
        Mydialog = new BottomSheetDialog(activity, R.style.BottomSheetDialog); // Style here
        bottomDialog = Mydialog.findViewById(R.id.bottom_shee);


        Mydialog.setContentView(dialogView);
        //поля которые привязаны к диалогу активити
        btn = Mydialog.findViewById(R.id.buttons);
        edcity = Mydialog.findViewById(R.id.edcity);
        title = Mydialog.findViewById(R.id.title);
        txtbtn = Mydialog.findViewById(R.id.txtbtn);
        btnback = Mydialog.findViewById(R.id.btnback);
        Mydialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                //Класс получения коэфов с Json
                GetInfoRetrofit getRetrofit = new GetInfoRetrofit();
                getRetrofit.getInfoRetrofit(((Activity) activity));
            }
        });

        initID(activity);
        Mydialog.show();
        swich(id,activity);





    }


    public void swich(int id,Context activity){

        switch (id) {
            case 0:
                city.setText(R.string.case0);
                title.setText(R.string.case0);
                edcity.setHint(R.string.hint1);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entercity.setText(edcity.getText().toString());
                        edcity.setText("");
                        swich(id+1, activity);

                    }
                });
                btnback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                break;
            case 1:

                title.setText(R.string.dialog2);
                //edcity.setHint(R.string.hint2);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edpowercar.setText(edcity.getText().toString());
                        edcity.setText("");
                        swich(id+1, activity);

                    }
                });
                btnback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        swich(id-1, activity);
                    }
                });
                break;
            case 2:
                title.setText(R.string.dialog3);
                //edcity.setHint(R.string.hint3);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edHowManyCars.setText(edcity.getText().toString());
                        edcity.setText("");
                        swich(id+1, activity);
                    }
                });
                btnback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        swich(id-1, activity);
                        edcity.setText("");

                    }
                });
                break;
            case 3:
                title.setText(R.string.dialog4);
                //edcity.setHint(R.string.hint4);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edAgeOfTheYoungestDriver.setText(edcity.getText().toString());

                        edcity.setText("");
                        swich(id+1, activity);

                    }
                });
                btnback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        swich(id-1, activity);
                        edcity.setText("");

                    }
                });
                break;
            case 4:
                title.setText(R.string.dialog5);
                //edcity.setHint(R.string.hint5);
                txtbtn.setText(R.string.btnNext);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edMinimumDriverExperience.setText(edcity.getText().toString());

                        edcity.setText("");
                        swich(id+1, activity);

                    }
                });
                btnback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        swich(id-1, activity);
                        edcity.setText("");

                    }
                });
                break;
            case 5:
                title.setText(R.string.dialog6);
                txtbtn.setText(R.string.btnPodtverdit);
                //edcity.setHint(R.string.hint6);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edHowManyYears.setText(edcity.getText().toString());
                        edcity.setText("");
                        Mydialog.dismiss();
                        СheckPole check = new СheckPole();
                        if(check.flag(activity)){
                            check.calculate(activity);
                        }

                        else check.noCalculate(activity);

                    }
                });
                btnback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        swich(id-1, activity);
                        edcity.setText("");


                    }
                });
        }
    }

    public void initID(Context activity){
        entercity =((Activity) activity).findViewById(R.id.entercity);
        city = ((Activity) activity).findViewById(R.id.city);
        edpowercar = ((Activity) activity).findViewById(R.id.edpowercar);
        edHowManyCars = ((Activity) activity).findViewById(R.id.edHowManyCars);
        edAgeOfTheYoungestDriver = ((Activity) activity).findViewById(R.id.edAgeOfTheYoungestDriver);
        edMinimumDriverExperience = ((Activity) activity).findViewById(R.id.edMinimumDriverExperience);
        edHowManyYears = ((Activity) activity).findViewById(R.id.edHowManyYears);
    }
}
