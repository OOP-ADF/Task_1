/*
 * Nama     : GENTUR CIPTO TRI ATMAJA
 * NIM      : 1301140239
 * KELAS    : IF 38-09
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author GENTUR CIPTO TRI ATMAJA
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    int bil;
    int hasil;
    
    Scanner scan= new Scanner(System.in);
    System.out.print("Masukkan Bilangan yang akan di periksa : ");
    
    bil=scan.nextInt();
    
    hasil=0;
        for (int i = 1; i<=bil ; i++) 
        {
            if(bil%i==0)
            {
                hasil=hasil+1;
            } 
        }
        if(hasil==2)
        {
            System.out.print(bil);
            System.out.print(" merupakan sebuah bilangan Prima");
        }
        else
        {
            System.out.print(bil);
            System.out.println(" Tidak termasuk bilangan Prima");
        }
    }
}
    

