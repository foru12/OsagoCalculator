package com.example.hakaton.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hakaton.Dialogs.ClickItemDialog;
import com.example.hakaton.Dialogs.PayDialog;
import com.example.hakaton.Kotlin.LoadSvg;
import com.example.hakaton.OpenList;
import com.example.hakaton.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Класс нажатия на поля и открытия диалога ввода
        ClickItemDialog clickItem = new ClickItemDialog();
        clickItem.dialogOpen(MainActivity.this);

        //класс раскрытия списка коэф.
        OpenList openListDialog = new OpenList();
        openListDialog.openlist(this);

        //Класс открытия диалога страховой
        PayDialog payDialog = new PayDialog();
        payDialog.payDialod(getIntent().getBooleanExtra("flag",false),this);
    }
}




             