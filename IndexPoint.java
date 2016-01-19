//author Syahidul Akbar Mardhotillah 1301140331

import java.util.Scanner;

public class IndexPoint{
public static void main(String[] args){
	Scanner score = new Scanner(System.in);
	
	double uts, uas, kuis, akhir;

	System.out.print("Nilai UTS : ");
	uts = score.nextDouble();
	
	System.out.print("Nilai UAS : ");
	uas = score.nextDouble();
	
	System.out.print("Nilai Kuis : ");
	kuis = score.nextDouble();
	
	akhir = (0.35*uts)+(0.4*uas)+(0.25*kuis);
	
	if (akhir>85){
	System.out.print("Exellent");
	}
	else if (akhir>75){
	System.out.print("Verry Good");
	}
	else if (akhir>65){
	System.out.print("Good");
	}
	else if (akhir>50){
	System.out.print("Average");
	}
	else if (akhir<50){
	System.out.print("Fail");
	}
	}
}
