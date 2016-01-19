//Nama 		: Febby Febriansyah
//NIM		: 1301140371
//Kelas		: IF-38-01
//Program	: TemperatureConvert.java

import java.util.Scanner;

class TemperatureConvert{
	public static void main(String args[]){
		double c;
		int menu,submenu;
		char ulang;
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("Program Temperature Convert");
		System.out.println("===========================");
		System.out.println();
		System.out.print("Masukkan suhu = ");c = in.nextFloat();
		do{
		System.out.println();
		System.out.println("Pilih menu convert suhu ke");
		System.out.println("1. Fahrenheit(F)");
		System.out.println("2. Reamur(R)");
		System.out.println("3. Kelvin(K)");
		System.out.println("4. Celcius(C)");
		System.out.println();
		System.out.print("Masukkan pilihan (1/2/3/4) = ");
		menu = in.nextInt();
		switch (menu){
			case 1 : double f = 1.8*c+32;
						System.out.println("Hasil Konversi ke Fahrenheit = "+f+" F");
						System.out.print("Exit ?(y/n) : ");
						ulang = in.next().charAt(0);
						break;
			case 2 : double r = 0.8*c;
						System.out.println("Hasil Konversi ke Reamur = "+r+" R");
						System.out.print("Exit ?(y/n) : ");
						ulang = in.next().charAt(0);
						break;	
			case 3 : double k = c+273;
						System.out.println("Hasil Konversi ke Kelvin = "+k+" K");
						System.out.print("Exit ?(y/n) : ");
						ulang = in.next().charAt(0);
						break;
			case 4 : System.out.println("Hasil Konversi ke Celcius = "+c+" C");
						System.out.print("Exit ?(y/n) : ");
						ulang = in.next().charAt(0);
						break;
			default : System.out.println("Anda Salah input!");ulang = 'n';
			}
		}while (ulang == 'n' || ulang == 'N');
		if (ulang == 'y' || ulang == 'Y'){System.exit(0);}
	}
}
