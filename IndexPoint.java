//Nama	: Reinaldi
//Nim	: 1301144362
//Kelas	: IF-38-02

import java.util.Scanner;
public class IndexPoint{
	public static void main(String[] args){
		double uas;
		double uts;
		double quiz;
		double hasil;
		Scanner input= new Scanner(System.in);
		System.out.print("UAS = ");
		uas=input.nextDouble();
		System.out.print("UTS = ");
		uts=input.nextDouble();
		System.out.print("Quiz = ");
		quiz=input.nextDouble();
		hasil=(0.35*uts)+(0.4*uas)+(0.25*quiz);
		if (hasil>=85) {
			System.out.print("Excellent");
		}
		else if ((hasil>=75) && (hasil<=84)){
			System.out.print("Very Good");
		}
		else if ((hasil>=65) && (hasil<=74)){
			System.out.print("Good");
		}
		else if ((hasil>=50) && (hasil<=64)){
			System.out.print("Accepted");
		}
		else{
			System.out.print("Failed");
		}
	}
}
	
