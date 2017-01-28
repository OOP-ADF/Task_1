/*
*PROGRAM TEMPERATURECONVERT
*
* write a java program that ask user an input of integer and determine whether the number is prime or not
* write the output
*
*Developed by Gabe Dimas Wicaksana (1301154245) - IF 3907 in Telkom University
*/

import java.util.Scanner;

class checkPrimeNumber {
    
    private int i;
    public void isPrimeNumber(int n) {
        for(i = 2; i < n; i++) {
            if(n % i == 0) {
            	System.out.println("Not Prime Number !");
                break;
            }
            else {
            	System.out.println("Prime Number !");
                break;
            }
        }
    }
}

public class PrimeNumber {
    
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        
        checkPrimeNumber p = new checkPrimeNumber();
        
        System.out.println("Input angka yang ingin dicek : ");
        n = input.nextInt();
        
        p.isPrimeNumber(n);
    }
}