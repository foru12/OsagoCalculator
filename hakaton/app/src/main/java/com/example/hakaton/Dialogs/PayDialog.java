package com.example.hakaton.Dialogs;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hakaton.Kotlin.LoadSvg;
import com.example.hakaton.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class PayDialog {
    public void payDialod(boolean flag, Context context){
        LinearLayout line;
        RelativeLayout itemInsurance;
        ImageView star;
        TextView nameInsurance,ratingInsurance,priceInsurance;
        RelativeLayout ios;
        ImageView svg;

        if(flag){

            View dialogView = ((Activity) context).getLayoutInflater().inflate(R.layout.pay_dialog, null);
            BottomSheetDialog Mydialog = new BottomSheetDialog(context, R.style.BottomSheetDialog); // Style here
            Mydialog.setContentView(dialogView);
            Mydialog.show();
            ios = Mydialog.findViewById(R.id.ios);
            svg = Mydialog.findViewById(R.id.imageInsurance);
            nameInsurance = Mydialog.findViewById(R.id.nameInsurance);
            ratingInsurance =Mydialog.findViewById(R.id.ratingInsurance);
            priceInsurance = Mydialog.findViewById(R.id.priceInsurance);
            itemInsurance = Mydialog.findViewById(R.id.itemInsurance);
            star = Mydialog.findViewById(R.id.stars);
            line = Mydialog.findViewById(R.id.line);

            itemInsurance.setBackgroundResource(R.color.white);
            line.setBackgroundResource(R.color.white);
            priceInsurance.setBackgroundResource(R.color.white);
            star.setImageResource(R.drawable.star);

            nameInsurance.setText(((Activity) context).getIntent().getExtras().get("name").toString());
            ratingInsurance.setText(((Activity) context).getIntent().getExtras().get("rating").toString());
            priceInsurance.setText(((Activity) context).getIntent().getExtras().get("price").toString());
            LoadSvg.getSVG(svg,((Activity) context).getIntent().getExtras().get("imageSVG").toString());

            ios.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Mydialog.dismiss();
                }
            });
        }
    }
}
