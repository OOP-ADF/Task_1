/*
Nama    : Muhammad Maulud Hidayatullah Rambe
NIM     : 1301154166
Kelas   : IF. 39-12
 */

import java.util.Scanner;

public class TempratureConvert {
    public static void main(String[] args) {
        Scanner cinInt = new Scanner(System.in);
        int temprature, choice;
        double convertedTemprature;
        
        System.out.println("TEMPRATURE CONVERTER");
        System.out.println("");
        
        System.out.print("Masukan temprature suhu (Celcius): ");
        temprature = cinInt.nextInt();
        
        System.out.println("Konversi: ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("");
        System.out.print("Pilihan: ");
        choice = cinInt.nextInt();
        
        switch (choice){
            case 1:
                convertedTemprature = temprature*4/5;
                System.out.println("Suhu: "+convertedTemprature+" Reamur");
                break;
            case 2:
                convertedTemprature = (temprature*9/5) + 32;
                System.out.println("Suhu: "+convertedTemprature+" Fahrenheit");
                break;
            case 3:
                convertedTemprature = temprature + 273;
                System.out.println("Suhu: "+convertedTemprature+" Kelvin");
                break;
            default:
                break;
        }
        
    }
}
