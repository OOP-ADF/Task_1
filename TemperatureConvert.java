DANIA MEGA PURI MARTA
1301144322
IF 38 02

import java.util.Scanner;
public class temp {
	public static void main (String[]args) {
		double cel,hasil;
		int pil;
		Scanner input_user = new Scanner (System.in);
		String inn = "y";
		
		while (inn.equals("y") || inn.equals("Y")) {
			hasil = 0;
			System.out.print ("Masukkan Temp Celcius : ");
			cel = input_user.nextInt();
			System.out.println("=============================");
			System.out.println ("1. Konvert ke Reamur");
			System.out.println ("2. Konvert ke Farenheit");
			System.out.println ("3. Konvert ke Kelvin");
			System.out.println ("");
			System.out.print ("Pilihan : ");
			pil = input_user.nextInt();
			System.out.println("=============================");
			switch (pil) {
				case 1: 
					hasil = cel*0.8;
					System.out.println("Konvert dari "+cel+" Celcius ke Reamur adalah "+hasil);
					break;
				case 2:
					hasil = (cel*1.8)+32;
					System.out.println("Konvert dari "+cel+" Celcius ke Farenheit adalah "+hasil);
					break;
				case 3:
					hasil = cel + 273.15;
					System.out.println("Konvert dari "+cel+" Celcius ke Kelvin adalah "+hasil);
					break;
				default :
					System.out.println("Invalid input");
			}
			System.out.print("Ingin Hitung suhu lagi ? (y/n) : ");
			inn = input_user.next();
		}
	}
}