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
		
		if (hasil>=81 && hasil<=100){
			Systemout.println("A");
		}
		else if (hasil>=71 && hasil<=80){
			Systemout.println("B");
		}
		else if (hasil>=61 && hasil<=70){
			Systemout.println("C");
		}
		else if (hasil>=51 && hasil<=60){
			Systemout.println("D");
		}
		else{
			Systemout.println("E");
		}
	}
}
