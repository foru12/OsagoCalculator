package com.example.hakaton.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hakaton.Activity.Insurance;
import com.example.hakaton.Activity.MainActivity;
import com.example.hakaton.Dialogs.PayDialog;
import com.example.hakaton.Kotlin.LoadSvg;
import com.example.hakaton.Model.Branding;
import com.example.hakaton.Model.DataOffers;
import com.example.hakaton.R;

import java.util.List;

public class AdapterInsurance extends RecyclerView.Adapter<AdapterInsurance.MyViewholder>{


    LayoutInflater layoutInflater;
    List<DataOffers> arrayList;
    Context context;
    int size;

    public AdapterInsurance(List<DataOffers> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_insurance, parent, false);
        return new MyViewholder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, @SuppressLint("RecyclerView") int position) {

        DataOffers dataOffers = arrayList.get(position);
        Branding branding = dataOffers.getBranding();
        holder.imageInsurance.setBackgroundResource(R.color.white);
        holder.line.setBackgroundResource(R.color.white);
        holder.priceInsurance.setBackgroundResource(R.color.white);

        holder.star.setImageResource(R.drawable.star);
        holder.imageInsurance.setBackgroundResource(R.color.white);

        holder.nameInsurance.setText(dataOffers.getName());
        holder.priceInsurance.setText(dataOffers.getPrice());
        holder.ratingInsurance.setText(dataOffers.getRating());
        LoadSvg.getSVG(holder.imageInsurance,branding.getBankLogoUrlSVG());
        Insurance insurance = new Insurance();
        insurance.setBtn(context);

        holder.itemInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pay = new Intent(context, MainActivity.class);
                pay.putExtra("flag",true);
                pay.putExtra("imageSVG",branding.getBankLogoUrlSVG());
                pay.putExtra("name",dataOffers.getName());
                pay.putExtra("price",dataOffers.getPrice());
                pay.putExtra("rating",dataOffers.getRating());
                context.startActivity(pay);


            }
        });

    }

    @Override
    public int getItemCount() { return arrayList.size(); }

    public class MyViewholder extends RecyclerView.ViewHolder {
        LinearLayout line;
        RelativeLayout itemInsurance;
        ImageView imageInsurance,star;
        TextView nameInsurance,ratingInsurance,priceInsurance;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            imageInsurance = itemView.findViewById(R.id.imageInsurance);
            nameInsurance = itemView.findViewById(R.id.nameInsurance);
            ratingInsurance = itemView.findViewById(R.id.ratingInsurance);
            priceInsurance = itemView.findViewById(R.id.priceInsurance);
            itemInsurance = itemView.findViewById(R.id.itemInsurance);
            star = itemView.findViewById(R.id.stars);
            line = itemView.findViewById(R.id.line);


        }
    }



}
