package com.example.hakaton.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("factors")
    @Expose
    private Factor[] factors;

    public Factor[] getFactors() {
        return factors;
    }


}
