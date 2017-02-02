/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 
 * Nama : Afif Darmawan
 * NIM	: 1301154133
 * Kelas: IF 39-07
 */
package tugas1;
import java.util.Scanner;
//import java.io
/**
 *
 * @author acer
 */
public class No3 {
        public static void main(String[] args){
            Scanner input= new Scanner(System.in);
            double celcius, hasilfahrenheit, hasilkelvin, hasilreamur;
            
            System.out.print("Masukkan Suhu Dalam Celcius : ");
            celcius = input.nextInt();
            System.out.println("");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Kelvin");
            System.out.println("3. Reamur");
            System.out.println("Masukkan Pilihan Perubahan Suhu");
            int pilih = input.nextInt();
            System.out.println("");
            
            switch(pilih){
                case 1:
                    hasilfahrenheit = (celcius*9/5)+32;
                    System.out.println(celcius+"Celcius = "+ hasilfahrenheit+"Fahrenheit");
                    break;
                case 2:
                    hasilkelvin = (celcius+273.15);
                    System.out.println(celcius +"Celcius ="+ hasilkelvin +"Kelvin");
                    break;
                case 3:
                    hasilreamur = celcius * 4/5;
                    System.out.println(celcius +"Celcius ="+ hasilreamur +"Reamur");
                    break;
                default:
                        System.out.println("Pilihan Yang Anda Masukkan Tidak Benar");
            }        
        }
}
