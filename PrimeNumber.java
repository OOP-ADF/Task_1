//Fauzan Ramadhan S
//IF-38-09
//1301140339
import java.util.Scanner;

class PrimeNumber
{
	public static void main(String args[])
	{
		int n;
		boolean cek=true;
		Scanner in = new Scanner(System.in);
		System.out.print("Masukan Angka :");
		n = in.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
		  {
			  cek=false;
			  break;
		  }
		}
		if(cek)
	  {
		  System.out.println(n + " adalah Prima");
	  }else
	  {
		  System.out.println(n + " bukan Prima");
	  }
	}
}

