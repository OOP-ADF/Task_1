//Nama 		: Fachri Ul Albab
//NIM		: 1301140151
//Kelas		: IF-38-01

import java.util.Scanner;

class IndexPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
		int quiz,uts,uas;
		double nilai;
		
		System.out.print("Masukkan Nilai Quiz: ");  
		quiz = input.nextInt();  
		System.out.print("Masukkan Nilai UTS: ");  
		uts = input.nextInt();  
		System.out.print("Masukkan Nilai UAS: ");  
		uas = input.nextInt();  
		
 		  
		nilai = 0.35 * uts + 0.4 * uas + 0.25 * quiz;  
		System.out.println("Nilai akhir: " + nilai);  
			  
		if ((nilai>=0) & (nilai<=49))  
			System.out.println("Grade: Failed");  
		else if ((nilai>=50) & (nilai<=64))  
			System.out.println("Grade: Accepted");  
		else if ((nilai>=65) & (nilai<=74))  
			System.out.println("Grade: Good");  
		else if ((nilai>=75) & (nilai<=84))  
			System.out.println("Grade: Very good");  
		else if ((nilai>=85) & (nilai<=100))  
			System.out.println("Grade: Excellent");
    }
}