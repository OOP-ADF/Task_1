/* Nama: Dainty Amanda
Nim: 13011440062
Kelas: IF-38-02*/

package TemperatureConvert;
import java.util.scanner;


public class TemperatureConvert {
	
	public static void main (String[] args) {
		double celcius, hasilReamur, hasilFarenheit, hasilKelvin;
		int pilih;
		Scanner masukan = new Scanner(System.in);
		System.out.println ("=== TEMPERATURE CONVERT ===");
		System.out.print (" Celcius = ");
		celcius = masukan.nextInt();
		System.out.println ("Pilihan Konvert Temperatur");
		System.out.println ("1. Reamur");
		System.out.println ("2. Farenheit");
		System.out.println ("3. Kelvin");
		System.out.print ("Masukkan Pilihan : ");
		pilih = masukan.nextInt();
		
		switch(pilih) {
			case 1 :
				hasilReamur = celcius*4/5;
				System.out.println (celcius + " Celcius = " + hasilReamur + " Reamur");
				break;
			case 2 :
				hasilFarenheit = (celcius*9/5)+32;
				System.out.println (celcius + " Celcius = " + hasilFarenheit + " Farenheit");
				break;
			case 3 :
				hasilKelvin = celcius+273;
				System.out.println (celcius + " Celcius = " + hasilKelvin + " Kelvin");
				break;
			default :
				System.out.println ("Pilihan yang anda masukan salah");
				break;
		}
	}
}
