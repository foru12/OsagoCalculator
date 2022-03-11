package com.example.hakaton.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Factor {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("headerValue")
    @Expose
    private String headerValue;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("detailText")
    @Expose
    private String detailText;



    public String getValue() {
        return value;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
