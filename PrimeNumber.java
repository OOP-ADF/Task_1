// NAMA : DZAKYTA AFUZAGANI
// NIM	: 1301140122
// KELAS: IF 38 02

import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		double bil,counter;
		counter = 0;
		Scanner input=new Scanner(System.in);
		System.out.print("Bilangan yang di input : ");
		bil=input.nextDouble();
		for (int i=1; i<=bil ; i++){
			if(bil%i == 0){
				counter++;
			}
		}
		if(counter == 2){
		System.out.print("Bilangan yang anda input PRIMA");
		}
		else{
		System.out.print("Bilangan yang anda input BUKAN PRIMA");
		}
	}
}

