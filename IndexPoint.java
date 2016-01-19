//nama 	 : Andhika Gilang K
//NIM 	 : 1301140361
//Kelas	 : IF-38-01
//Nama Program : IndexPoint.java

import java.util.Scanner;

public class IndexPoint
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		float uts,uas,kuis,akhir;
		
		System.out.print("Please input the score")
		System.out.print("UTS score : ");
		uts  = s.nextFloat();
		System.out.print("UAS score : ");
		uas  = s.nextFloat();
		System.out.print("Kuis score : ");
		kuis = s.nextFloat();
		
		akhir = uts*0.35f+uas*0.4f+quiz*0.25f;
		if (akhir >= 0 && akhir <= 49)
		{
			System.out.println("Your Score : "+akhir);
			System.out.println("Failed");
		}
		else if (akhir >= 50 && akhir <= 64)
		{
			System.out.println("Your Score : "+akhir);
			System.out.println("Accepted");
		}
		else if (akhir >= 65 && akhir <= 74)
		{
			System.out.println("Your Score : "+akhir);
			System.out.println("Good");
		}
		else if (akhir >= 75 && akhir <= 84)
		{
			System.out.println("Your Score : "+akhir);
			System.out.println("Very good");
		}
		else if (akhir >= 85 && akhir <= 100)
		{
			System.out.println("Your Score : "+akhir);
			System.out.println("Failed");
		}
		else 
		{
			System.out.println("Error")
		}
	}
}
