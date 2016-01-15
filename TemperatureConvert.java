/*Name: Amalya Citra Pradana
Student ID: 1301140389
Class: IF-38-09
*/

import java.util.Scanner;

public class TemperatureConvert {
	public static void main (String[] args){
		double angka,hasil;
		int pilih,pilih2;
		int muter=1;
		
		Scanner in = new Scanner(System.in);
		
		while (muter==1){
			System.out.println("KONVERSI SUHU");
			System.out.print("Masukkan suhu (dalam Celcius): ");
			angka = in.nextInt();
			muter=0;
			while(muter==0){
				System.out.println("Pilih Menu: ");
				System.out.println("1.Reamur");
				System.out.println("2.Fahrenheit");
				System.out.println("3.Kelvin");
				System.out.print("pilih nomor: ");
				
				pilih = in.nextInt();
			
				switch(pilih){
					case 1: 
						hasil= (angka*(0.8));
						System.out.println("Suhu dalam Reamur: " + hasil);
						System.out.println("Tekan 4 untuk kembali konversi suhu lain atau tekan 5 untuk input ulang");
						pilih2 = in.nextInt();
						if (pilih2==4){muter=0;}
							else if (pilih2==5){muter=1;}
						break;
					case 2: 
						hasil= ((angka*(1.8))+32);
						System.out.println("Suhu dalam Fahrenheit: " + hasil);
						System.out.println("Tekan 4 untuk kembali konversi suhu lain atau tekan 5 untuk input ulang");
						pilih2 = in.nextInt();
						if (pilih2==4){muter=0;}
							else if (pilih2==5){muter=1;}
						break;
					case 3: 
						hasil= (angka+273.15);
						System.out.println("Suhu dalam Kelvin: " + hasil);
						System.out.println("Tekan 4 untuk kembali konversi suhu lain atau tekan 5 untuk input ulang");
						pilih2 = in.nextInt();
						if (pilih2==4){muter=0;}
							else if (pilih2==5){muter=1;}
						break;
				}
			}
		}
	}
}