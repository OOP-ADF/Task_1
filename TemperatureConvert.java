//Name 			: Mohammad Zakie Faiz Rahiemy
//Student ID 	: 1301144422
//Class			: IF-38-02

import java.util.Scanner;

public class TemperatureConvert {
	public static void main(String[] args){
		double Celcius, NewDegrees;
		int Menu;
		Scanner inDouble = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);
		System.out.print("Enter a number (temperature in celcius degrees) : ");
		Celcius = inDouble.nextDouble();
		do{
			System.out.println("Menu : ");
			System.out.println("1. Convert To Fahrenheit");
			System.out.println("2. Convert To Reamur");
			System.out.println("3. Convert To Kelvin");
			System.out.println("");
			System.out.println("0. Close");
			System.out.println("");
			System.out.print("Menu : ");
			Menu = inInt.nextInt();
			if (Menu == 1){
				NewDegrees = (Celcius*1.8)+32;
				System.out.println(Celcius+" C = "+NewDegrees+" F");
			}else if (Menu == 2){
				NewDegrees = (Celcius*0.8);
				System.out.println(Celcius+" C = "+NewDegrees+" R");
			}else if (Menu == 3){
				NewDegrees = (Celcius)+273.15;
				System.out.println(Celcius+" C = "+NewDegrees+" K");
			}
		}while(Menu!=0);
	}
}