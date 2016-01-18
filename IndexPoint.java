/* 
RIZMA NURVIARELDA (1301144229)
IF-38-09
*/

import java.util.Scanner;

public class IndexPoint {
	public static void main (String [] args){
		int uts;
		int uas;
		int quiz;
		double score;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("MidTerm Score: ");
		uts = in.nextInt();
		System.out.print("EndTerm Score: ");
		uas = in.nextInt();
		System.out.print("Quiz Score: ");
		quiz = in.nextInt();
		
		System.out.println("");
		score = ((0.35 * uts) + (0.4 * uas) + (0.25 * quiz));
		System.out.print("Final Score: " + score);
		System.out.println("");
		
		if (score >= 85)
		{
			System.out.println("Grade: Excellent");
		}
		else if ((score >= 75) && (score < 85))
		{
			System.out.println("Grade: Very Good");
		}
		else if ((score >= 65) && (score < 75))
		{
			System.out.println("Grade: Good");
		}
		else if ((score >= 50) && (score < 65))
		{
			System.out.println("Grade: Accepted");
		}
		else
		{
			System.out.println("Grade: Failed");
		}
	}
}