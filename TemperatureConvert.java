//Tari Lestari (130114481) 	IF-38-01


import java.util.Scanner;

 
 public class temperatureconvert {
	public static void main(String[]args){
	Scanner masukan = new Scanner (System.in);
	System.out.println("TEMPERATURE CONVERTER");
	System.out.println ("1. Celcius");
	System.out.println ("2. Fahrenheit");
	System.out.println ("3. Reamur");
	System.out.println ("4. Kelvin");
	System.out.println("Masukkan pilihan : ");
	int pilih = masukan.nextInt();
	
	if (pilih == 1){
		System.out.println ("Masukkan temperature Calcius yang akan di convert : ");
		double celcius = masukan.nextInt();
		double fahrenheit = 9.0 / 5.0 * celcius + 32.0;
		System.out.println (fahrenheit + " derajat fahrenheit");
		double reamur = 4.0 / 5.0 * celcius;
		System.out.println (reamur + " derajat reamur");
		double kelvin = celcius + 273.0;
		System.out.println(kelvin + " derajat kelvin");
		}
		
	else if (pilih == 2){
		System.out.println ("Masukkan  temperature Fahrenheit yang akan di convert : ");
		double fahrenheit = masukan.nextInt();
		double celcius = 5.0 / 9.0 * fahrenheit - 32.0;
		System.out.println(celcius + " derajat celcius");
		double reamur = 4.0 / 9.0 * fahrenheit;
		System.out.println(reamur + " derajat reamur");
		double kelvin = 5.0 / 9.0 * fahrenheit - 32.0 + 273.0;
		System.out.println(kelvin + " derajat kelvin");
		}
		
	else if (pilih == 3){
		System.out.println ("Masukkan temperature Reamur yang akan di convert");
		double reamur = masukan.nextInt();
		double celcius = 5.0 / 4.0 * reamur;
		System.out.println(celcius + " derajat celcius");
		double fahrenheit = 9.0 / 4.0 * reamur + 32.0;
		System.out.println(fahrenheit + " derajat farenheit");
		double kelvin = 5.0 /4.0 * reamur + 273.0;
		System.out.println(kelvin + " derajat kelvin");
		}
		
	else if (pilih == 4){
		System.out.println	("Masukkan temperature Kelvin yang akan di convert");
		double kelvin = masukan.nextInt();
		double celcius =  kelvin - 273.15;
		System.out.println (celcius + " derajat celcius");
		double fahrenheit = kelvin * 1.8 - 459.67;
		System.out.println (fahrenheit + " derajat fahrenheit");
		double reamur = kelvin - 273.15 * 0.8;
		System.out.println (reamur + " derajat reamur");
		}
	}
}
