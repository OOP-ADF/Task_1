/*
*PROGRAM TEMPERATURECONVERT
*
* write a java program that ask user an input of number that represent a temperature in celcius degrees from
* ask the user the choices to convert the temperature to Reamur degrees from, Fahrenheit degrees from, or Kelvin
* write the output
* ask the user if he/she wants to convert the number to another degrees from
*
*Developed by Gabe Dimas Wicaksana (1301154245) - IF 3907 in Telkom University
*/

import java.util.Scanner;

class Temperatur {
    
    private double hasil;
    public void toReamur(double celc) {
        hasil = celc * 4/5;
        System.out.println("Celcius >>> Reamur : " + hasil);
    }
    
    public void toFahrenheit(double celc) {
        hasil = celc * 9/5 + 32;
        System.out.println("Celcius >>> Fahrenheit : " + hasil);
    }
    
    public void toKelvin(double celc) {
       hasil = celc + 273.15;
       System.out.println("Celcius >>> Kelvin : " + hasil);
    }
}

public class TemperatureConvert {

    public static void main(String[] args) {
   	
    Temperatur suhu = new Temperatur();

    Scanner input = new Scanner(System.in);
    int pilihan;
    double celc;
     
    System.out.print("Input suhu Celcius : ");
    celc = input.nextFloat();
 
    do {
        do {
            System.out.println("");
            System.out.println("Proses konversi ke suhu tertentu");
            System.out.println("1. Reamur");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            System.out.println("");
        } while(pilihan != 1 && pilihan != 2 && pilihan != 3);
        
        switch(pilihan) {
            case 1 :
                suhu.toReamur(celc);
                break;
            case 2 :
                suhu.toFahrenheit(celc);
                break;
            case 3 :
                suhu.toKelvin(celc);
                break;
            default:
                break;
        }
       
        pilihan = 0;
      
        while(pilihan != 1 && pilihan != 2) {
            System.out.println("");
            System.out.println("1 untuk KONVERSI LAGI");
            System.out.println("2 untuk SELESAI");
            System.out.print("Pilihan :");
            pilihan = input.nextInt();
        }
        
    } while(pilihan == 1);
  }
}