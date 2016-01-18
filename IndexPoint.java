import java.util.Scanner;
//Hirianinda Malsegianty S.
	//1301140262
	//IF - 38 - 02
 public class IndexPoint {
 	public static void main(String[] args){
 
         		double uas, uts, quiz, ha;
 		
 		Scanner nl = new Scanner(System.in);
 		
 		System.out.print("Masukkan Nilai UAS: ");
 		uas = nl.nextDouble();
 		
 		System.out.print("Masukkan Nilai UTS: ");
 		uts = nl.nextDouble();
 		
 		System.out.print("Masukkan Nilai QUIZ: ");
		quiz = nl.nextDouble();
 		
 		ha = (0.35 * uts)+(0.4 * uas)+(0.25 * quiz); 
                 
                 if ((ha>84) & (ha<101)) {
                     System.out.print("Excellent");
                 }
                else if (ha>74) {
                    System.out.print("Very Good");    
                }
                 else if (ha>64) {
                    System.out.print("Good");    
                }
                 else if (ha>49) {
                     System.out.print("Accepted");    
                 }
                 else if (ha > -1) {
                     System.out.print("Failed");    
                 }
                 
     }
 }
