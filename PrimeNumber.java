/*
 Setyo Haryo A
 1301144059 
 IF-38-09
 */
package primenumber;

import java.util.Scanner;


/**
 *
 * @author Setyo
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        // TODO code application logic here
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

