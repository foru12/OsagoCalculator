package com.example.hakaton.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Offers {

    @SerializedName("offers")
    @Expose
    private List<DataOffers> offers;

    public List<DataOffers> getOffers() {
        return offers;
    }


}
