package javaapplication4;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int a;
        int b = 0;
        
        System.out.print("Input Angka : ");
        a = cin.nextInt();
        
        for (int i = 1 ; i <= a ; i++){
            if(a % i == 0){
                b++;
            }
        }
        if ( b == 2 | b == 1) {
            System.out.println("Prima");
        }
        else{
            System.out.println("Bukan Prima");
        }
    
    }
   
}

