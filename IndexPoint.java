//RanestariSastriani 1301154553 IF3907
import java.util.Scanner;
public class IndexPoint{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Double nAkhir;
		
		
		
		System.out.println("Masukan Nilai UAS   : ");
		Double nUAS=sc.nextDouble();
		System.out.println("Masukan Nilai UTS   : ");
		Double nUTS=sc.nextDouble();
		System.out.println("Masukan Nilai Kuis  :");
		Double nKuis = sc.nextDouble();
		nAkhir=(0.4*nUAS + 0.35*nUTS+0.25*nKuis);
		System.out.println("Nilai Akhir = "+nAkhir);
		
		if (nAkhir>=85 && nAkhir<=100)
		{
			System.out.println("Grade : EXCELLENT");
		}
		else if (nAkhir>=75 && nAkhir<=84)
		{
			System.out.println("Grade : VERY GOOD");
		}
		else if (nAkhir>=65 && nAkhir<=74)
		{
			System.out.println("Grade : GOOD");
		}
		else if (nAkhir>=50 && nAkhir<=64)
		{
			System.out.println("Grade : ACCEPTED");
		}
		else if (nAkhir<49)
		{
			System.out.println("Grade : FAILED");
		}
	}
}
