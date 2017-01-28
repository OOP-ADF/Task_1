/*
* Diah Ajeng Dwi Yuniasih
* 1301154558
* IF-39-12
*/

import java.util.Scanner;

public class IndexPoint {
	
	public static void main(String[] args){
		
		double nilaiAkhir;
		
		Scanner uts = new Scanner(System.in);
		System.out.println("Enter Mid Term Score (UTS) : ");
		int bil1 = uts.nextInt();
		
		Scanner uas = new Scanner(System.in);
		System.out.println("Enter End Term Score (UAS) : ");
		int bil2 = uas.nextInt();
		
		Scanner kuis = new Scanner(System.in);
		System.out.println("Enter Quiz Score           : ");
		int bil3 = uas.nextInt();
		
		nilaiAkhir = (0.35*bil1)+(0.4*bil2)+(0.25*bil3);
		if (nilaiAkhir>=85 && nilaiAkhir<=100)
			System.out.println("Your Score is " + nilaiAkhir + " and your grade is excellent ");
		else if (nilaiAkhir>=75 && nilaiAkhir<=84)
			System.out.println("Your Score is " + nilaiAkhir + " and your grade is very good ");
		else if (nilaiAkhir>=65 && nilaiAkhir<=74)
			System.out.println("Your Score is " + nilaiAkhir + " and your grade is good ");
		else if (nilaiAkhir>=50 && nilaiAkhir<=64)
			System.out.println("Your Score is " + nilaiAkhir + " and your grade is accepted ");
		else
			System.out.println("Your Score is " + nilaiAkhir + " and your grade is failed ");
	}
}
