package com.bangundatar;

public class Kubus extends Persegi{
    public Kubus(){

    }

    public Kubus(double sisi){
        super.setSisi(sisi);
    }

    private double hitungVolume(){
        return Math.pow(super.getSisi(),3);
    }

    public double getVolume(){
        return hitungVolume();
    }
}
