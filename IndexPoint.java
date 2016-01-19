//Nama 		: Febby Febriansyah
//NIM		  : 1301140371
//Kelas		: IF-38-01
//Program	: IndexPoint.java

import java.util.Scanner;

class IndexPoint{
	public static void main(String args[]){
		float uts,uas,quiz,hasil;
		
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("Program Index Point");
		System.out.println("===================");
		System.out.println();
		System.out.print("Masukkan Nilai UTS  = ");
		uts = in.nextFloat();
		System.out.print("Masukkan Nilai UAS  = ");
		uas = in.nextFloat();
		System.out.print("Masukkan Nilai Kuis = ");
		quiz = in.nextFloat();
		
		hasil = uts*0.35f+uas*0.4f+quiz*0.25f;
		if (hasil >= 0 && hasil<=49) {System.out.println("Score : "+hasil);System.out.println("Grade : failed");}
		else if(hasil >= 50 && hasil<=64) {System.out.println("Score : "+hasil);System.out.println("Grade : accepted");}
		else if(hasil >= 65 && hasil<=74) {System.out.println("Score : "+hasil);System.out.println("Grade : good");}
		else if(hasil >= 75 && hasil<=84) {System.out.println("Score : "+hasil);System.out.println("Grade : very good");}
		else if(hasil >= 85 && hasil<=100) {System.out.println("Score : "+hasil);System.out.println("Grade : excellent");}
		else{System.out.println("Nilai Salah");}
	}
}
