/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class IndexPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai UTS : ");
        int UTS = input.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int UAS = input.nextInt();
        System.out.print("Masukkan nilai Quiz: ");
        int Quiz = input.nextInt();
        double NilaiTotal = 0.35*UTS + 0.4*UAS + 0.25*Quiz;
        if (NilaiTotal >=85 && NilaiTotal<=100)
            System.out.println("Excelent");
        else if(NilaiTotal >=75 && NilaiTotal <=84)
            System.out.println("Very Good");
        else if(NilaiTotal >=65 && NilaiTotal <=74)
            System.out.println("Good");
        else if(NilaiTotal >=50 && NilaiTotal <= 64)
            System.out.println("Accepted");
        else    
            System.out.println("Failed");
    }
}
