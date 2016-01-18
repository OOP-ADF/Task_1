/* Ferdy Dian Anugrah 
   1301140035
   IF 38 05 */


import java.util.Scanner;

public class PrimeNumber
{
   public static void main(String args[])
   {		
	int temp;
	boolean Prime=true;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number :");
	int num=sc.nextInt();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      Prime=false;
	      break;
	   }
	}
	if(Prime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " not Prime Number");
   }
}

