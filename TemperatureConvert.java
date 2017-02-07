/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

import java.util.Scanner;

/**
 *
 * 
 */
public class No3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.print("Masukkan Bilangan dalam Bentuk Celcius : ");
        double bilcelcius = Input.nextInt();
        
        System.out.println("1. Fahrenheit ");
        System.out.println("2. Kelvin ");
        System.out.println("3. Reamur ");
        
        System.out.print("Masukkan Pilihan : ");
        int pilih = Input.nextInt();
        double hasil = 0;
        
        if (pilih == 1) {
                hasil =  1.8 * bilcelcius + 32;
	} 
	else if (pilih == 2 ){
                hasil = (273 + bilcelcius);
	}
        else if (pilih == 3){
                hasil = 0.8 * bilcelcius;
        }
       
        System.out.println("Hasil : "+hasil);
        
    }
}

