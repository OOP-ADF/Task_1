//Nama	: Reinaldi
//Nim	: 1301144362
//Kelas	: IF-38-02

import java.util.Scanner;
public class TemperatureConvert{
	public static void main(String[] args){
		double celcius;
		double hasil;
		int pil;
		Scanner input=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		System.out.println("Conver Reamur");
		System.out.println("Conver Fahrenheit");
		System.out.println("Conver Kelvin");
		System.out.print("Pilihan : ");
		pil=input2.nextInt();
		System.out.print("Suhu Celcius : ");
		celcius=input.nextDouble();
		switch (pil){
			case 1:{
				hasil=(4/5)*(celcius);
				System.out.print("Hasil : "+hasil);
				break;
			}
			case 2:{
				hasil=(9/5*celcius)+32;
				System.out.print("Hasil : "+hasil);
				break;
			}
			case 3:{
				hasil=celcius+273;
				System.out.print("Hasil : "+hasil);
				break;
			}
		}
		
	}
}