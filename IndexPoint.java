/**
* nama : nisa nurhardini
* nim : 1301154544
* kelas : if-39-12
*/
import java.util.Scanner;

public class IndexPoint{
	public static void main (String[] args) {
		Scanner cin = new Scanner (System.in);
		System.out.print ("Masukkan Nilai UTS : ");
		int uts = cin.nextInt();
		System.out.print ("Masukkan Nilai UAS : ");
		int uas = cin.nextInt();
		System.out.print ("Masukkan Nilai Kuis : ");
		int kuis = cin.nextInt();
		
		double nakhir = (0.35*uts) + (0.4*uas) + (0.25*kuis);
		
		if (nakhir>=85 && nakhir<=100){
			System.out.print ("Excellent");
		}
		else if (nakhir>=75 && nakhir<=84){
			System.out.print ("Very Good");
		}
		else if (nakhir>=65 && nakhir<=74){
			System.out.print ("Good");
		}
		else if (nakhir>=50 && nakhir<=64){
			System.out.print ("Accepted");
		}
		else {
			System.out.print ("Failed");
		}
	}
}