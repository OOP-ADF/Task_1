/*Name: Amalya Citra Pradana
Student ID: 1301140389
Class: IF-38-09
*/

import java.util.Scanner;

public class PrimeNumber{
	public static void main (String[] args){

		int angka;
		int jumlahfaktor=0;

		Scanner in = new Scanner(System.in);
	
		System.out.println("BILANGAN PRIMA");
		System.out.print("Cek bilangan prima dengan memasukkan angka: ");
	
		angka = in.nextInt();
	
		for (int i= 1; i<= angka; i++){
			if (angka % i == 0) {jumlahfaktor = jumlahfaktor + 1;}
				else {jumlahfaktor=jumlahfaktor + 0;}
		}
		if (jumlahfaktor==2){System.out.print(angka + " adalah bilangan prima ");}
			else {System.out.println(angka + " bukan bilangan prima ");}
	}
}
