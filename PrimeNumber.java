/* Nama		: M.Widadio Ilham 
  * Nim		: 1301154306
  * Kelas	: IF 39-12
  
 
  */
 import java.util.Scanner;
 
 public class PrimeNumber {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("Masukkan Angka Yang Ingin Anda Periksa : ");
     int n = input.nextInt();
     int x = 0;
     for (int a = 1; a < n; a++ )
     {
         if ((n % a) == 0)
        {
             x++;
         }
     }
     if ( x == 1)
     {
         System.out.print(" Bilangan tersebut adalah BILANGAN PRIMA ");
     }else
     {
        System.out.print("Bilangan tersebut BUKAN MERUPAKAN BILANGAN PRIMA ");
         
     }  
   }
 }
