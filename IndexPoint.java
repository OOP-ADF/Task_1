// Ferawidya Pimadevi//
// 1301140201 //
// IF - 38 - 01 //

import java.util.Scanner;
public class indexpoint{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double uts, uas, quiz, nilaiahir;
		String tingkat;
		
		System.out.println(" Nilai UTS 		: ");
		uts = input.nextDouble();
		
		System.out.println(" Nilai UAS 		: ");
		uas = input.nextDouble();
		
		System.out.println(" Nilai QUIZ 		: ");
		quiz = input.nextDouble();
		
		nilaiahir = (0.35*uts)+(0.4*uas)+(0.25*quiz);
		
		if(nilaiahir>85)
		{
			System.out.println("Exellent");
		}
		else if (nilaiahir>75)
		{
			System.out.println("very Good");
		}
		else if (nilaiahir>5)
		{
			System.out.println("Good");
		}
		else if (nilaiahir>50)
		{
			System.out.println("Average");
		}
		else if (nilaiahir<50)
		{
			System.out.println("Fail");
		}
	}
}
