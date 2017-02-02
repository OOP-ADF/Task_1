package primenumber;

import java.util.Scanner;

public class PrimeNumber 
{
   public static void main(String args[])
   {		
	Scanner bilangan= new Scanner(System.in);
	System.out.println("Masukkan angka : ");
	int x;
	boolean iniPrima=true;
	int angka=bilangan.nextInt();
	
	for(int i=2;i<=angka/2;i++)
	{
        x=angka%i;
		if(x==0)
		{
	      iniPrima=false;
	      break;
		}
	}
	
	if(inPrima)
	{
		System.out.println("Prima");
	}
	else
	{
		System.out.println("Bukan Prima");
	}
   }
}