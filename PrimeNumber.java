package primenumber;
 
import java.util.Scanner;
 
 public class PrimeNumber {
 
    
     public static void main(String [] args) {
        
         int a;
         int b;
         int c;
         Scanner s = new Scanner(System.in);
         
         c = 0;
         System.out.println("Masukkan bilangan : ");
         a = s.nextInt();
         
         for (b=1;b<=a;b++)
         {
             if (a%b == 0)
             {
                 c++;
             }
         
         }
         if ( c == 2)
         {
             System.out.println("bilangan yang anda masukkan bilangan prima");
         }
         else
         {
             System.out.println("bilangan yang anda aasukkan bukan bilangan prima");
         }
     }
 }
