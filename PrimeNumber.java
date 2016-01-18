/* 
Rana Renes Rengga (1301144351)
IF-38-01*/

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		int angka;
		int i = 2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan angka: ");
		angka = input.nextInt();
		
		 boolean cek = true;
		
		while (i < angka)
		{
			if (angka % i == 0)
			{ 
				cek = false;
				break;
			}
			i++;
		}
		
		if (cek)
			System.out.println("Bilangan " + angka + " adalah bilangan prima ");
		else 
			System.out.println("Bilangan " + angka + " bukan bilangan prima ");
	}
}