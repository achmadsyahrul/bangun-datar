package com.bangundatar;

public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(){

    }

    public Silinder(double radius, double tinggi){
        super.setRadius(radius);
        setTinggi(tinggi);
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    private double hitungVolume(){
        return super.getLuas()*tinggi;
    }

    public double getVolume(){
        return hitungVolume();
    }
}
