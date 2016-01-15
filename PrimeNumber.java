/*
NAMA 	: Agung Rahmat Budiman
NIM		: 1301144142
Kelas	: IF-38-02
*/

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int angka;
		boolean prima=true;
		int i=2;
		Scanner input = new Scanner(System.in);
		System.out.print("Inputkan angka : ");
		angka = input.nextInt();
		if(angka>1) {
			while(prima && i<angka) {
				if((angka % i)==0) {
					prima=false;
				}
				i++;
			}
			if(prima || angka==2) {
				System.out.print("Bilangan prima");
			}	
			else {
				System.out.print("Bukan bilangan prima");
			}
		}
		else {
			System.out.print("Bukan bilangan prima");
		}
	}
}