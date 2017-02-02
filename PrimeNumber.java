/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeNumber;

/**
 *
 * @author A455ld
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int i,k;
        for (int j = 2; j < 20; j++) {
            for (int l = 2; l <= (j/2); l++) 
                
              if((j%l)==0) break;
           
                
                System.out.println(j);
            
            
        }
    }
}
