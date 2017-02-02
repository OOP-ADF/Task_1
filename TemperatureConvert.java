/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconvert;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Guntur Fatmawan
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner inputan = new Scanner(System.in); 
    double celcius, hasilfahrenheit, hasilkelvin, hasilreamur;
    int pilih;
  
    System.out.print("Masukan Suhu Dalam Celcius  : ");
    celcius = inputan.nextInt();
    
    do {
        do {
            System.out.println("");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Kelvin");
            System.out.println("3. Reamur");
            System.out.print("Masukan Pilihan :");
            pilih = inputan.nextInt();
            System.out.println("");
        } while(pilih != 1 && pilih != 2 && pilih != 3);
  
        switch(pilih){
            case 1 :
                hasilfahrenheit = (celcius*9/5)+32;
                System.out.println(celcius + " Celcius = " + hasilfahrenheit +" Fahrenheit");
                break;
    
            case 2 :
                hasilkelvin = celcius+273.15;
                System.out.println(celcius + " Celcius = " + hasilkelvin +" Kelvin");
                 break;
    
            case 3 :
                hasilreamur = celcius*4/5;
                System.out.println(celcius + " Celcius = " + hasilreamur +" Reamur");
                break;
        }
        
        pilih = 0;
                
        while ( pilih != 1 && pilih != 2) {
            System.out.println("Ingin melakukan konversi kembali ?");
            System.out.println("Tekan 1 untuk YES dan tekan 2 untuk NO");   
            pilih = inputan.nextInt();
        }
    } while (pilih == 1);
    
    }
}

    
    

