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
/**
 *
 * @author acer
 */
public class No2 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        final double n_UTS, n_UAS, n_Kuis, n_Akhir;
        String grade;
        System.out.print("Masukkan Nilai UTS : ");
        n_UTS = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        n_UAS = input.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        n_Kuis = input.nextInt();
        
        n_Akhir = (0.35 * n_UTS) + (0.4 * n_UAS) + (0.25 * n_Kuis);
        System.out.println("Hasil Dari Nilai Akhir Adalah : " + n_Akhir);
       
        if (n_Akhir >= 85 && n_Akhir <= 100){
            System.out.println("Excellent");
        }
        else if (n_Akhir >= 75 && n_Akhir<=84){
            System.out.println("Very Good");
        }
        else if (n_Akhir >=65 && n_Akhir<=74){
            System.out.println("Good");
        }
        else if (n_Akhir >=50 && n_Akhir<=64){
            System.out.println("Accepted");
        }
        else if (n_Akhir >= 0 && n_Akhir<=49){
            System.out.println("Failed");
        }
    }
}


