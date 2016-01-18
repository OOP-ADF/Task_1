/* 
RIZMA NURVIARELDA (1301144229)
IF-38-09
*/

import java.util.Scanner;

public class TemperatureConvert {
	public static void main (String [] args){
		double celcius;
		double reamur;
		double fahrenheit;
		double kelvin;
		int pil;
		int i = 1;
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input Suhu (Celcius): ");
		celcius = in.nextInt();
		System.out.println("");
		
		do
		{
			System.out.println("Convert Suhu ke: ");
			System.out.println("1. Reamur");
			System.out.println("2. Fahrenheit");
			System.out.println("3. Kelvin");
			System.out.print("Pilihan: ");
			pil = in.nextInt();
			System.out.println("");
			if (pil == 1)
			{
				reamur = ((4 * celcius)/5);
				System.out.println("Hasil Convert = " + reamur);
			}
			else if (pil == 2)
			{
				fahrenheit = (((9 * celcius)/5) + 32);
				System.out.println("Hasil Convert = " + fahrenheit);
			}
			else if (pil == 3)
			{
				kelvin = (celcius + 273);
				System.out.println("Hasil Convert = " + kelvin);
			}
			
			System.out.println("");
			System.out.println("Convert Suhu Lagi? Ketik 1 jika YA 0 jika TIDAK");
			System.out.print("Pilihan = ");
			i = in.nextInt();
			System.out.println("");
		}
		while (i != 0);
	}
}