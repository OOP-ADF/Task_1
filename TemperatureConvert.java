/**
 * Nafasa Muth Ma'nah
 * 1301150441
 */
package TemperatureConver;

import java.util.Scanner;

public class TemperatureConvert{
    public static void main(String[] args) {
        Scanner konversi = new Scanner(System.in);
        double celcius, reamur, fahrenheit, kelvin;
        int counter = 0, pilih;
        
        System.out.print("Masukkan Suhu : "); //Suhu dengan derajat celcius
        celcius = konversi.nextDouble();

        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("Pilihan : ");
        pilih = konversi.nextInt();
            switch(pilih){
                case 1:
                    reamur = 0.8 * celcius;
                    System.out.print(reamur + " derajat reamur");
                    break;
                case 2:
                    fahrenheit = (1.8 * celcius) + 32;
                    System.out.print(fahrenheit + " derajat fahrenheit");
                    break;
                case 3:
                    kelvin = celcius + 273;
                    System.out.print(kelvin + " derajat kelvin");
                    break;
            }
    }
}