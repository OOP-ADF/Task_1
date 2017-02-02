/*Nama		: Muhammad Rakha
 * Nim		: 1301154124
 * Kelas	: IF 39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Scanner;

/**
 *
 * @author Alienware
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner (System.in);
        System.out.print("Input : ");
        a=input.nextInt();
        
        if (a % 2 == 0) {
            System.out.println("Bukan Bilangan Prima");
    }
        else if ((a % 3==0 ) && (a!=3)){
        System.out.println("Bukan Bilangan prima");
    }
    else {
                System.out.println("Bilangan Prima");
                }
        
  }
    
}
