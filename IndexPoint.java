/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

import java.util.Scanner;

/**
 *
 * @author made rama_1301154203
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.print("Masukkan Nilai Kuis  : ");
        int kuis = Input.nextInt();
        System.out.print("         Nilai UTS   : ");
        int uts = Input.nextInt();
        System.out.print("         Nilai UAS   : ");
        int uas = Input.nextInt();
         
        int nilai;
        nilai = (kuis*25)/100;
        nilai = nilai+(uts*35/100);
        nilai = nilai+(uas*40/100);
        
        if (nilai >= 85) {
            System.out.println("excellent");
        } 
        else if (nilai >= 75) {
                System.out.println("very good");
        } 
        else if (nilai >= 65) {
                    System.out.println("good");
        }
        else if (nilai >= 50){
                        System.out.println("accepted");
        }
        else  {
                        System.out.println("failed");
        }
                            
    }
}

