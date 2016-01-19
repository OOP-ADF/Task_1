/*
Name        : Adi Nugroho
Student ID  : 1301144271
Class       : IF-38-01
*/
package task_1.pkg1;
import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Input Mid-Term (UTS) Score : ");
        int uts = input.nextInt();
        System.out.println("Input End-Term (UAS) Score : ");
        int uas = input.nextInt();
        System.out.println("Input Quiz Score : ");
        int quiz = input.nextInt();
        
        double total = 0.35 * uts + 0.4 * uas + 0.25 * quiz;
        System.out.println("Total Score is " + total);
        
        if ((total >=85) & (total<=100))
            System.out.println("Grade: Excellent");
        else if ((total>=75) & (total<=84))
            System.out.println("Grade: Very good");
        else if ((total>=65) & (total<=74))
            System.out.println("Grade: Good");
        else if ((total>=50)& (total>=64))
            System.out.println("Grade: Accepted");
        else if ((total>=0) & (total<=49))
            System.out.println("Grade: Failed"); 
    }     
}

