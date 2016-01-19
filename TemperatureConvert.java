//nama 	 : Andhika Gilang K
//NIM 	 : 1301140361
//Kelas	 : IF-38-01
//Nama Program : TemperatureConvert.java

import java.util.Scanner;

public class TemperatureConvert
{
	public static void main (String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int celc,opt;
		System.out.print("input Temperature in Celcius : ")
		celc= inp.nextInt();
		System.out.println("1.Reamur");
		System.out.println("2.Kelvin");
		System.out.println("3.Fahrenheit");
		System.out.println("Choose Option : ");
		int opt = inp.nextInt();
		switch(pil)
		{
			case 1:
				double ream = 0.8 * celc;
				System.out.println("Reamur = "+ream);
				break;
			case 2:
				double kelv = celc+273.15;
				System.out.println("Kelvin = "+kelv);
				break;
			case 1:
				double fahren = (celc*1.8) + 32;
				System.out.println("Fahrenheit = "+fahren);
				break;
			default:
				System.out.println("Option error,choose 1-3");
				break;
		}
	}
}
