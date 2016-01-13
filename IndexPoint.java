/*
NAMA 	: Agung Rahmat Budiman
NIM		: 1301144142
Kelas	: IF-38-02
*/

import java.util.Scanner;

public class IndexPoint {
	public static void main(String[] args) {
		int uts, uas, kuis;
		double nilaiakhir;
		String grade;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nilai UTS : ");
		uts = scan.nextInt();
		System.out.print("Nilai UAS : ");
		uas = scan.nextInt();
		System.out.print("Nilai Kuis : ");
		kuis = scan.nextInt();
		nilaiakhir = (0.35*uts)+(0.4*uas)+(0.25*kuis);
		if(nilaiakhir>=85 && nilaiakhir<=100){
			grade = "excellent";
		}
		else if(nilaiakhir>=75 && nilaiakhir<=84) {
			grade = "very good";
		}
		else if(nilaiakhir>=65 && nilaiakhir<=74) {
			grade = "good";
		}
		else if(nilaiakhir>=50 && nilaiakhir<=64) {
			grade = "accepted";
		}
		else {
			grade = "failed";
		}
		
		System.out.print("Grade Anda adalah : "+grade);
	}
}