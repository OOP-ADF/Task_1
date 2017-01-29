//Ranestari Sastriani, 1301154553, IF3907
import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer hitung=0;
		
		System.out.println("masukan angka :");
		Integer angka =sc.nextInt(); 
		
		
		for (Integer i=2; i<angka;i++)
		{
			if ((angka % i)==0)
			{
				hitung++;
			}
		}
		if (hitung>0 || angka<2)
			System.out.println(angka+" bukan bilangan prima");
		else 
			System.out.println(angka+"  bilangan prima");
			
		
	}
}
