
package com.koc.leaderboard.repository.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Comparator;

public class HoursModel {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("hours")
    @Expose
    private int hours;
    @SerializedName("country")
    @Expose
    private String country;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static final Comparator<HoursModel> BY_HOURS =
            Comparator.comparingInt(HoursModel::getHours);
}
