/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 * Nama : Reza Muhammad K
 * Nim  : 1301144332
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukan sebuah bilangan :");
        int bil = masukan.nextInt();
        boolean prima = true;
        for (int i=2; i<bil; i++){
            if ((bil % i) == 0) {
                prima = false; break;
            }
        }
        if (prima)
            System.out.println(bil + " adalah bilangan PRIMA ");
        else
            System.out.println(bil + " adalah bukan bilangan PRIMA ");
    }
    
}
