/**
* nama	: afra woro dhuwarti
* nim 	: 1301150432
* kelas	: if39-12
**/

import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Masukkan bilangan: ");
		int bil = cin.nextInt();
		int n = 0;
		for (int i = 1; i <= bil; i++)
		{
			if((bil % i) == 0)
			{
				n++;
			}	
		}
		if(n == 2)
		{
			System.out.print("Bilangan prima");
		} else
		{
			System.out.print("Bukan bilangan prima");
		}
	}	
}