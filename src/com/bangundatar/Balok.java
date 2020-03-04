package com.bangundatar;

public class Balok extends PersegiPanjang {
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi){
        super.setPanjang(panjang);
        super.setLebar(lebar);
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
