//NAMA:Faishal Abdillah
//kelas:IF-38-02
//NIM:1301144232

import java.util.Scanner;
public class TemperatureConvert{
	public static void main(String[] args){
		double hasil,suhu;
		int pilihan;
		Scanner input=new Scanner(System.in);
		System.out.println("-----Welcome to TemperatureConvert -----");
		System.out.println("Menu");
		System.out.println("1.change to fahrenheit");
		System.out.println("2.change to reamur");
		System.out.println("3.change to kelvin");
		System.out.print("your choice?");
		pilihan=input.nextInt();
		System.out.print("Your temperature= ");
		suhu=input.nextDouble();
		switch (pilihan){
		 case 1: {
			hasil=(1.8)*suhu+32;
            System.out.print("Celcius= "+suhu+" Fahrenheit "+hasil);
			break;
		 }
         case 2:{ 
			hasil=(0.8)*suhu;
            System.out.print("Celcius= "+suhu+" Reamur= "+hasil);
			break;
		 }
		 case 3:{
			hasil=suhu+273;
			System.out.print("Celcius= "+suhu+" Kelvin= "+hasil);
			break;
		 }
		 
	}
}
}