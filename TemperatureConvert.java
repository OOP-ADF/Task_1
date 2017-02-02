package javaapplication5;

import java.util.Scanner;

public class Temperature {


    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        double a = 0, b;
        int c;
        
        System.out.print("Suhu dalam Celcius : ");
        b = cin.nextDouble();
        
        Scanner cinString = new Scanner(System.in);
        System.out.println("1.Reamur");
        System.out.println("2.Farenheit");
        System.out.println("3.Kelvin");
        c = cinString.nextInt();
        
        if (c == 1){
            b = 0.8*a;
            System.out.println("Hasil : " + b );
                    }
        else if (c == 2){
            b = (1.8*a) + 32;
            System.out.println("Hasil : " + b );
        }
        else if (c == 3){
            b = a + 273;
            System.out.println("Hasil : " + c );
        }
        else{
            System.out.println("Input Salah");
        }
               
    }
    
}
