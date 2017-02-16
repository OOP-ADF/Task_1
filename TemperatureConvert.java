/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

import java.util.Scanner;
/**
 *
 * @author rizkiaulia
 */

public class TemperaturConvert
 {
    public static void main(String[] args)
 {
        Scanner Input = new Scanner (System.in);
        System.out.print("Masukkan Bilangan Celcius : ");

        double derajatcelcius = Input.nextInt();
        
        System.out.println("1. Fahrenheit. ");
        System.out.println("2. Kelvin. ");
        System.out.println("3. Reamur. ");
        
        System.out.print("Pilihan : ");
        int pilih = Input.nextInt();
        double x = 0;
        
        if (pilih == 1) {
                x =  (1.8 * derajatcelcius) + 32;
	} 
	else if (pilih == 2 ){
                x = (273 + derajatcelcius);
	}
        else if (pilih == 3){
                x = 0.8 * derajatcelcius;
        }
       
        System.out.println("Hasil : "+x);
        
    }
}


    
}
