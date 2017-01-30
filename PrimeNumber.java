
/*
 * write a java program that ask user an input of integer and determine whether the number is prime or not
 * write the output
 */

import java.util.Scanner;

/**
 *
 * @author Christian Janifer
 */
public class PrimeNumber {
    
    private static int i,x,bil;
    static Scanner in = new Scanner(System.in);
    
    public void primenumber(int n){
        x = 0;
        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
            x++;
        }

        if(x == 2)
        System.out.println("Is Prime Number");
        else
        System.out.println("Is Not Prime Number");
}
    
    
    public static void main(String[] args) {
       
       PrimeNumber PN = new PrimeNumber();
       System.out.print("Input Bilangan Yang Ingin diuji: ");
       bil = in.nextInt();
       PN.primenumber(bil);
    }  
}