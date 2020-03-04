package com.bangundatar;

public class Segitiga implements BangunDatar{
    private double alas,tinggi;

    public Segitiga(){

    }

    public Segitiga(double alas, double tinggi){
        setAlas(alas);
        setTinggi(tinggi);
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double hitungMiring(){
        return Math.sqrt(Math.pow(alas/2, 2)+Math.pow(tinggi, 2));
    }

    public double getMiring(){
        return hitungMiring();
    }

    private double hitungLuas(){
        return alas*tinggi/2;
    }

    private double hitungKeliling(){
        return alas+hitungMiring()*2;
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

