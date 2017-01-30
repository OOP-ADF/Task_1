/**
* nama : afra woro dhuwarti
* nim  : 1301150432
* kelas: if39-12
**/
import java.util.Scanner;

public class IndexPoint{
	public static void main (String[] args){
		Scanner cin = new Scanner (System.in);
		System.out.print("Masukkan nilai UTS: ");
		int niuts = cin.nextInt();
		System.out.print("Masukkan nilai UAS: ");
		int niuas = cin.nextInt();
		System.out.print("Masukkan nilai Kuis: ");
		int nikuis = cin.nextInt();
		
		double niakhir = (0.35*niuts) + (0.40*niuas) + (0.25*nikuis);
		if (niakhir >= 85 && niakhir <= 100)
		{
			System.out.print("Excellent");
		} else if (niakhir >= 75 && niakhir <= 84)
		{
			System.out.print("Very Good");
		} else if (niakhir >= 65 && niakhir <= 74)
		{
			System.out.print("Good");
		} else if (niakhir >= 50 && niakhir <= 64)
		{
			System.out.print("Accepted");
		} else
		{
			System.out.print("Failed");
		}
	}
}