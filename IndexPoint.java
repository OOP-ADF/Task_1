import java.util.Scanner;
public class Nilai {
    public static void main (String[] args) {
        double nilaiAkhir, UAS, UTS, Quiz; 
        Scanner cin = new Scanner(System.in);
        System.out.print("Nilai UTS: ");
        UTS=cin.nextDouble();
	System.out.print("Nilai UAS: ");
	UAS=cin.nextDouble();
	System.out.print("Nilai Quiz: ");
	Quiz=cin.nextDouble();
	
	nilaiAkhir=(0.35*UTS)+(0.4*UAS)+(0.25*Quiz);
	
	if (nilaiAkhir>=85 && nilaiAkhir<=100) {
		System.out.println("Excellent");
	}
	else if (nilaiAkhir>=75 && nilaiAkhir<=84) {
		System.out.println("Very Good");
	}
	else if (nilaiAkhir>=65 && nilaiAkhir<=74) {
		System.out.println("Good");
	}
	else if (nilaiAkhir>=50 && nilaiAkhir<=64) {
		System.out.println("Accepted");
	}
	else if (nilaiAkhir>=0 && nilaiAkhir<=49) {
		System.out.println("Failed");
	}
    }
}