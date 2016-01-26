import java.util.Scanner;

public class indeksAkhir{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double uts,uas,quiz,nindeks;
		
		System.out.print("Nilai UTS : ");
			uts = input.nextDouble();
		System.out.print("Nilai UAS : ");
			uas = input.nextDouble();
		System.out.print("Nilai Quiz : ");
			quiz = input.nextDouble();
		nindeks = (0.35*uts)+(0.4*uas)+(0.25*quiz);
		
		System.out.println("=====================");
		System.out.println("Nilai UTS : "+uts);
		System.out.println("Nilai UAS : "+uas);
		System.out.println("Nilai Quiz : "+quiz);
		System.out.println("Nilai Akhir : "+nindeks);
		
		if(nindeks>=85){
			System.out.println("Indeks : Excellent");
		}
		else if(nindeks<85 && nindeks>=75){
			System.out.println("Indeks : Very Good");
		}
		else if(nindeks<75 && nindeks>=65){
			System.out.println("Indeks : Good");
		}
		else if(nindeks<65 && nindeks>=50){
			System.out.println("Indeks : Accepted");
		}
		else if(nindeks<50){
			System.out.println("Indeks : Failed");
		}
	}	
}
