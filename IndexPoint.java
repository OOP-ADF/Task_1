//Fauzan Ramadhan S
//IF 38-09
//1301140339
import java.util.*;

public class IndexPoint {

    public static void main(String[] args) {
		
		int uts,uas,kuis;
		double hasil;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Masukan nilai UTS: ");
		uts = in.nextInt();
		System.out.print("Masukan nilai UAS: ");
		uas = in.nextInt();
		System.out.print("Masukan nilai Kuis:  ");
		kuis = in.nextInt();
		hasil=((0.35 * uts) + (0.4 * uas) + (0.25 * kuis));
		if((85<=hasil) && (hasil<=100))
		{
			 System.out.print("Hasil: " + hasil);
			 System.out.println("Grade: Excellent");
			 
		}else if(75<=hasil && hasil<=84)
		{
			System.out.print("Hasil: " + hasil);
			System.out.println("Grade: Very Good");
		}else if(65<=hasil && hasil<=74)
		{
			System.out.print("Hasil: " + hasil);
			 System.out.println("Grade: Good");
		}else if(50<=hasil && hasil<=64)
		{
			System.out.print("Hasil: " + hasil);
			System.out.println("Grade: Accepted");
		}else if(0<=hasil && hasil<=49)
		{
			System.out.print("Hasil " + hasil);
			System.out.println("Grade: Failed");
		}
		
		
	

    }
}

