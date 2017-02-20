package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author rakasetya
 */
 
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai UTS : ");
        int UTS = input.nextInt();
        System.out.print("masukkan nilai UAS : ");
        int UAS = input.nextInt();
        System.out.print("masukkan nilai Quiz: ");
        int Quiz = input.nextInt();
        double NilaiKeseluruhan = 0.35*UTS + 0.4*UAS + 0.25*Quiz;
        if (NilaiKeseluruhan >=85 && NilaiKeseluruhan<=100)
            System.out.print("Excelent");
        else if(NilaiKeseluruhan >=75 && NilaiKeseluruhan <=84)
            System.out.print("Very Good");
        else if(NilaiKeseluruhan >=65 && NilaiKeseluruhan <=74)
            System.out.print("Good");
        else if(NilaiKeseluruhan >=50 && NilaiKeseluruhan <= 64)
            System.out.print("Accepted");
        else    
            System.out.print("Failed");
    }
}

