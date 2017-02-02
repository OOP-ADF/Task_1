// Name	: Gangsar Yoga Pamungkas
// NIM		: 1301154096
// Kelas	: IF-39-12
import java.util.Scanner;

public class IndexPoint{
	public static void main(String[] args) {
		int uts,uas,quiz;
		int scorefinal;
		int hasiluts,hasiluas,hasilquiz,hasilakhir;
		int grade;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("masukkan nilai UTS : ");
		uts = scan.nextInt();
		
			uts = uts * 35 / 100;
			hasiluts = uts;
	
		System.out.print("masukkan nilai UAS : ");
		uas = scan.nextInt();
		
			uas = uas * 40 / 100;
			hasiluas = uas;
		
		System.out.print("masukkan nilai Quiz : ");
		quiz = scan.nextInt();
		
			quiz = quiz * 25 / 100;
			hasilquiz = quiz;

		hasilakhir =  hasiluts+hasiluas+hasilquiz;
		System.out.println("Hasil akhir : "+hasilakhir);
			
		
		grade = hasilakhir;
		if((grade >=85) && (grade <= 100)){
			System.out.print("excellent ");
		}
		else if ((grade >=75) && (grade <= 84)) {
			System.out.print("very good ");
		}
		else if ((grade >=65) && (grade <= 74)) {
			System.out.print("good ");
		}
		else if ((grade >=50) && (grade <= 64)) {
			System.out.print("accepted ");
		}
		else
		{
			System.out.print("failed ");
		}
	}
}
