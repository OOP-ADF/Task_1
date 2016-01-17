/*
 * Nama : Fauzy Alfy A.
 * Nim : 1301144269
 * Kelas : IF-38-09
 */
package indexpoint;
import java.util.Scanner; 
/**
 *
 * @author Metteora
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int uts, uas, quiz, nakhir ; 		
  		Scanner input = new Scanner(System.in);
  		
  		System.out.print("Masukkan Nilai UTS : ");
  		uts = input.nextInt();
  		
  		System.out.print("Masukkan Nilai UAS : ");
  		uas = input.nextInt();
  		
  		System.out.print("Masukkan Nilai QUIZ: ");
  		quiz = input.nextInt();
  	
  		nakhir = (int) ((0.35 * uts)+(0.4 * uas)+(0.25 * quiz)); 
                  
                  if (nakhir>85) {
                      System.out.print("Excellent");
                  }
                  else if (nakhir>75) {
                      System.out.print("Very Good");    
                  }
                 else if (nakhir>65) {
                      System.out.print("Good");    
                  }
                 else if (nakhir>50) {
                      System.out.print("Average");    
                  }
                  else if (nakhir<50) {
                      System.out.print("Fail");    
                  }
                  
      }
 }
