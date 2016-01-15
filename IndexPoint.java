import java.util.Scanner;
public class IndexPoint {
	public static void main(String[] args) {
		double uts, uas, tugas, total;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your mid-term score : ");
		uts= input.nextDouble();
		System.out.print("Enter your end-term score : ");
		uas= input.nextDouble();
		System.out.print("Enter your quiz score : ");
		tugas= input.nextDouble();
		total=uts*0.35+uas*0.4+tugas*0.25;
		if (total>=85&&total<=100) {
			System.out.print("Your Score : Excellent");
		} else if (total>=75&&total<85) {
			System.out.print("Your Score : Very Good");
		} else if (total>=65&&total<75) {
			System.out.print("Your Score : Good");
		} else if (total>=50&&total<65) {
			System.out.print("Your Score : Accepted");
		} else if (total>=0&&total<50) {
			System.out.print("Your Score : Failed");
		} else {
			System.out.print("Your Score : Cheated");
		}
	}
}