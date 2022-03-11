package com.example.hakaton.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Branding {






    @SerializedName("bankLogoUrlSVG")
    @Expose
    private String bankLogoUrlSVG;



    public String getBankLogoUrlSVG() {
        return bankLogoUrlSVG;
    }

    public void setBankLogoUrlSVG(String bankLogoUrlSVG) {
        this.bankLogoUrlSVG = bankLogoUrlSVG;
    }
}
