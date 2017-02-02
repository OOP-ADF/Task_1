/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indeksnilai;

import java.util.Scanner;

/**
 *
 * @author 1301154404_Muhammad Rifky Putra Ananda_IF39-12
 */
public class IndeksNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner (System.in);
        System.out.print("Masukkan nilai UTS = ");
        int uts = cin.nextInt();
        System.out.print("Masukkan nilai UAS = ");
        int uas = cin.nextInt();
        System.out.print("Masukkan nilai Quiz = ");
        int quiz = cin.nextInt();
        
        double nilai = (0.35*uts)+(0.4*uas)+(0.25*quiz);
        
            if ((nilai >= 85) & (nilai <= 100)) {
                System.out.println("Excellent");
            }
            else if ((nilai >= 75) & (nilai <= 84)) {
                System.out.println("Very Good");
            }
            else if ((nilai >= 65) & (nilai <= 74)) {
                System.out.println("Good");
            }
            else if ((nilai >= 50) & (nilai <= 64)) {
                System.out.println("Accepted");
            }
            else {
                System.out.println("Failed");
            }
        }
    }
    

