/*Name: Amalya Citra Pradana
Student ID: 1301140389
Class: IF-38-09
*/

import java.util.Scanner;

public class IndexPoint{
	public static void main (String[] args){
	
		int angkauas,angkauts,angkakuis;
		double total;
	
		Scanner in = new Scanner(System.in);
	
		System.out.println("GRADE SCORE");
	
		System.out.print("Masukkan nilai UTS: ");
		angkauts = in.nextInt();
	
		System.out.print("Masukkan nilai UAS: ");
		angkauas = in.nextInt();
	
		System.out.print("Masukkan nilai Quiz: ");
		angkakuis = in.nextInt();
	
		total=((0.35*angkauts)+(0.4*angkauas)+(0.25*angkakuis));
	
		if ((total<=100) && (total>=85)) {System.out.println("Grade Anda: Excellent");}
			else if ((total<85) && (total>=75)) {System.out.println("Grade Anda: Very Good");}
				else if ((total<75) && (total>=65)) {System.out.println("Grade Anda: Good");}
					else if ((total<65) && (total>=50)) {System.out.println("Grade Anda: Accepted");}
						else if ((total<50) && (total>=0)) {System.out.println("Grade Anda: Failed");}
	}
}
