/* 
Rana Renes Rengga (1301144351)
IF-38-01*/

import java.util.Scanner;

public class IndexPoint
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Nilai UAS: ");
		int uas = input.nextInt();
		System.out.println("Nilai UTS: ");
		int uts = input.nextInt();
		System.out.println("Nilai Quiz: ");
		int quiz = input.nextInt();
		
		double final_score = 0.35 * uts + 0.4 * uas + 0.25 * quiz;
		System.out.println("Nilai akhir: " + final_score);
		
		if ((final_score>=0) & (final_score<=49))
			System.out.println("Failed");
		else if ((final_score>=50) & (final_score<=64))
			System.out.println("Accepted");
		else if ((final_score>=65) & (final_score<=74))
			System.out.println("Good");
		else if ((final_score>=75) & (final_score<=84))
			System.out.println("Very good");
		else if ((final_score>=85) & (final_score<=100))
			System.out.println("Excellent");
	}
}