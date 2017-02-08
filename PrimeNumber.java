/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;


import java.util.Scanner;


/**
 *
 * @author made rama_1301154203
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Input = new Scanner (System.in);
        System.out.print("Masukkan bilangan : ");
        int angka = Input.nextInt();
        
        boolean prima = true;
        for (int p=2 ; p < angka ; p++ )
        {
            if ((angka % p ) == 0)
            {
                 prima = false; 
                 break;  
            }   
        }
        
    if (angka == 1) 
            System.out.print("Bilangan yang Anda masukkan ini bukan bilangan prima ");
    else 
        if (prima)
            System.out.print("Bilangan yang Anda masukkan ini adalah bilangan prima ");
    else
            System.out.print("Bilangan yang Anda masukkan ini bukan bilangan prima ");
    
    }
    
}

