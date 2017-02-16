/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

import java.util.Scanner;
/**
 *
 * @author rizkiaulia
 */
public class BilanganPrima 
{
     public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.print("Masukkan Angka: ");
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
            System.out.print("Angka yang Anda masukkan bukan bilangan prima ");

    else 
        if (prima)

            System.out.print("Angka yang Anda masukkan bilangan prima ");
    else

            System.out.print("Angka yang Anda masukkan bukan bilangan prima ");
    
    }
    
  
}

