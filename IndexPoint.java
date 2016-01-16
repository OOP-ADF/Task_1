/*
Name: Anita Auliani
Student ID: 1301144349
Class: IF-38-09
*/

import java.util.Scanner;

public class IndexPoint
{
	public static void main (String[] args){
	
	int nilaiUAS,nilaiUTS,nilaiKUIS;
	double totalNilai;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Status Grade Nilai");
	
	System.out.print("Masukkan Nilai UTS Anda : ");
	nilaiUTS = input.nextInt();
	
	System.out.print("Masukkan Nilai UAS Anda : ");
	nilaiUAS = input.nextInt();
	
	System.out.print("Masukkan Nilai Kuis Anda : ");
	nilaiKUIS = input.nextInt();
	
	totalNilai = ((0.35*nilaiUTS)+(0.4*nilaiUAS)+(0.25*nilaiKUIS));
	
	if ((totalNilai<50) && (totalNilai>=0)) {System.out.println("Status Grade Nilai : Failed");}
		else if ((totalNilai<65) && (totalNilai>=50)) {System.out.println("Status Grade Nilai : Accepted");}
			else if ((totalNilai<75) && (totalNilai>=65)) {System.out.println("Status Grade Nilai : Good");}
				else if ((totalNilai<85) && (totalNilai>=75)) {System.out.println("Status Grade Nilai : Very Good");}
					else if ((totalNilai<=100) && (totalNilai>=85)) {System.out.println("Status Grade Nilai : Excellent");}
	}
}
