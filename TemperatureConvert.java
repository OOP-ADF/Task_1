import java.util.Scanner;
public class TemperaturConverter{
	public static void main(String[] args){
		float f, c;
		f = 0;
		c = 0;
		int x;
		Scanner scan = new Scanner (System.in);
		System.out.println("Pilih 1 untuk C -> F dan 2 untuk F -> C");
		x = scan.nextInt();
		
		if (x == 1) {
			convertCtoF();
		}
		else{
			convertFtoC();
		}
	}
	
	public static void convertCtoF(){
		f = 0;
		c = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Input C : ")
		c = scan.nextfFloat();
		f = c*(9/5)+32;
		System.out.println(c+"derajat C adalah "+f+" derajat F");
	}
	
	public static void convertFtoC(){
		f = 0;
		c = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Input F : ");
		f = Scan.nextfFloat();
		c = (5/9)*(f-32);
		System.out.println(f+" derajat F adalah "+c+" derajat C");
	}
}
