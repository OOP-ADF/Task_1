// Ferawidya Pimadevi//
// 	1301140201 //
//	IF - 38 - 01 //
	

import java.util.Scanner;
public class primenumber{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int angka, prima;
		
		System.out.println("Input Angka : ");
		angka = input.nextInt();
		
		prima=0;
		for (int i=1; i<=angka; i++)
		{
			if (angka % i == 0)
			{
				prima++;
			}
		}
		if (prima==2) {
			System.out.println(+angka+ " adalah bilangan prima");
		}
		else{
			System.out.println(+angka+ " bukan bilang prima");
		}
		
	}
}
