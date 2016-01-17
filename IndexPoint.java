/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index_point;

/**
 * Nama : Ade Guntur Fitriddullah
 * NIM	: 1301140132
 * Kelas: IF-38-02
 */
import java.util.Scanner;
public class Index_Point {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("||---+ Indeks Nilai Akhir +---||\n");
    System.out.print("Nilai UTS: ");
    //variabel untuk menampung nilai uts
    int uts = input.nextInt();
    System.out.print("Nilai UAS: ");
    //variabel untuk menampung nilai uas
    int uas = input.nextInt();
    System.out.print("Nilai Quiz: ");
    //variabel untuk menampung nilai qiuz
    int quiz = input.nextInt();
   
    //nilai total setelah dikalkulasikan nilai uts+uas+quiznya
    double total_nilai = (uts*0.35)+(uas*0.4)+(quiz*0.25);
    //jika diantara 0-49 status "gagal"
    if(0<total_nilai && total_nilai<50) {
        System.out.println("Failed");
    }
    else
    //jika diantara 50-64 status "diterima"
    if(50<=total_nilai && total_nilai<65) {
        System.out.println("Accepted");
    }
    else
    //jika diantara 65-74 status "baik"
    if(65<=total_nilai && total_nilai<75) {
        System.out.println("Good");
    }
    else
    //jika diantara 75-84 status "sangat baik"
    if(75<=total_nilai && total_nilai<85) {
        System.out.println("Very Good");
    }
    else
    //jika diantara 85-100 status "luar biasa"
    if(85<=total_nilai && total_nilai<=100) {
        System.out.println("Excellent");
        }
    }
    
}
