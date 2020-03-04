package com.bangundatar;

public class PersegiPanjang implements BangunDatar{
    private double panjang, lebar;

    public PersegiPanjang(){

    }

    public PersegiPanjang(double panjang, double lebar){
        setPanjang(panjang);
        setLebar(lebar);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    private double hitungLuas(){
        return panjang*lebar;
    }

    private double hitungKeliling(){
        return 2*(panjang+lebar);
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
