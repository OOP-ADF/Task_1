/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangan_prima;

/**
 *Nama : Ade Guntur Fitriddullah
 * NIM	: 1301140132
 * Kelas: IF-38-02
 */
import java.util.Scanner;
public class Bilangan_Prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("||=== Menentukan Bilangan Prima ===||\n");
    //Menampilkan Kalimat
    System.out.print("Masukkan Angka: ");
    //variabel untuk menampung angka
    int angka = input.nextInt();
    //nilai kebenaran variable prima
    boolean prima = true;
    //mengecek apakah inputan user hanya bisa dibagi 1 dan dirinya sendiri saja
    for (int i=2; i<angka; i++){
        //jika dibagi 2-angka = 0 maka bukan bilangan prima
        if((angka % i) == 0){
            prima = false;
            break;
        }
    }
    if (prima)
        System.out.println("\nAngka "+ angka + " adalah bilangan PRIMA");
    else
        System.out.println("\nAngka "+ angka + " bukan bilangan PRIMA");
    }
    
}
