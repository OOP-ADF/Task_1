/* 
Rana Renes Rengga (1301144351)
IF-38-01*/

import java.util.Scanner;

public class TemperatureConvert
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan temperatur dalam Celcius: ");
		int suhu  = input.nextInt();
		System.out.println("===================================");	
		System.out.println("Ubah ke:");
		System.out.println("1. Reamur");
		System.out.println("2. Kelvin");
		System.out.println("3. Fahrenheit");
		System.out.println("===================================");
		System.out.println("Pilih 1/2/3?");
		int menu = input.nextInt();
		String lagi = input.next();
				
		switch(menu)
		{
			case 1: 
				double reamur = 0.8 * suhu;
				System.out.println("Suhu dalam Reamur adalah " + reamur);
				break;
			case 2: 
				double kelvin = suhu + 273.15;
				System.out.println("Suhu dalam Kelvin adalah " + kelvin);
				break;
			case 3: 
				double fahrenheit = (suhu * 1.8) + 32;
				System.out.println("Suhu dalam Fahrenheit adalah " + fahrenheit);
				break;
			default: 
				System.out.println("Tidak tersedia");
				break;
		}
	}
}	