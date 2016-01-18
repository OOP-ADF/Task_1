/* Nama	: Windy Israniati Jihan
NIM		: 1301144309
Kelas	: IF-38-09 */

import java.util.Scanner;
public class IndexPoint {
	public static void main (String args[]) {
		Scanner masukan = new Scanner(System.in);
		double uts;
		double uas;
		double quis;
		double akhir;
		System.out.println("Masukkan Nilai UTS : ");
		uts = masukan.nextDouble();
		System.out.println("Masukkan Nilai UAS : ");
		uas = masukan.nextDouble();
		System.out.println("Masukkan Nilai Quis : ");
		quis = masukan.nextDouble();
		akhir = (0.35 * uts) + (0.4 * uas) + (0.25 * quis);
		System.out.println("Nilai akhir = "+akhir);
		if (akhir>=0 & akhir <=49) {
		System.out.println("Failed");}
		if (akhir>=50 & akhir<=64) {
		System.out.println("Accepted");}
		if (akhir>=65 & akhir<=74){
		System.out.println("Good");}
		if (akhir>=75 & akhir<=84){
		System.out.println("Very Good");}
		if (akhir>=85 & akhir<=100) {
		System.out.println("Exellent");}
		
	}
}
