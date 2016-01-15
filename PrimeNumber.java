/*
Name  : Rizkiyana Prima Putra
Class : IF - 38 - 01
NIM   : 1301140181
*/

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int bil, factor;

		Scanner bilangan = new Scanner(System.in);

		System.out.print("Masukkan bilangan positif : ");
		bil = bilangan.nextInt();

		factor = 0;
		for (int i = 1; i <= bil; i++) {
			if (bil % i == 0) {
				factor++;
			}
		}
		if (factor == 2) {
			System.out.print(bil + " adalah Bilangan Prima");
		}
		else
			System.out.print(bil + " bukan Bilangan Prima");
	}
}
