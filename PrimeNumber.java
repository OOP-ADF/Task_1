//nama 	 : Andhika Gilang K
//NIM 	 : 1301140361
//Kelas	 : IF-38-01
//Nama Program : PrimeNumber.java

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main (String args[])
	{
		int s;
		boolean prime = true l
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number = ");
		s=in.nextInt();
		for (int i=2;i<s;i++)
		{
			if (s%i == 0 )
			{
				prime = false;
			}
		}
		System.out.println();
		if(prime == true)
		{
			System.out.println(s+" is a prime number")
		}
		else
		{
			System.out.println(s+" Is not a Prime Number")
		}
	}
}
