//Firda Aminy Ma'ruf 1301144311 IF3801
package primenumber;

import java.util.Scanner;

/**
 *
 * @author Iwan Ma'ruf
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
	int number=input.nextInt();
        int p=0;
		if (number == 1)
		{
			System.out.println("1 is NOT a prime number. Please enter a number that is greater than 1");
		}
		else
		{
			for (int i=1;i<=number;i++) {
				if(number%i==0)
					p=p+1;
			}
			if(p == 2)
			{
				System.out.println("That number is a PRIME number");
			}
			else
			{
				System.out.println("That number is NOT a prime number");
			}
		}
   } 
}

