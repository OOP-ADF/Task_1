	/* 
Nama  : Muchamad Fuad
NIM   : 1301140272
Kelas : IF-38-02
*/
import java.util.Scanner;
public class TemperatureConvert {
    public static void main(String[] args){
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		double Celc;
		char pil1,pil2;
		
		do{
			System.out.println("Menu Program Konverter");
			System.out.println("1. Celcius => Reamur");
			System.out.println("2. Celcius => Fahrenheit");
			System.out.println("3. Celcius => Kelvin");
			System.out.print("Pilih (1-3) : ");
			pil1 = input2.next().charAt(0);
			System.out.println();
			System.out.print("Masukkan Suhu Dalam Celcius : ");
                        Celc=input1.nextDouble();
			System.out.println();
			
			switch(pil1) {
				case '1' :
					System.out.println("Hasil : "+0.8*Celc+" Reamur");
					break;
				case '2' :
					System.out.println("Hasil : "+(32+(1.8*Celc))+" Fahrenheit");
					break;
				case '3' :
					System.out.println("Hasil : "+(273+Celc)+" Fahrenheit");
					break;
			}
			
			System.out.println("Ingin Mengulang ? ");
			System.out.print("Input (y/n) : ");
			pil2 = input2.next().charAt(0);
			System.out.println();
		}while (pil2 != 'n');
	}
}