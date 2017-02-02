/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rifkymaulana;

import java.util.Scanner;

/**
 * Nama 	: Rifky Maulana
 * NIM 		: 1301154180
 * Kelas 	: IF-39-12
 * @author Jay
 */
public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("====Program Convert Suhu====");
        System.out.print("Masukkan suhu dalam Celcius = ");
        int c = cin.nextInt();
        System.out.println();
        System.out.println("Convert ke");
        System.out.println("1.Reamur");
        System.out.println("2.Fahrenheit");
        System.out.println("3.Kelvin");
        System.out.print("Pilih : ");
        int pilih = cin.nextInt();
       
        switch (pilih) {
            case 1:
                int R = (int) (c*0.8);
                System.out.println();
                System.out.println("Hasil Konversi ke Reamur : "+R);
                break;
            case 2:
                int F = (int) (c*(1.8)+32);
                System.out.println();
                System.out.println("Hasil Konversi ke Fahrenheit : "+F);
                break;
            case 3:
                int K = c+273;
                System.out.println();
                System.out.println("Hasil Konversi ke Kelvin : "+K);
                break;
            
            default: System.out.println();
                     System.out.println("Maaf hanya pilih 1/2/3");
                
                break;
        }
        
        
    }
}
