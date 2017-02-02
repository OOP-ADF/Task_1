/*
Nama: Faza Ahda
NIM: 1301154292
Kelas: IF-39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1;

import java.util.Scanner;

/**
 *
 * @author faza
 */
public class temperatureconv {
    public static void main(String[] args) {
        // TODO code application logic here
        double f,c,k,r;
        int pil;
        Scanner cin = new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("1. Celcius");
        System.out.println("2. Reamur");
        System.out.println("3. Kelvin");
        System.out.println("4. Fahrenheit");        
        System.out.println("Masukan Satuan Suhu: ");
        pil=cin.nextInt();
        if (pil == 1)
        {
            System.out.println("Masukan Suhu: ");
            c = cin.nextFloat();
            k = c + 273;
            r = (4*c/5);
            f = (9*c/4)+ 32;
            System.out.println("Kelvin: " + k);
            System.out.println("Reamur: " + String.format("%.3f", r));
            System.out.println("Fahrenheit: " + f); 
        } else if (pil == 2){
            System.out.println("Masukan Suhu: ");
            r = cin.nextFloat();
            c = (5/4)*r;
            f = ((9/4)*c)+ 32;
            k = c + 273;
            System.out.println("Celcius: " + c);
            System.out.println("Kelvin: " + k);
            System.out.println("Fahrenheit: " + f);
        } else if (pil == 3) {
            System.out.println("Masukan Suhu: ");
            k = cin.nextFloat();
            c = k - 273;
            f = ((9/4)*c)+ 32;
            r = (4*c/5);
            System.out.println("Celcius: " + c);
            System.out.println("Reamur: " + r);
            System.out.println("Fahrenheit: " + f);
        } else if (pil == 4){
            System.out.println("Masukan Suhu: ");
            f = cin.nextFloat();
            c = ((5/9)*(f-32));
            k = c + 273;
            r = (4*c/5);
            System.out.println("Celcius: " + c);
            System.out.println("Kelvin: " + k);
            System.out.println("Reamur: " + r);
            
        }

        
        
    }
    
}

