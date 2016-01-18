// Ibnu Malik Al Kusaeri - 1301140359 - if38-09
import java.util.Scanner;

class PrimeNumber
{
   public static void main(String args[])
   {
      int n;
	  boolean checkPrime=true;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the numbers you want");
      n = in.nextInt();
	  //koding
	  for(int i=2;i<=n/2;i++)
	  {
		  if(n%i==0)
		  {
			  checkPrime=false;
			  break;
		  }
	  }
	  //output
	  if(checkPrime)
	  {
		  System.out.println(n + " is Prime Number");
	  }else
	  {
		  System.out.println(n + " is Not Prime Number");
	  }
}
}
