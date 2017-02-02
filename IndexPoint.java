/** Nama : Yusuf Yunadian
 * NIM  : 1301150012
 * Kelas: IF-39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class IndexPoint {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Nilai UTS: ");
        int uts = cin.nextInt();
        System.out.println("Nilai UAS: ");
        int uas = cin.nextInt();
        System.out.println("Nilai Kuis: ");
        int kuis = cin.nextInt();
        
        double total=((0.35*uts) + (0.40*uas) + (0.25*kuis));
        if (total>=85 && total<=100){
            System.out.println("Excellent");
        }
        else if(total>=75 && total<85){
            System.out.println("Verry Good");
        }
        else if(total>=65 && total<75){
            System.out.println("Good");
        }
        else if(total>=50 && total<65){
            System.out.println("Accepted");
        }
        else{
            System.out.println("Failed");
        }
    }
    
}

