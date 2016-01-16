/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1suhu;

/**
 * Nama : Reza Muhammad K
 * Nim  : 1301144332
 */
import java.util.Scanner;
public class Task1suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pilih = new Scanner (System.in);
        System.out.print("Konversi Suhu\n"
            + "dari Celcius ke:\n "
            + "1.Reamur \n "
            + "2.Fahrenheit \n"
            + "3.Kelvin"
            + "\n Masukkan Pilihan: ");
        int pil = pilih.nextInt();
        Scanner input;
        input = new Scanner (System.in);
        System.out.print(""
            + "\n Masukkan Nilai Suhu(Celcius): ");
        int suhu = input.nextInt();
        int reamur = (4*suhu)/5;
        int fahreinheit = (9*suhu)/5;
        int kelvin = 273+suhu;
        switch(pil){
            case 1:
                System.out.println("\n Nilai Suhu Reamur"
                        + " \n"+reamur+
                        " Derajat");
                break; 
            case 2:
                System.out.println("\n Nilai Suhu Fahreinheit"
                        + " \n"+fahreinheit+
                        " Derajat");
                break;
            case 3:
                System.out.println("\n Nilai Suhu Kelvin"
                        + " \n"+kelvin+
                        " Derajat");
        }
    }
    
}