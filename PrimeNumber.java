//Nama 		: Febby Febriansyah
//NIM		: 1301140371
//Kelas		: IF-38-01
//Program	: PrimeNumber.java

import java.util.Scanner;

class PrimeNumber {
	public static void main(String args[]){
		int x;
		boolean prime = true;
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("Program Cek Bilangan Prima");
		System.out.println("==========================");
		System.out.println();
		System.out.print("Masukkan Angka = ");
		x = in.nextInt();
		for(int i=2;i<x;i++){
			if(x%i == 0){
				prime = false;
			}
		}
		System.out.println();
		if(prime == false){
			System.out.println(x+" Bukan bilangan prima");
		}
		else{System.out.println(x+" Adalah bilangan prima");}
	}
}
