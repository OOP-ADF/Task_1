/*Nama	: Windy Israniati Jihan
NIM		: 1301144309
Kelas	: IF-38-09 */

import java.util.Scanner;
public class PrimeNumber {
	public static void main (String args[]) {
		BilanganPrima();
	}
	public static void BilanganPrima() {
		Scanner masukan = new Scanner(System.in);
		int angka;
		int a;
		boolean prim=false;
		System.out.println("Masukkan Angka : ");
		angka = masukan.nextInt();
		for (int i=2; i<=angka/2; i++) {
			a=angka%i;
				if(a!=0) {
					prim=true;
					break;
				}
		}
		if (prim)
			System.out.println(angka + " bukan bilangan prima");
		else
			System.out.println(angka + " bilangan prima");
		
	}
}
