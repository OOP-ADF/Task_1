/* Nama  : Muhammad Hariz Arasy
   NIM   : 1301140259
   Kelas : IF-38-09 */

import java.util.Scanner;

public class TemperatureConvert {
	public static void main(String[] args){
		Scanner inputDouble = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		System.out.print("Masukkan nilai suhu dalam satuan Celcius (misalnya 34.5) : ");
		double celcius = inputDouble.nextDouble();
		
		boolean isContinue = false;
		int pilihan1;
		int pilihan2;
		
		while (isContinue == false) {
			pilihan1 = 0;
			while ((pilihan1 != 1) && (pilihan1 != 2) && (pilihan1 !=3)) {
				System.out.print(
				"\n(1-Reamur, 2-Fahrenheit,\n" +
				" 3-Kelvin)\n" +
				"Konversi dari Celcius ke: ");
				pilihan1 = inputInt.nextInt();
				switch (pilihan1) {
					case 1:
						System.out.println(
						celcius + " \u00b0C sama dengan " +
						(int)((celcius * 4 / 5) * 100) / 100.0 +
						" \u00b0R");
					break;
					case 2:
						System.out.println(
						celcius + " \u00b0C sama dengan " +
						(int)((celcius * 9 / 5 + 32) * 100) / 100.0 +
						" \u00b0F");
					break;
					case 3:
						System.out.println(
						celcius + " \u00b0C sama dengan " +
						(int)((celcius +273) * 100) / 100.0 +
						" K");
					break;
					default: System.out.println("Error: masukan tidak valid");
				}
			}
			pilihan2 = 0;
			while ((pilihan2 != 1) && (pilihan2 != 2)) {
				System.out.print("\nKonversi ke satuan lain? (1-Ya, 2-Tidak): ");
				pilihan2 = inputInt.nextInt();
				switch (pilihan2) {
					case 1: {
					isContinue = false;
					break;
					}
					case 2: {
					isContinue = true;
					break;
					}
					default: System.out.println("Error: masukan tidak valid");
				}
			}
		}
	}
}