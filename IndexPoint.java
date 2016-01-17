/* Nama: Dainty Amanda
Nim: 13011440062
Kelas: IF-38-02*/

package IndexPoint;
//import utilitas java yaitu scanner untuk memasukkan data
import java.util.Scanner;


public class IndexPoint {

    public static void main (String[] args) {
		//membuat variabel
		int midTerm, endTerm, quiz;
		double midTermScore, endTermScore, quizScore, finalScore;
		//membuat scanner baru
		Scanner masukan = new Scanner(System.in);
		System.out.print ("=== INDEX POINT ===")
		//memasukkan nilai Score
		System.out.print ("Mid-term Score : ");
		midTerm = masukan.nextInt();
		System.out.print ("End-term Score : ");
		endTerm = masukan.nextInt();
		System.out.print ("Quiz : ");
		quiz = masukan.nextInt();
	
		//kalkulasi score
		midTermScore = midTerm*0.35;
		endTermScore = endTerm*0.4;
		quizScore = quiz*0.25;
		finalScore = midTermScore+endTermScore+quizScore;
	
		//pengondisian dan memunculkan grade score
		if ((finalScore>=85) && (finalScore<=100)) {
			System.out.println("Nilai Akhir Anda EXCELLENT");
		}
		else if ((finalScore>=75) && (finalScore<=84)) {
			System.out.println ("Nilai Akhir Anda VERY GOOD");
		}
		else if ((finalScore>=65) && (finalScore<=74)) {
			System.out.println ("Nilai AKhir Anda GOOD");
		}
		else if ((finalScore>=50) && (finalScore<=64)) {
			System.out.println ("Nilai Akhir ANda ACCEPTED");
		}
		else if ((finalScore>=49 && finalScore<=0)) {
			System.out.print ("Nilai Akhir Anda FAILED");
		}
		else{
			System.out.println ("Nilai yang Anda Masukan Salah");
		}
	}
}
