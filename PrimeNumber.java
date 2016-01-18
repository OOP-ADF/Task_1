/* 
RIZMA NURVIARELDA (1301144229)
IF-38-09
*/

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String [] args)
	{
		int angka;
		int i;
		int cek = 1;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input Angka: ");
		angka = in.nextInt();
		if (angka == 1 || angka == 2)
		{
			cek = 1;
		}
		else if (angka > 2)
		{
			for (i=2; i < angka; i++)
			{
				if (angka%i == 0)
				{
					cek = 0;
				}
			}
		}
		else {
			cek = 0;
		}
		if (cek == 1)
		{
			System.out.println ("Angka " + angka + " adalah Bilangan Prima");
		}
		else
		{
			System.out.println ("Angka " + angka + " Bukan Bilangan Prima");
		}
	}
}