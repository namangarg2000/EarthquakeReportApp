package com.example.android.quakereport;

public class Quake {

    private double mag;
    private String city;
    private String date;

    public Quake(double pMag, String pcity, String pdate){
        mag = pMag;
        city = pcity;
        date = pdate;
    }

    public String getMag() {
        return mag + "";
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }
}
