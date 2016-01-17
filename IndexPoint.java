/* Nama  : Muhammad Hariz Arasy
   NIM   : 1301140259
   Kelas : IF-38-09 */
   
import java.util.Scanner;
   
   public class IndexPoint {
	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Input mid-term score (UTS)\t: ");
		double uts = masukan.nextDouble();
		System.out.print("Input end-term score (UAS)\t: ");
		double uas = masukan.nextDouble();
		System.out.print("Input Quiz score\t\t: ");
		double quiz = masukan.nextDouble();
		
		double finalScore = 0.35 * uts + 0.4 * uas + 0.25 * quiz;
		
		System.out.println("\nFinal Score: " + (int)(finalScore * 100) / 100.0);
		if (finalScore < 50.0)
			System.out.println("Grade: Failed.");
		else if (finalScore < 65.0)
			System.out.println("Grade: Accepted.");
		else if (finalScore < 75.0)
			System.out.println("Grade: Good.");
		else if (finalScore < 85.0)
			System.out.println("Grade: Very Good.");
		else
			System.out.println("Grade: Excellent.");
	}
}