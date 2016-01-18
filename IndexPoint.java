// Ibnu Malik Al Kusaeri - 1301140359 - if38-09
import java.util.*;

public class IndexPoint {

    public static void main(String[] args) {
		
		int n1,n2,n3;
		double result,m1,m2,m3;
		String grade="index";
		//UTS
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the score of mid-term ");
		n1 = in.nextInt();
		m1=0.35*n1;
		//UAS
		System.out.println("Enter the score of end-term ");
		n2 = in.nextInt();
		m2=0.40*n2;
		//Quiz
		System.out.println("Enter the score of Quiz ");
		n3 = in.nextInt();
		m3=0.25*n3;
		//Result
		result=m1+m2+m3;
		if((85<=result) && (result<=100))
		{
			grade="excellent";
		}else if(75<=result && result<=84)
		{
			grade="very good";
		}else if(65<=result && result<=74)
		{
			grade="good";
		}else if(50<=result && result<=64)
		{
			grade="accepted";
		}else if(0<=result && result<=49)
		{
			grade="failed";
		}
		
		//output
		System.out.println("Report: ");
		System.out.println("mid-term: "+m1);
		System.out.println("end-term: "+m2);
		System.out.println("Quiz	: "+m3);
		System.out.println("Total	: "+result);
		System.out.println("Grade	:"+" "+grade);


    }
}

