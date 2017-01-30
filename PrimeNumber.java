/**
* nama : nisa nurhardini
* nim : 1301154544
* kelas : if-39-12
*/

import java.util.Scanner;

public class PrimeNumber{
	public static void main (String[] args){
		Scanner cin = new Scanner(System.in);
		
		System.out.print ("Masukkan Bilangan : ");
		int bil = cin.nextInt();
		
		int n;
		
		n=0;
		
		for (int i=1; i<=bil; i++){
			if ((bil%i)==0){
				n++;
			}
		}
		if (n==2){
			System.out.print ("Bilangan Prima");
		}
		else{
			System.out.print ("Bukan Bilangan Prima");
		}
	}
}