/*
Name: Anita Auliani
Student ID: 1301144349
Class: IF-38-09
*/

import java.util.Scanner;

public class TemperatureConvert
{
	public static void main (String[] args){
		double bilangan,hasilnya;
		int menuPilih, balikPilih;
		int balik=1;
		Scanner input = new Scanner(System.in);
		
		while (balik == 1) {
			System.out.println("TemperatureConvert");
			System.out.print("Masukkan suhu dalam bentuk Celcius : ");
			bilangan = input.nextInt();
			balik=0;
			while (balik == 0)
			{
				System.out.println("Menu : ");
				System.out.println("1. Fahrenheit");
				System.out.println("2. Reamur");
				System.out.println("3. Kelvin");
				System.out.println("Pilih Menu ke- : ");
				menuPilih = input.nextInt();
				
				switch(menuPilih){
					case 1: 
						hasilnya= ((bilangan*(1.8))+32);
						System.out.println("Suhu Fahrenheit : " + hasilnya);
						balik = 0;
						break;
					case 2: 
						hasilnya= (bilangan*(0.8));
						System.out.println("Suhu Reamur : " + hasilnya);
						balik = 0;	
						break;
					case 3: 
						hasilnya= (bilangan+273.15);
						System.out.println("Suhu Kelvin : " + hasilnya);
						balik = 0;
						break;
			}
		}
	}
}
}