/*
* abdulnursahid - 1301154385 - if39-07
*/
package indexpoint;

import java.util.Scanner;

public class IndexPoint {

    
    public static void main(String[] args) {
        int kuis, uts, uas;
        double nilaiakhir;
        Scanner cin = new Scanner(System.in);
        System.out.println("Masukan Nilai Uts : ");
        uts = cin.nextInt();
        
        System.out.println("Masukan Nilai Uas : ");
        uas = cin.nextInt();
        
        System.out.println("Masukan Nilai Kuis : ");
        kuis = cin.nextInt();
        
        nilaiakhir = 0.35*uts + 0.4*uas + 0.25*kuis;
        System.out.println("nilaiakhir : "+ nilaiakhir);
        
        
        if (nilaiakhir>=85 && nilaiakhir<=100){
            System.out.println("excellent");
        }
        else if ( nilaiakhir>=74 && nilaiakhir <=84){
            System.out.println("very good");
        }
        else if ( nilaiakhir>=65 && nilaiakhir<=74){
            System.out.println("good");
        }
        else if ( nilaiakhir>=50 && nilaiakhir <=64){
            System.out.println("accepted");
        }
        else if (nilaiakhir >=0 && nilaiakhir <=49){
            System.out.println("failed");
    }
    }
}
    


