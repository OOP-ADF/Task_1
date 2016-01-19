// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

import java.util.Scanner;

public class IndexPoint {
	public static void main (String[] args) {
		Scanner inpNilai;
      inpNilai = new Scanner (System.in);
		int uts, uas, quiz;
		float finalScore;
		System.out.print("Masukkan nilai UTS : ");
		uts = inpNilai.nextInt();
		System.out.print("Masukkan nilai UAS : ");
		uas = inpNilai.nextInt();
		System.out.print("Masukkan nilai Quiz : ");
		quiz = inpNilai.nextInt();
		finalScore = (float) ((0.35*uts) + (0.4*uas) + (0.25*quiz));
		if (finalScore < 50) {
      System.out.println("You failed this semester!");
    } else if (finalScore < 65) {
      System.out.println("You passed this semester with ACCEPTABLE grade!");
    } else if (finalScore < 75) {
      System.out.println("You passed this semester with GOOD grade!");
    } else if (finalScore < 85) {
      System.out.println("You passed this semester with VERY GOOD grade!");
    } else if (finalScore <= 100) {
      System.out.println("You passed this semester with EXCELLENT grade!");
    }
		inpNilai.close();
	}
}
