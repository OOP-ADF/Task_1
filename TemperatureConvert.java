/*
Nama 	: Muhammad Zakaria Musa
NIM 	: 1103130047
Kelas	: IF-39-07
*/
import java.util.Scanner;
public class TemperatureConvert{

	public static void convert(int c){
		Scanner in = new Scanner(System.in);
		System.out.println("Pilihan konversi  : ");
		System.out.println("1. Reamur ");
		System.out.println("2. Fahrenheit ");
		System.out.println("3. Kelvin ");
		System.out.print("Inputkan Pilihan anda :  ");
		int choice = in.nextInt();

		if (choice == 1){
			double reamur = c*0.8;
			System.out.println(reamur+" derajat Reamur");
		}else if (choice == 2) {
			double fahrenheit =(c*1.8)+32;
			System.out.println(fahrenheit+" derajat Fahrenheit");
		}else if (choice == 3) {
			double kelvin = c+273.15;
			System.out.println(kelvin+" derajat Kelvin");
		}else{
			System.out.println("Invalid Input");
		}

        System.out.println("apakah anda ingin melakukan konversi lagi?  : ");
		System.out.println("1. Ya ");
		System.out.println("2. Tidak ");
		System.out.print("Inputkan Pilihan anda :  ");
		int choice2 = in.nextInt();

		switch (choice2) {
            case 1:  convert(c);
                     break;
            case 2:  System.out.println("Thanks You");
                     break;
            default: System.out.println("Invalid Input");
                     break;
        	}

		}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Inputkan suhu pada satuan celcius  : ");
		int c = in.nextInt();
		convert(c);
	}

}
