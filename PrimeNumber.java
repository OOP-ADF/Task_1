//Nama 		: Fachri Ul Albab
//NIM		: 1301140151
//Kelas		: IF-38-01

import java.util.Scanner;

class PrimeNumber {
	public static void main(String args[])
	{
		int x;
		boolean prime = true;
		
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.print("Masukkan Angka = ");
		x = in.nextInt();
		for(int i=2;i<x;i++)
		{
			if(x%i == 0)
			{
				prime = false;
			}
		}
		System.out.println();
		if(prime == false)
		{
			System.out.println(x+" Angka tersebut bukan bilangan prima");
		}
		else{System.out.println(x+" Angka tersebut adalah bilangan prima");}
	}
}