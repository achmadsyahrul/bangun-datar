package com.bangundatar;

public class Lingkaran implements BangunDatar{
    private double radius;

    public Lingkaran(){

    }
    public Lingkaran(double r){
        setRadius(r);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double hitungLuas(){
        return Math.PI*Math.pow(radius, 2);
    }

    private double hitungKeliling(){
        return Math.PI*radius*2;
    }

    @Override
    public double getLuas() {
        return hitungLuas();
    }

    @Override
    public  double getKeliling() {
        return hitungKeliling();
    }
}

