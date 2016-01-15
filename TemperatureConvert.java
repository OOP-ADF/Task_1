/*
Name  : Rizkiyana Prima Putra
Class : IF - 38 - 01
NIM   : 1301140181
*/

import java.util.Scanner;

public class TemperatureConvert {
	public static void main(String[] args) {
		int pil, celcius;
		double fahrenheit, kelvin, reamur;

		Scanner suhu = new Scanner(System.in);
		Scanner pilihan = new Scanner(System.in);

		System.out.print("Input suhu dalam Celcius : ");
		celcius = suhu.nextInt();

		fahrenheit = (((9 / 5) * celcius) + 32);
		kelvin = (celcius + 273);
		reamur = (0.8 * celcius);

		pil = 0;
		while (pil == 0) {
			System.out.println("1. Convert to Fahrenheit");
			System.out.println("2. Convert to Kelvin");
			System.out.println("3. Convert to Reamur");
			System.out.println("4. Exit Program");
			System.out.print("Masukkan pilihan : ");
			pil = pilihan.nextInt();
			switch(pil) {
				case 1 : System.out.println("Result : " + fahrenheit + " F");
						 pil = 0;
						 break;
				case 2 : System.out.println("Result : " + kelvin + " K");
						 pil = 0;
						 break;
				case 3 : System.out.println("Result : " + reamur + " R");
						 pil = 0;
						 break;
				case 4 : System.out.println("SELESAI.....");
						 break;
				default : System.out.println("Pilihan tidak tersedia");
						 pil = 0;
						 break;
			}
		}
	}
}
