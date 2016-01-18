// Agung Suhendar - 1301140279 - IF3809

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int bil;
		int cek=1;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Masukkan nilai : ");
		bil = n.nextInt();
		
		for (int i=2; i<bil; i++) {
			if (bil%i==0) {
				cek = 0;
			}
		}
		if (cek==1) {
			System.out.println("Bilangan tersebut bilangan prima");
		}
		else {
			System.out.println("Bilangan tersebut bukan bilangan prima");
		}
	}
}
