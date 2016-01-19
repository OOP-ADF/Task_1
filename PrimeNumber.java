// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String args[]) {
		Scanner inpNumber;
      inpNumber = new Scanner (System.in);
		int i, angka;
		boolean primeStatus = true;
		System.out.print("Masukkan angka : ");
		angka = inpNumber.nextInt();
		for (i = 2; i < angka; i++) {
			if (angka % i == 0) {
				primeStatus = false;
				break;
			}
		}
		if (angka == 1) {
			System.out.println("Angka yang dimasukkan merupakan bilangan prima");
		} else {
			if (primeStatus == true) {
				System.out.println("Angka yang dimasukkan merupakan bilangan prima");
			} else {
				System.out.println("Angka yang dimasukkan bukan bilangan prima");
			}
		}
		inpNumber.close();
	}
}
