/*Nama		: Muhammad Rakha
 * Nim		: 1301154124
 * Kelas	: IF 39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Alienware
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float hasil,a;
        int pilihan;
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        a=input.nextFloat();
        
        System.out.println("Convert ke : ");
        System.out.println("1.Reamur ");
        System.out.println("2.Fahrenheit ");
        System.out.println("3.Kelvin ");
        
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        
        if (pilihan == 1){
            hasil=(float) (0.8*a);
            System.out.println("Reamur = "+hasil);
        }
        
        else if (pilihan == 2){
            hasil=32+(float) (1.8*a);
            System.out.println("Fareinheit = "+hasil);
        }
        
        else if (pilihan == 3){
            hasil= a+ 273;
            System.out.println("Kelvin = "+hasil);
        }
        
        else {
            System.err.println("error!");
        }
    }
    
}
