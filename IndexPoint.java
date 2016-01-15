/*
Name  : Rizkiyana Prima Putra
Class : IF - 38 - 01
NIM   : 1301140181
*/

import java.util.Scanner;

public class IndexPoint {
	public static void main(String[] args) {
		int kuis, uts, uas;
		double nilaiAkhir;
		String grade;

		Scanner nilai = new Scanner(System.in);

		System.out.print("Masukkan nilai KUIS : ");
		kuis = nilai.nextInt();
		System.out.print("Masukkan nilai UTS : ");
		uts = nilai.nextInt();
		System.out.print("Masukkan nilai UAS : ");
		uas = nilai.nextInt();

		nilaiAkhir = (kuis * 0.25) + (uts * 0.35) + (uas * 0.4);

		if ((nilaiAkhir >= 85) && (nilaiAkhir <= 100)) {
			grade = "Excellent";
		}
		else if ((nilaiAkhir >= 75) && (nilaiAkhir <= 84)) {
			grade = "Very Good";
		}
		else if ((nilaiAkhir >= 65) && (nilaiAkhir <= 74)) {
			grade = "Good";
		}
		else if ((nilaiAkhir >= 50) && (nilaiAkhir <= 64)) {
			grade = "Accepted";
		}
		else {
			grade = "Failed";
		}

		System.out.print("Your grade is " + grade);
	}
}
