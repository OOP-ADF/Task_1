//Elsa Alifah Wijaya 1301144021 IF3801
package indexpoint;
import java.util.Scanner;
public class IndexPoint{
	public static void main(String[] args){
		Scanner uts=new Scanner(Systme.in);
		Scanner uas=new Scanner(Systme.in);
		Scanner quiz=new Scanner(Systme.in);
		System.out.print("Nilai UTS: ");
		int a=uts.nextInt();
		System.out.println();
		System.out.print("Nilai UAS: ");
		int b=uas.nextInt();
		System.out.println();
		System.out.print("Nilai Quiz: ");
		int c=quiz.nextInt();
		System.out.println();
		double total=((0.35*a)+(0.4*b)+(0.25*c));
		if((total>=85)&&(total<=100)){
			System.out.println("EXCELLENT");
		}
		else if((total>=75)&&(total<=84)){
			System.out.println("VERY GOOD");
		}
		else if((total>=65)&&(total<=74)){
			System.out.println("GOOD");
		}
		else if((total>=50)&&(total<=64)){
			System.out.println("ACCEPTABLE");
		}
		else if((total<=49)){
			System.out.println("FAILED");
		}
	}
}
