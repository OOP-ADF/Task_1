package primenumber;
import java.util.Scanner;
/**
 *
 * @author  Kukuh Rahingga P
 *          1301150035
 *          IF-39-07
 */
public class PrimeNumber {

    public static void main(String[] args) 
    {
	Scanner input = new Scanner (System.in);
	System.out.print("Masukkan angka : ");
	int inp = input.nextInt();
		
	int coun = 0;
	for (int i = 1; i <= inp; i++)
	{
		if (inp % i == 0)
		{
			coun = coun + 1;
		}
	}
			
	if (coun == 2)
	{
		System.out.println ("Bilangan Prima");
	}
	else
	{
		System.out.println ("Bukan Bilangan Prima");
	}
    } 
}