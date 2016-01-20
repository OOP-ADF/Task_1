/*Name: Anita Auliani
Student ID: 1301144349
Class: IF-38-09
*/

import java.util.Scanner;

public class PrimeNumber
{
	public static void main (String[] args){
	
	int bilangan;
	int sum=0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Prime Number");
	System.out.print("Masukkan angka yang ingin diketahui bilangan prima atau bukan : ");
	
	bilangan = input.nextInt();
	
	for (int i=1; i<= bilangan; i++)
	{
		if (bilangan % i == 0)
		{
			sum = sum + 1;
		}
		else
		{
			sum = sum + 0;
		}
	}
		if (sum == 2)
		{
			System.out.print(" adalah bilangan prima");
		}
		else
		{
			System.out.println(" bukan bilangan prima");
		}
	}
}