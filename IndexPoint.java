	/* 
Nama  : Muchamad Fuad
NIM   : 1301140272
Kelas : IF-38-02
*/
import java.util.Scanner;
public class IndexPoint {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double uts,uas,quis,total;
		
		System.out.print("Input nilai UTS : ");
		uts = input.nextDouble();
		System.out.print("Input nilai UAS : ");
		uas = input.nextDouble();
		System.out.print("input nilai quis : ");
		quis = input.nextDouble();
		
		total = (0.35*uts)+(0.40*uas)+(0.25*quis);
		
		if (total < 50){
			System.out.println("Failed");
		}
		else if (total < 65){
			System.out.println("Accepted");
		}
		else if (total < 75){
			System.out.println("Good");
		}
		else if (total < 85){
			System.out.println("Very Good");
		}
		else if (total <101){
			System.out.println("Excellent");
		}
		
	}
	
}