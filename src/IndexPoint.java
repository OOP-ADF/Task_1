import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Nama: Adam Geraldy Katab
 * NIM: 1301140381
 * Kelas: IF-38-01
*/

public class IndexPoint {
	private static double uts = 0, uas = 0, kuis = 0, finalScore = 0;
	private static Scanner inputNilai;
	
	public static void main(String[] args) {
		inputNilai = new Scanner(System.in);

		inputUts();
		inputUas();
		inputKuis();
		
		inputNilai.close();
		
		countFinalScore();
		
		if(getFinalScore() < 50)
			System.out.println("You FAILED the class!");
		else if(getFinalScore() < 65) {
			System.out.println("You passed the class with an ACCEPTED grade!");
		}
		else if(getFinalScore() < 75) {
			System.out.println("You passed the class with a GOOD grade!");
		}
		else if(getFinalScore() < 85) {
			System.out.println("You passed the class with a VERY GOOD grade!");
		}
		else System.out.println("You passed the class with an EXCELLENT grade!");
		System.out.println("[SCORE]: " + finalScore);
	}
	
	private static void countFinalScore() {
		finalScore = getUts() * 35/100 + getUas() * 40/100 + getKuis() * 25/100;
	}

	private static void inputUts() {
		try {
			System.out.print("Masukkan nilai UTS anda: ");
			uts = inputNilai.nextDouble();
		} catch (InputMismatchException e) {
			inputNilai.nextLine();
			inputUts();
		}
	}
	
	private static void inputUas() {
		try {
			System.out.print("Masukkan nilai UAS anda: ");
			uas = inputNilai.nextDouble();
		} catch (InputMismatchException e) {
			inputNilai.nextLine();
			inputUas();
		}
	}
	
	private static void inputKuis() {
		try {
			System.out.print("Masukkan nilai kuis anda: ");
			kuis = inputNilai.nextDouble();
		} catch(InputMismatchException e) {
			inputNilai.nextLine();
			inputKuis();
		}
	}
	
//	Getter di bawah ini private karena tidak ada kelas lain yang akan manggil method-method ini.
	private static double getUts() {
		return uts;
	}
	
	private static double getUas() {
		return uas;
	}
	
	private static double getKuis() {
		return kuis;
	}
	
	private static double getFinalScore() {
		return finalScore;
	}
}