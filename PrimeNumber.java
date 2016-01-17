/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author Galih Setyo Ginanta 1301140182 if3802
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("masukan angka :");
        Scanner masukan = new Scanner (System.in);
        int angka = masukan.nextInt();
int bil;
bil=0;        
for (int i=1; i<=angka;i++){
            if ((angka % i) == 0 ) {
                bil++;
            }
        }
        if (bil==2) {
          System.out.println(angka + " merupakan bilangan prima");
        }
        else {
          System.out.println(angka + " merupakan bukan bilangan prima");
        }
    }
}
        
