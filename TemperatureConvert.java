/**
 * Nafasa Muth Ma'nah
 * 1301150441
 */
package TemperatureConvert;

import java.util.Scanner;

public class TemperatureConvert{
    public static void main(String[] args) {
        Scanner konversi = new Scanner(System.in);
        double celcius, reamur, fahrenheit, kelvin;
        int counter = 0, pilih, lagi;
        
        System.out.print("Masukkan Suhu : "); //Suhu dengan derajat celcius
        celcius = konversi.nextDouble();
        while (counter == 0){
            System.out.println("1. Reamur");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("Pilihan : ");
            pilih = konversi.nextInt();       
            switch(pilih){
                case 1:
                    reamur = 0.8 * celcius;
                    System.out.println(reamur + " derajat reamur");
                    break;
                case 2:
                    fahrenheit = (1.8 * celcius) + 32;
                    System.out.println(fahrenheit + " derajat fahrenheit");
                    break;
                case 3:
                    kelvin = celcius + 273;
                    System.out.println(kelvin + " derajat kelvin");
                    break;
            }
            System.out.println("Apakah Anda Ingin Mengkonversi Suhu Lahi ? ");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            lagi = konversi.nextInt();
            if(lagi == 1){
                System.out.println(pilih);  
            }
            else{
                System.exit(0);
            }     
        }
        
    }
}