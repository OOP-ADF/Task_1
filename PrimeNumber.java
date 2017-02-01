/* Nama  : Faishal Wafi N
   NIM   : 1301154222
   Kelas : IF-39-12
*/

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
     Scanner cin = new Scanner(System.in);
     System.out.print("Masukan angka : ");
     int a = cin.nextInt();
     int temp = 0;
     for (int i=1; i<=a; i++)
     {
         if (a%i==0){
             temp++;
         }
     }
     if (temp==2)
     {
         System.out.println(a+ " adalah Bilangan prima");
     }else
     {
         System.out.println(a+ " Bukan bilangan prima");
     }
     }
    }
