/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indeksnilai;

/**
 *
 * @author Rendy 
 */
import java.util.Scanner;

public class Indeksnilai {
        public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
       
             
        System.out.print("Input Nilai quiz : ");
        int quiz = input.nextInt();
        System.out.print("Input Nilai uts  : ");
        int uts = input.nextInt();
        System.out.print("Input Nilai uas  : ");
        int uas = input.nextInt();
        
        double nilaiAkhir = (quiz*0.25)+(uts*0.35)+(uas*0.4);
        
        if(nilaiAkhir >= 0 && nilaiAkhir < 50) {
            System.out.println("Nilai Akhir : " +nilaiAkhir );
            System.out.println("Grade       : Failed");                    
        } else if(nilaiAkhir < 65) {
            System.out.println("Nilai Akhir : " +nilaiAkhir );
            System.out.println("Grade       : Accept");
        } else if(nilaiAkhir < 75) {
            System.out.println("Nilai Akhir : " +nilaiAkhir );
            System.out.println("Grade       : Good");
        } else if(nilaiAkhir < 85) {
            System.out.println("Nilai Akhir : " +nilaiAkhir );
            System.out.println("Grade       : Very Good");
        } else if(nilaiAkhir <=100) {
            System.out.println("Nilai Akhir : " +nilaiAkhir);
            System.out.println("Grade       : Excellent");
        }
    }
}

    
    

