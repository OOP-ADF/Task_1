import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Nama: Adam Geraldy Katab
 * NIM: 1301140381
 * Kelas: IF-38-01
 */

public class PrimeNumber {
	static final String NOT_INTEGER = "Angka yang anda masukkan bukan integer!";

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		while(true) {
			System.out.println("Masukkan sebuah angka: (99999 untuk keluar) ");
			int input = 0;
			try {
				input = inputNumber.nextInt();
			} catch (InputMismatchException e) {
				showError(NOT_INTEGER);
				inputNumber.nextLine();
				continue;
			}
			if(input == 99999) break;
			
			System.out.println(isPrime(input)? "Angka yang dimasukkan adalah bilangan prima!":
												"Angka yang dimasukkan bukan bilangan prima!");
			
			System.out.println("Angka yang dimasukkan: " + input);
		}
		inputNumber.close();
	}

	private static void showError(String errorMessage) {
		System.out.println(errorMessage);
	}
	
	private static boolean isPrime(int inputNumber) {
		boolean primeStatus = true;
		int lastIter = (int) Math.sqrt(inputNumber)+1;
		for(int i = 2; i < lastIter; i++) {
			if(inputNumber % i == 0) {
				primeStatus = false;
				break;
			}
		}
		return primeStatus;
	}
}