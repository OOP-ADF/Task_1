/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber1;

import jdk.nashorn.internal.parser.Scanner;

/**
 * 1301150007
 * @author Alwi faisal
 */
public class PrimeNumber{
    
  

/**
 *
 * @author Alwi faisal
     * @param args
 */
       

    public static void main(String[] args) {
        
        Scanner masukkan = new Scanner(System.in);
        System.out.println(" input bilangan : ");
        
        int bil = masukkan.nextInt();
        boolean bilanganprima = true;
        for (int i=2; i<bil; i++){
            if ((bil % i)== 0) {
               bilanganprima =false;break;
            }
            }
        if (bilanganprima)
            System.out.println(bil + "merupakan bilangan prima ");
        else
            System.out.println(bil + "merupakan bukan bilangan prima");
        }
    }