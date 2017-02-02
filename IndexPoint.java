/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rifkymaulana;

import java.util.Scanner;

/**
 * Nama 	: Rifky Maulana
 * NIM 		: 1301154180
 * Kelas 	: IF-39-12
 * @author Jay
 */
public class IndexPoint {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("======Program IndexPoint======");
        System.out.println();
        System.out.print("Masukkan Nilai UAS    = ");
        int nUAS = cin.nextInt();
        System.out.print("Masukkan Nilai UTS    = ");
        int nUTS = cin.nextInt();
        System.out.print("Masukkan Nilai Quiz   = ");
        int nQuiz = cin.nextInt();
        
        double nAkhir = ((nUAS*0.4)+(nUTS*0.35)+(nQuiz*0.25));
        
        System.out.println();
        
        if (nAkhir >= 85 && nAkhir <= 100) {
            System.out.println("Nilai akhir = " + nAkhir);
            System.out.println("Grade   : Excellent");
        }
        else if (nAkhir >= 75 && nAkhir <= 85) {
            System.out.println("Nilai akhir = " + nAkhir);
            System.out.println("Grade   : Very Good");
        }
        else if (nAkhir >=65 && nAkhir <=74 ) {
            System.out.println("Nilai akhir = " + nAkhir);
            System.out.println("Grade   : Good");
        }
        else if (nAkhir >=50 && nAkhir <= 64) {
            System.out.println("Nilai akhir = " + nAkhir);
            System.out.println("Grade   : Accepted");
        }
        else if (nAkhir <= 49 && nAkhir >=0) {
            System.out.println("Nilai akhir = " + nAkhir);
            System.out.println("Grade   : Failed");
        }
    }
}
