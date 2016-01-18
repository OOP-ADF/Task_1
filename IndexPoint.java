// Agung Suhendar - 1301140279 - IF3809

import java.util.Scanner;

public class IndexPoint {
	public static void main(String[] args) {
		double uts;
		double uas;
		double quiz;
		double total;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Masukkan nilai uts : ");
		uts = n.nextInt();
		System.out.print("Masukkan nilai uas : ");
		uas = n.nextInt();
		System.out.print("Masukkan nilai quiz : ");
		quiz = n.nextInt();
		
		total = 0.35 * uts + 0.4 * uas + 0.25 * quiz;
		
		
		System.out.println("Hasil : " + (int)(total * 100) / 100.0);
		
		if ((total >= 85) && (total <= 100)) {
			System.out.println("excellent");
		}
		else if (total >= 75) {
			System.out.println("very good");
		}
		else if (total >= 65) {
			System.out.println("good");
		}
		else if (total >= 50) {
			System.out.println("accepted");
		}
		else if (total >= 0) {
			System.out.println("failed");
		}
	}
} 