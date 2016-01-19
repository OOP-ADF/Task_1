import java.util.Scanner;

public class IndeksNilai{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input nilai 1 : ");
		double nilai1 = input.nextInt();
		System.out.println("Input nilai 2 : ");
		double nilai2 = input.nextInt();
		System.out.println("Input nilai 3 : ");
		double nilai3 = input.nextInt();
		
		double hasil = (nilai1*0.4 + nilai2*0.4 + nilai3*0.2);
		
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
