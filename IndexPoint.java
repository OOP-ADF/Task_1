/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexpoint;
import java.util.Scanner;

/**
 *
 * @Author      : Rizky Muhammad Rifai
 * @Student ID  : 1301144019
 * @Class       : IF-38-09
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double z;
        double w;
        System.out.print("Mid-term Score : ");
        x = input.nextInt();
        System.out.print("End-term Score : ");
        y = input.nextInt();
        System.out.print("Quiz score : ");
        z = input.nextInt();
        w = x/100*35 + y/100*40 + z/100*25;
        if (w >= 85) 
                System.out.println("Grade : Excellent");
        else if ((w >= 75) && (w <= 84))
                System.out.println("Grade : Very Good");
        else if ((w >= 65) && (w <= 74))
                System.out.println("Grade : Good");        
        else if ((w >= 50) && (w <= 64))
                System.out.println("Grade : Accepted");
        else if ((w >= 0) && (w <= 49))
                System.out.println("Grade : Failed");        
    }
    
}
