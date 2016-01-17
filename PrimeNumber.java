/* Nama  : Muhammad Hariz Arasy
   NIM   : 1301140259
   Kelas : IF-38-09 */

import java.util.Scanner;
   
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
		System.out.print("Masukkan suatu integer: ");
		int angka1 = masukan.nextInt();
		
		boolean isPrime = true;
		for(int pembagi = 2; pembagi <= angka1 / 2; pembagi++) {
			if (angka1 % pembagi == 0)
				isPrime = false;
		}
		
		if (isPrime)
			System.out.println("Angka " + angka1 + " adalah bilangan prima");
		else
			System.out.println("Angka " + angka1 + " bukan bilangan prima");
	}
}