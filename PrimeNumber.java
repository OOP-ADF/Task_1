/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isprimenumber;

import java.util.Scanner;

/**
 *
 * @author 1301154404_Muhammad Rifky Putra Ananda_IF39-12
 */
public class IsPrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner (System.in);
        System.out.print("Masukkan angka = ");
        int angka = cin.nextInt();
        int i;
        int counter = 1;
        
        for (i = 1; i < angka; i++) {
            if (angka % i == 0) {
                counter ++;
            }
        }
        if (counter == 2) {
            System.out.println("Bilangan Prima");
        }
        else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}

