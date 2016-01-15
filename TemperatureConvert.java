/*
NAMA 	: Agung Rahmat Budiman
NIM		: 1301144142
Kelas	: IF-38-02
*/

import java.util.Scanner;

public class TemperatureConvert {
	public static void main(String[] args) {
		char pil,pil2;
		double celcius,reamur,fahrenheit,kelvin;
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Masukkan suhu dalam celcius : ");
		celcius = scan.nextDouble();
		reamur = 0.8*celcius;
		fahrenheit = (1.8*celcius)+32;
		kelvin = celcius+273;
		do {
			System.out.println("Diubah ke");
			System.out.println("1.Fahrenheit");
			System.out.println("2.Reamur");
			System.out.println("3.Kelvin");
			System.out.print("Pilihan anda : ");
			pil = scan2.next().charAt(0);
			System.out.print("hasil konversi : ");
			switch(pil) {
				case '1' :
					System.out.println(fahrenheit+" Fahrenheit");
					break;
				case '2' :
					System.out.println(reamur+" Reamur");
					break;
				case '3' :
					System.out.println(kelvin+" Kelvin");
					break;
			}
			System.out.println();
			System.out.print("Masih ingin diubah ke bentuk lain (y/n)?  : ");
			pil2 = scan2.next().charAt(0);
			System.out.println();	
		}while(pil2!='n');
	}
}