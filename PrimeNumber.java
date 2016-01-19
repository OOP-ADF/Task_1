//author Syahidul Akbar Mardhotillah 1301140331

import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Masukan Bilangan : ");
		int a = scan.nextInt();
		int b = 0;
		
		for(int x=1; x<=a; x++){
		if(a%x==0)
			b=b+1;
		}
		if(b==2)
			System.out.println("Bilangan Prima");
			else
			System.out.println("Bukan Bilangan Prima");
	}
}
