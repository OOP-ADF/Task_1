

package task2;

import java.util.Scanner;

/**
 *
 * @author RakaSetya
 */

public class Task2 {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Masukkan angka: ");
         int a = input.nextInt();
         int b = 0;
         for (int i = 1;i<=a;i++)
         {
             if (a%i==0)
                 b+=1;
         }
             
         if (b==2) 
             System.out.println("Angka yang anda Inputkan adalah Bilangan Prima");
         else
             System.out.println("Angka yang anda Inputkan adalah Bukan bilangan prima");
         
         
     }
     
 }
