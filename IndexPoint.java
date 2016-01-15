//NAMA:Faishal Abdillah
//kelas:IF-38-02
//NIM:1301144232

import java.util.Scanner;
public class IndexPoint{
	public static void main(String[] args){
		double uas;
		double uts;
		double quis;
		double hasil ;
		Scanner input=new Scanner(System.in);
		System.out.println("-----Welcome to Index Point -----");
		System.out.print("your uas score = ");
		uas=input.nextDouble();
		System.out.print("your uts score = ");
		uts=input.nextDouble();
		System.out.print("your quis score = ");
		quis=input.nextDouble();
		hasil = (0.35*uts)+(0.4*uas)+(0.25*quis);
		if (hasil >= 85){
		System.out.print("Excellent");
		}
		else if ((hasil >= 75) && (hasil <=84)){
		System.out.print("very good");
		}
		else if((hasil >=65) && (hasil <=74)){
		System.out.print("Good");
		}
		else if((hasil >=50) && (hasil <=64)){
		System.out.print("accepted");
		}
		else{
		System.out.print("failed");
		}
	}
}
