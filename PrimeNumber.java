/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author Bayu Nugroho 
 * Class : IF 38 09
 * Date : 17/01/2016
 */
import java.util.Scanner;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner angka = new Scanner (System.in);
        System.out.println("Masukkan Sebuah Angka : ");
        int bil = angka.nextInt();
        boolean prima = true ;
        for (int i=2; i<bil ;i++){
            if ((bil % i) == 0) {
                prima = false ; break;
            }
        }
        if (prima)
            System.out.println(bil + " Merupakan Angka Prima");
        else 
            System.out.println(bil + " Merupakan Bukan Angka Prima");
        
            
    }
    
}

