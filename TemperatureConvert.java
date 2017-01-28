/*
* Diah Ajeng Dwi Yuniasih
* 1301154558
* IF-39-12
*/

import java.util.Scanner;

public class TemperatureConvert {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pil, x;
		float nil, hasil;

		do {
			System.out.print("Choice \n");
			System.out.print("1. R\n");
			System.out.print("2. F\n");
			System.out.print("3. K\n");
			System.out.print("4. Exit\n");
			System.out.print("Choose : ");
			pil = input.nextInt();
						
			switch(pil) {
			case 1 :
			
				System.out.print("Input temperature (Celcius) : ");
				nil = input.nextFloat();
				
				System.out.print("Result : ");
				
				hasil = (nil * 4/5);
				System.out.println("\nCelcius to Reamur : " + hasil + "\n");
				break;
			case 2 :
			
				System.out.print("Input temperature (Celcius) : ");
				nil = input.nextFloat();
				
				System.out.print("Result : ");
				
				hasil = (nil * 9/5 + 32);
				System.out.println("\nCelcius to Fahrenheit : " + hasil + "\n");
				break;
			case 3 :
			
				System.out.print("Input temperature (Celcius) : ");
				nil = input.nextFloat();
				
				System.out.print("Result : ");
				
				hasil = (nil + 273);
				System.out.println("\nKelvin to Fahrenheit : " + hasil + "\n");
				break;
			default:
				break;
			}
		
		} while(pil == 1 || pil == 2 || pil == 3);
	}
}