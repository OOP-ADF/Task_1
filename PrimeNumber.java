/* 
YAHYA ERMAYA 
1301140199
IF-38-09
*/

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String [] args) {
		int x;
		int i;
		int check;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input x: ");
		
		check = 1;
		x = in.nextInt();
		if (x == 1 || x == 2)
		{
			check = 1;
		}
		else if (x > 2)
		{
			for (i=2; i < x; i++)
			{
				if (x%i == 0)
				{
					check = 0;
				}
			}
		}
		else
		{
			check = 0;
		}
		if (check == 1)
		{
			System.out.println (x + " adalah Bilangan Prima");
		}
		else
		{
			System.out.println (x + " Bukan Bilangan Prima");
		}
	}
}
