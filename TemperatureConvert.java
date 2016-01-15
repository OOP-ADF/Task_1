// NAMA : DZAKYTA AFUZAGANI
// NIM	: 1301140122
// KELAS: IF 38 02

import java.util.Scanner;
public class TemperatureConvert{
	public static void main(String[] args){
		double cel,rmr,far,kel;
		Scanner input=new Scanner(System.in);
		int pil;
		Scanner input1=new Scanner(System.in);
		System.out.print("Nilai Celcius : ");
		cel=input.nextDouble();
		     do {
				System.out.println("Pilih Suhu Yang Akan Di Convert ");
				System.out.println("1. REAMUR ");
				System.out.println("2. FAHRENHEIT ");
				System.out.println("3. KELVIN ");
				System.out.println("4. Keluar");
				System.out.println("Pilihan Anda : ");
				pil=input.nextInt();
			switch(pil){
				case 1: rmr=(4/5)*cel;
						System.out.println(+rmr+ "REAMUR");
						break;
				case 2: far=(9/5)*cel+32;
						System.out.println(+far+ "FAHRENHEIT");
						break;
				case 3: kel=cel+273;
						System.out.println(+kel+ "KELVIN");
						break;

			}
		}
		while (pil != 4);
	}
}