 // Reza Aryadi - 1301144179 - IF3809
 
import java.util.Scanner;

 public class IndexPoint {
 	public static void main(String[] args) {
		int uts;
		int uas;
		int quiz;
		float total;
 		Scanner n = new Scanner(System.in);
 		
		System.out.print("Masukkan nilai uts : ");
		uts = n.nextInt();
		System.out.print("Masukkan nilai uas : ");
		uas = n.nextInt();
		System.out.print("Masukkan nilai quiz : ");
		quiz = n.nextInt();
		total = ((35/100 * uts) + (40/100 * uas) + (25/100 * quiz));
		System.out.println("Hasil : " + (int)(total * 100) / 100.0);
 		
 		if ((total <= 100) && (total >= 85)) {
 			System.out.println("Excellent");
 		}
 		else if (total >= 75) {
 			System.out.println("Very Good");
 		}
 		else if (total >= 65) {
 			System.out.println("Good");
 		}
 		else if (total >= 50) {
 			System.out.println("Accepted");
 		}
 		else if (total >= 0) {
 			System.out.println("Failed");
 		}
 	}
 } 