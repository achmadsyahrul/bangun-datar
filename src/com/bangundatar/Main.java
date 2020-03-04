package com.bangundatar;

import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        double sisi,panjang,lebar,alas,tinggi,radius;
        while(ulang) {
            System.out.println("Menu");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkarang");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Kubus");
            System.out.println("6. Silinder");
            System.out.println("7. Balok");
            System.out.print("Pilih : ");
            switch (input.nextInt()) {
                case 1:
                    System.out.print("Masukkan sisi : ");
                    sisi = input.nextDouble();
                    Persegi persegi = new Persegi(sisi);
                    System.out.println("Luas = " + persegi.getLuas());
                    System.out.println("Keliling = " + persegi.getKeliling());
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari : ");
                    radius = input.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(radius);
                    System.out.println("Luas = " + lingkaran.getLuas());
                    System.out.println("Keliling = " + lingkaran.getKeliling());
                    break;
                case 3:
                    System.out.print("Masukkan panjang : ");
                    panjang = input.nextDouble();
                    System.out.print("Masukkan lebar : ");
                    lebar = input.nextDouble();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang,lebar);
                    System.out.println("Luas = " + persegiPanjang.getLuas());
                    System.out.println("Keliling = " + persegiPanjang.getKeliling());
                    break;
                case 4:
                    System.out.print("Masukkan alas : ");
                    alas = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    tinggi = input.nextDouble();
                    Segitiga sikuSiku = new Segitiga(alas,tinggi);
                    System.out.println("Luas = " + sikuSiku.getLuas());
                    System.out.println("Keliling = " + sikuSiku.getKeliling());
                    break;
                case 5:
                    System.out.print("Masukkan sisi : ");
                    sisi = input.nextDouble();
                    Kubus kubus = new Kubus(sisi);
                    System.out.println("Volume = " + kubus.getVolume());
                    break;
                case 6:
                    System.out.print("Masukkan jari-jari : ");
                    radius = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    tinggi = input.nextDouble();
                    Silinder silinder = new Silinder(radius,tinggi);
                    System.out.println("Volume = " + silinder.getVolume());
                    break;
                case 7:
                    System.out.print("Masukkan panjang : ");
                    panjang = input.nextDouble();
                    System.out.print("Masukkan lebar : ");
                    lebar = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    tinggi = input.nextDouble();
                    Balok balok = new Balok(panjang,lebar,tinggi);
                    System.out.println("Volume = " + balok.getVolume());
                    break;
                default:
                    System.out.println("Input salah");
            }
            boolean miss = false;
            do {
                System.out.print("Mau lagi?(y/n) : ");
                char mauLagi = input.next().charAt(0);
                if (mauLagi == 'n' || mauLagi == 'N') {
                    ulang = false;
                    miss = false;
                }
                else if (mauLagi == 'y' || mauLagi == 'Y')
                    miss = false;
                else
                    miss = true;
            }while(miss);

        }
        input.close();
    }
}

