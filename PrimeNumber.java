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
    
    private int x,y;
    public void isPrimeNumber(int angka) {
        for(x = 1; x < angka; x++) {
            if(angka % x == 0) {
                y++;
            }
        }
        
        if (y == 2) {
            System.out.println("Bilangan Prima !");
        }
        else {
            System.out.println("Bukan Bilangan Prima !");
        }
    }
}

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        int angka;
        Scanner input = new Scanner(System.in);
        checkPrimeNumber p = new checkPrimeNumber();
        
        System.out.print("Input angka yang ingin dicek : ");
        angka = input.nextInt();
        
        p.isPrimeNumber(angka);
    }
}