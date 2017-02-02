/**Nama : Yusuf Yunadian
   NIM  : 1301150012
   Kelas: IF-39-12
 To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Input Suhu: ");
        int suhu = cin.nextInt();
        System.out.println("1. Reamur ");
        System.out.println("2. Fahrenheit ");
        System.out.println("3. Kelvin ");
        System.out.println("Merubah ke: ");
        int pilihan = cin.nextInt();
        double hasil;
        hasil = 0;
        if (pilihan==1){
            hasil=0.8 * suhu;
            System.out.println("Hasil = "+hasil+ " Reamur");
        }
        else if (pilihan==2){
            hasil=(9/5 * suhu) + 32;
            System.out.println("Hasil = "+hasil+ " Fahrenheit");
        }
        else {
            hasil=273 + suhu;
            System.out.println("Hasil = "+hasil+ " Kelvin");
        }
        
        // TODO code application logic here
    }
    
}
