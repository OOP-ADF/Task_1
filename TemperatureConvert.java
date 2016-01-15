/*
Name : Riksa Meidy Karim
Student ID : 1301142289
Class : IF-38-09

*/
import java.util.Scanner;

class TemperatureConvert{
	
	public static void main(String[] args){
		double bil,hasil;
		int a;
		Scanner r = new Scanner(System.in);
		System.out.print("Masukkan temperatur dalam derajat celcius: ");
		bil = r.nextDouble();
		System.out.println("Silahkan Masukan Pilihan suhu hasil konversi: ");
		System.out.println("1.Fahreneheit");
		System.out.println("2.Reamur ");
		System.out.println("3.Kelvin");
		a = r.nextInt();
		switch(a){
			case 1: hasil = (9.00/5.00 * bil) + 32;
					System.out.println("Hasilnya adalah " + hasil + " F");
					break;
			case 2 :  hasil = 4.00/5.00 * bil;
					System.out.println("Hasilnya adalah " + hasil + " R");
					break;
			case 3:  hasil = bil+273.00;
					System.out.println("Hasilnya adalah " + hasil + " K");
					break;
			default: System.out.println("pilihan salah");break;
		}
	}
}