//Nama 		: Fachri Ul Albab
//NIM		: 1301140151
//Kelas		: IF-38-01

import java.util.Scanner;

class TemperatureConvert {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan suhu yang akan dikonvert (C): ");
		celcius = input.nextInt();
		double fahrenheit = celcius*1.8+32;
		double reamur = celcius*0.8;
		double kelvin = celcius+273.15;
		System.out.println("Konversi suhu ke ? :");
		System.out.println("==========================");
		System.out.println("1. Fahrenheit ");
		System.out.println("2. Reamur ");
		System.out.println("3. Kelvin");
		System.out.println();
		{
			System.out.print("Pilihan : ");
			char pilih = input.next().charAt(0);
			switch(pilih)
			{
				case '1' : 
				{
					System.out.println("Fahrenheit : " + fahrenheit);
					break;
				}
				case '2' : 
				{
					System.out.println("Reamur : " + reamur);
					break;
				}
				case '3' : 
				{
					System.out.println("Kelvin : " + kelvin);
					break;
				}
			}
		}
	}