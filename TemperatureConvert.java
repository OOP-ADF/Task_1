/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature_convert;

/**
 *Nama : Ade Guntur Fitriddullah
 * NIM	: 1301140132
 * Kelas: IF-38-02
 */
import java.util.Scanner;
public class Temperature_Convert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner pilihan = new Scanner (System.in);
   //menampilkan menu
    System.out.print("Mengkonversi Nilai Suhu\n"
            + "Suhu dari Celcius ke:\n "
            + "1.Reamur \n 2.Fahrenheit"
            + "\n 3.Kelvin \n======================="
            + "\n Masukkan Pilihan Anda: ");
    int pilih = pilihan.nextInt();
    Scanner input = new Scanner (System.in);
    System.out.print("======================="
            + "\n Masukkan Nilai Suhu(Celcius): ");
    //variabel penampung nilai suhu
    int suhu = input.nextInt();
    //rumus suhu reamur, farenheit dan kelvin
    int reamur = (4*suhu)/5;
    int fahreinheit = (9*suhu)/5;
    int kelvin = 273+suhu;
    
    switch(pilih){
        case 1:
            System.out.println("\n Nilai Suhu Reamur"
                    + "\n================= \n"+reamur+
                    " Derajat");
            break; 
        case 2:
            System.out.println("\n Nilai Suhu Fahreinheit"
                    + "\n================= \n"+fahreinheit+
                    " Derajat");
            break;
        case 3:
            System.out.println("\n Nilai Suhu Kelvin"
                    + "\n================== \n"+kelvin+
                    " Derajat");
        }
   
    }
    
}
