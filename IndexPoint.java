import java.util.Scanner;

public class IndexPoint {
	/**
	*program java menentukan melihat index point
	*oleh I Putu Prima Ananda IF-38-01 1301144291
	*/
	public static void main(String[] args){
		double uts, uas, kuis, total;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nilai UTS anda : ");
		uts = input.nextInt();
		
		System.out.print("Masukan nilai UAS anda : ");
		uas = input.nextInt();
		
		System.out.print("Masukan nilai Kuis anda : ");
		kuis = input.nextInt();
		
		total = 0.35*uts + 0.4*uas + 0.25*kuis;
		
		if (total >= 85 && total <= 100 ){
			System.out.println("score " + total + " your grade is excellent");
		}
		else if (total >= 75 && total <= 84 ){
			System.out.println("score " + total + " your grade is very good");
		}
		else if (total >= 65 && total <= 74 ){
			System.out.println("score " + total + " your grade is good");
		}
		else if (total >= 50 && total <= 64 ){
			System.out.println("score " + total + " your grade is accepted");
		}
		else{
			System.out.println("score " + total + " you failed");
		}
	}
}
