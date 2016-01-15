//Nama	: Reinaldi
//Nim	: 1301144362
//Kelas	: IF-38-02

import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		int faktor=0;
		double angka;
		Scanner input=new Scanner(System.in);
		System.out.print("Masukan Angka : ");
		angka=input.nextDouble();
		if(angka%1==0){
			faktor++;
		}
		for (int i=2;i<=angka;i++){
			if(angka%i==0){
				faktor++;
			}
		}
		if(faktor==2){
			System.out.print("Angka "+angka+" adalah angka prima");
		}
		else{
			System.out.print("Angka "+angka+" bukan angka prima");
		}
	}
}
	