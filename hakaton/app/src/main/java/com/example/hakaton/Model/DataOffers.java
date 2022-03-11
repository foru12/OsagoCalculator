package com.example.hakaton.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataOffers {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("branding")
    @Expose
    private Branding branding;

    public Branding getBranding() {
        return branding;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getRating() {
        return rating;
    }



    public String getPrice() {
        return price;
    }


}
