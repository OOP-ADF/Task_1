/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturconvert;

/**
 *
 * @author Muhammad Iqbal Maulana
 * kelas : IF 38 02
 * NIM   : 1301144052
 * 
 */

import java.util.Scanner;

public class TemperaturConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        scanner input = new scanner (System.in);
        
        System.out.println("KONVERT SUHU (Celcius) ");
        System.out.println("=======================");
        System.out.print("Celcius : ");
        int C = input.nextInt ();
        double hasil;
        do {
            int cek = 0;
            System.out.println("Temperature Convert");
            System.out.println("============================");
            System.out.println("1. Reamur");
            System.out.println("2. Farenheit");
            System.out.println("3. kelvin");
            System.out.print("Pilih : ");
            int pilih = input.nextInt();
            int jawab;
            
            switch (pilih) {
                case 1 : hasil = (C*4/5);
                         System.out.println(C+" celcius = "+hasil+" Reamur");
                         System.out.println("Konvert lagi?");
                         System.out.println("1. Ya");
                         System.out.println("2. Tidak");
                         System.out.print("Jawab : ");
                         jawab = input.nextInt();
                         
                         if (jawab == 1) 
                             cek = 1;
                        break;
                        
                case 2 : hasil = (C*9/5)+32;
                         System.out.println(C+" celcius = "+hasil+" Farenheit");
                         System.out.println("Konvert lagi?");
                         System.out.println("1. Ya");
                         System.out.println("2. Tidak");
                         System.out.print("Jawab : ");
                         jawab = input.nextInt();
                         
                         if (jawab == 1) 
                             cek = 1;
                        break;
                        
                case 3 : hasil = C+273.15;
                         System.out.println(C+" celcius = "+hasil+" Kelvin");
                         System.out.println("Konvert lagi?");
                         System.out.println("1. Ya");
                         System.out.println("2. Tidak");
                         System.out.print("Jawab : ");
                         jawab = input.nextInt();
                         
                         if (jawab == 1) 
                             cek = 1;
                        break;
                        
                
            }
            
            
            
            
        } while(cek == 1);
        
        
        
    }
    
}
