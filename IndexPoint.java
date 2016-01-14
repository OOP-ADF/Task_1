/* Nama: Hani Dika Riani
   Nim: 1301144012
   Kelas: IF-38-02
 */


import java.util.Scanner;

public class IndexPoint {
	public static void main(String[] args){

        		double uas, uts, quiz, hasil;
		
		Scanner nilai = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai UAS: ");
		uas = nilai.nextDouble();
		
		System.out.print("Masukkan Nilai UTS: ");
		uts = nilai.nextDouble();
		
		System.out.print("Masukkan Nilai QUIZ: ");
		quiz = nilai.nextDouble();
		
		hasil = (0.35 * uts)+(0.4 * uas)+(0.25 * quiz); 
                
                if ((hasil>84) & (hasil<101)) {
                    System.out.print("Excellent");
                }
                else if (hasil>74) {
                    System.out.print("Very Good");    
                }
                else if (hasil>64) {
                    System.out.print("Good");    
                }
                else if (hasil>49) {
                    System.out.print("Accepted");    
                }
                else if (hasil > -1) {
                    System.out.print("Failed");    
                }
                
    }
}
