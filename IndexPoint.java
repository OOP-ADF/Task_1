/* Thoriq Abdul Aziz Muqodas
	1301144341
	IF-38-01
*/
import java.util.Scanner;

public class IndexPoint {

	public static void main(String[] args) {
		
		int uts,uas,quiz;
		double finalScore;
		String grade;
		Scanner score=new Scanner (System.in);
		
		System.out.print("Input UTS Score :");
		uts=score.nextInt();
		System.out.print("Input UAS Score :");
		uas=score.nextInt();
		System.out.print("Input quiz Score :");
		quiz=score.nextInt();
		finalScore=(uts*0.35)+(uas*0.4)+(quiz*0.25);
		
		if((finalScore>=85)&&(finalScore>=100)){
			System.out.println("Grade : Excelent");
		}
		else if(finalScore>=75){
			System.out.println("Grade : Very Good");
		}
		else if(finalScore>=65){
			System.out.println("Grade : Good");
		}
		else if(finalScore>=50){
			System.out.println("Grade : Accepted");
		}
		else{
			System.out.println("Grade : Failed");
		}
	}
}
