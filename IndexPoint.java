import java.util.Scanner;

public class IndeksNilai{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input UTS : ");
		double uts = input.nextInt();
		System.out.println("Input UAS : ");
		double uas = input.nextInt();
		System.out.println("Input QUIZ : ");
		double quiz = input.nextInt();
		
		double hasil = (uts*0.35 + uas*0.40 + quiz*0.25);
		
		if (hasil>=85 && hasil<=100){
			Systemout.println("Excelent");
		}
		else if (hasil>=75 && hasil<=84){
			Systemout.println("Very Good");
		}
		else if (hasil>=65 && hasil<=74){
			Systemout.println("Good");
		}
		else if (hasil>=55 && hasil<=64){
			Systemout.println("Accepted");
		}
		else{
			Systemout.println("Failed");
		}
	}
}
