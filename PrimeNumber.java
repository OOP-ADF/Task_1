/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;
import java.util.Scanner;

/**
 *
 * @Author      : Rizky Muhammad Rifai
 * @Student ID  : 1301144019
 * @Class       : IF-38-09
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int x;
        int y = 0;
        System.out.print("Input nilai : ");
        x = input.nextInt();
        for(int i=1; i<=x; i++) {
            if (x%i == 0)
                y = y+1;
        }
        if (y == 2)
            System.out.println("Primer Number");
        else
            System.out.println("Not Primer Number");
    }   
}

