/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexpoin;

import java.util.Scanner;

/**
 *
 * @author Guntur Fatmawan
 */
public class IndexPoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double n_uts , n_kuis , n_uas , n_akhir;
        
        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.print("Masukkan Nilai UTS : ");
        n_uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        n_uas = input.nextInt ();
        System.out.print("Masukkan Nilai Kuis : ");
        n_kuis = input.nextInt();        
        n_akhir = (0.35 * n_uts + 0.40 * n_uas + 0.25 * n_kuis);
        
        if(n_akhir<=100 && n_akhir>=85){
            System.out.println("Nilai Akhir Anda Adalah : "+n_akhir);
            System.out.println("EXECELLENT");
        }
        else if(n_akhir<84 && n_akhir>=75){
            System.out.println("Nilai AKhir Anda Adalah : "+n_akhir);
            System.out.println("VERY GOOD");
        }
        else if(n_akhir<74 && n_akhir>=65){
            System.out.println("Nilai Akhir Anda Adalah : "+n_akhir);
            System.out.println("GOOD");
        }
        else if(n_akhir<64 && n_akhir>=50){
            System.out.println("Nilai Akhir Anda Adalah : "+n_akhir);
            System.out.println("ACCEPTED");
        }
        else if(n_akhir<0 && n_akhir>=49){
            System.out.println("Nilai Akhir Anda Adalah : "+n_akhir);
            System.out.println("FAILED");
        }
       
    }
}
    

