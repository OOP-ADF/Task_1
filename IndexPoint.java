/*
 Muhammad Arif Kurniawan
 1301144091
 IF-38-01
*/
package task_1;

import java.util.Scanner;

/**
 *
 * @author Kurniawan
 */
public class IndexPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
 	System.out.print("Nilai UAS: ");  
 	int uas = input.nextInt();  
 	System.out.print("Nilai UTS: ");  
 	int uts = input.nextInt();  
 	System.out.print("Nilai Quiz: ");  
 	int quiz = input.nextInt();  
 		  
 	double N = 0.35 * uts + 0.4 * uas + 0.25 * quiz;  
 	System.out.println("Nilai akhir: " + N);  
 		  
 	if ((N>=0) & (N<=49))  
 		System.out.println("Grade: Failed");  
 	else if ((N>=50) & (N<=64))  
 		System.out.println("Grade: Accepted");  
 	else if ((N>=65) & (N<=74))  
 		System.out.println("Grade: Good");  
 	else if ((N>=75) & (N<=84))  
 		System.out.println("Grade: Very good");  
 	else if ((N>=85) & (N<=100))  
 		System.out.println("Grade: Excellent");
    }
}

