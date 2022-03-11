package com.example.hakaton;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;



//Метод открытия и закрытия листа коэф.
public class OpenList {
    ImageView strelka;
    LinearLayout listOpen;
    boolean flag = false;
    public void openlist(Context activity) {
        listOpen = ((Activity) activity).findViewById(R.id.listopen);
        strelka =((Activity) activity).findViewById(R.id.arrow);
        listOpen.setVisibility(View.GONE);//Устанавливаем изначальное значение Visibility - GONE
        strelka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!flag) {
                    flag = true;
                    listOpen.setVisibility(View.VISIBLE);
                    strelka.setRotation(180);
                } else {
                    listOpen.setVisibility(View.GONE);
                    strelka.setRotation(0);
                    flag = false;
                }
            }
        });

    }
}
