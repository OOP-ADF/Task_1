/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int x = input.nextInt();
        int y = 0;
        for (int i = 1;i<=x;i++)
        {
            if (x%i==0)
                y+=1;
        }
            
        if (y==2) 
            System.out.println("Bilangan Prima");
        else
            System.out.println("Bukan bilangan prima");
        
        
    }
    
}
