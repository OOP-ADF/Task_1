/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author Guntur Fatmawan
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        System.out.print("Masukkan Angka :");
        int bil = inputan.nextInt();
        boolean prima = true;
        for (int j=2; j<bil; j++){
    
            if ((bil % j) == 0) {

                prima = false; break;
            }
        }
        if (prima)

            System.out.println(bil + " Adalah Bilangan Prima ");

        else

            System.out.println(bil + " Bukan Bilangan Prima ");
        }
}
