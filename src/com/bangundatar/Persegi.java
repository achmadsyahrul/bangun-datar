package com.bangundatar;

public class Persegi implements BangunDatar {
    private double sisi;

    public Persegi(){

    }

    public Persegi(double sisi){
        setSisi(sisi);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    private double hitungLuas(){
        return sisi*sisi;
    }

    private double hitungKeliling(){
        return 4*sisi;
    }

    @Override
    public double getLuas() {
        return hitungLuas();
    }

    @Override
    public double getKeliling() {
        return hitungKeliling();
    }
}
