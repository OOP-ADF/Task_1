/**
* nama : nisa nurhardini
* nim : 1301154544
* kelas : if-39-12
*/

import java.util.Scanner;

public class TemperatureConvert{
	public static void main (String[] args){
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Masukkan Suhu : ");
		int suhu = cin.nextInt();
		
		System.out.println ("Pilih Konversi");
		System.out.println ("1. Reamur");
		System.out.println ("2. Fahrenheit");
		System.out.println ("3. Kelvin");
		System.out.print ("Convert ke : ");
		int pilih = cin.nextInt();
		double hasil;
		
		if (pilih==1){
			hasil = 0.8*suhu;
			System.out.print (hasil+"Reamur");
		}
		else if (pilih==2){
			hasil = (1.8*suhu) + 32;
			System.out.print (hasil+"Fahrenheit");
		}
		else{
			hasil = 273+suhu;
			System.out.print (hasil+"Kelvin");
		}
		
		}
}