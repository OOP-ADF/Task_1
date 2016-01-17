DANIA MEGA PURI MARTA
1301144322
IF 38 02

import java.util.Scanner;
public class midscore {
	public static void main (String[]args) {
		double uts,uas,quiz,total;
		Scanner input_user = new Scanner (System.in);
		
		System.out.print ("Masukkan Nilai UTS : ");
		uts = input_user.nextDouble();
		System.out.print ("Masukkan Nilai UAS : ");
		uas = input_user.nextDouble();
		System.out.print ("Masukkan Nilai Quis : ");
		quiz = input_user.nextDouble();
		total = (0.35*uts)+(0.4*uas)+(0.25*quiz);
		System.out.println("Nilai Akhir : "+total);
		if (total >= 85) {
			System.out.println("Grade : Excellent");
		}
		else if (total >= 75 && total <=84) {
			System.out.println("Grade : Very Good");
		}
		else if (total >= 65 && total <=74) {
			System.out.println("Grade : Good");
		}
		else if (total >= 50 && total <=64) {
			System.out.println("Grade : Accepted");
		}
		else {
			System.out.println("Grade : Failed");
		}
	}
}
