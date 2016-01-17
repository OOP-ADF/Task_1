
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indeksnilai;

/**
 *
 * @author Muhammad Iqbal Maulana
 * kelas : IF 38 02
 * NIM   : 1301144052
 * 
 */

import java.util.Scanner;
public class IndeksNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("    PENGOLAHAN INPUT NILAI");
        System.out.println ("=============================="); 
        System.out.print ("nilai UTS  : ");
        int UTS = input.nextInt();
        System.out.print ("nilai UAS  : ");
        int UAS = input.nextInt();
        System.out.print ("nilai QUIZ : ");
        int QUIZ = input.nextInt();
        double hasil = (UTS*35)/100 + (UAS*40)/100 + (QUIZ*25)/100;
        System.out.println();
        System.out.println("Nilai akhir : "+ hasil +" ");
        
        if(hasil < 50) System.out.println("FAILED");
        else if (hasil<65) System.out.println("ACCEPTED");
        else if (hasil<75) System.out.println("GOOD");
        else if (hasil<65) System.out.println("VERY GOOD");
        else System.out.println("EXCELENT");
    }
    
}
