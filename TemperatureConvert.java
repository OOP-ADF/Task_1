// Ferawidya Pimadevi //
// 1301140201 //
// IF - 38 - 01 //
	

import java.util.Scanner;
public class Temperaturconvert{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int pilih;
		double celcius, faren, kelv, ream;
		
		System.out.println(" Masukkan Suhu Dalam Satuan Celcius : ");
		celcius = input.nextDouble();
		System.out.println();
		
		
		System.out.println("Daftar Menu");
		System.out.println("1. Farenheit");
		System.out.println("2. Kelvin");
		System.out.println("3. Kelvin");
		System.out.println("Pilih menu : ");
		pilih = input.nextInt();
		
		switch(pilih){
			case 1 :
				faren = ( celcius*9/5)+32;
				System.out.println("Konversinya adalah = "+ faren + " Farenheit");
				break;
			case 2 :
				kelv = celcius+273.15;
				System.out.println ("Konversinya adalah = "+ kelv + " Farenheit");
				break;
			case 3 : 
				ream = celcius*4/5;
				System.out.println("Konversinya adalah = "+ ream + " Farenheit");
				break;	
		}
	}
}
