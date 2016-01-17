/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganprima;

/**
 *
 * @author Muhammad Iqbal Maulana
 * kelas : IF 38 02
 * NIM   : 1301144052
 * 
 */

import java.util.Scanner;

public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("    Mengetahui Bilangan PRIMA");
        System.out.println ("================================="); 
        System.out.print ("input : ");
        int bil = input.nextInt();
        int cek = 0;
        System.out.println ();
        
        for (int i=2; i<bil ; i++){  
      
            if ((bil % i) == 0) {  
                cek = 1; 
                break; 
            }  
        }
        
        if (cek == 1) 
            System.out.println ("angka "+ bil +" bukan sebuah bilangan prima");
        else 
            System.out.println ("angka "+ bil +" adalah sebuah bilangan prima");
    }
    
}

