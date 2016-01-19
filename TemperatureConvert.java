import java.util.Scanner;
public class TemperaturConverter{
	public static void main(String[] args){
		float f, c;
		f = 0;
		c = 0;
		int x;
		Scanner scan = new Scanner (System.in);
		System.out.println("Pilih 1 untuk C -> F dan 2 untuk F -> C");
		System.out.println("Pilih 3 untuk C -> K dan 4 untuk C -> R");
		x = scan.nextInt();
		
		if (x == 1) {
			convertCtoF();
		}
		else if (x == 2){
			convertFtoC();
		}
		else if (x == 3){
			convertCtoK();
		}
		else if (x == 4){
			convertCtoR();
		}
	}
	
	public static void convertCtoF(){
		double f = 0;
		double c = 0;
		Scanner nilai = new Scanner (System.in);
		System.out.println("Input C : ");
		c = nilai.nextInt();
		f = c*(9.0/5.0)+32;
		System.out.println(c+"derajat C adalah "+f+" derajat F");
	}
	
	public static void convertFtoC(){
		double f = 0;
		double c = 0;
		Scanner nilai = new Scanner (System.in);
		System.out.println("Input F : ");
		f = nilai.nextInt();
		c = (5.0/9.0)*(f-32);
		System.out.println(f+" derajat F adalah "+c+" derajat C");
	}
	
	public static void convertCtoK(){
		double k = 0;
		double c = 0;
		Scanner nilai = new Scanner (System.in);
		System.out.println("Input C : ");
		c = nilai.nextInt();
		k = c+273.15;
		System.out.println(c+" derajat C adalah "+k+" derajat K");
	}
	
	public static void convertCtoR(){
		double r = 0;
		double c = 0;
		Scanner nilai = new Scanner (System.in);
		System.out.println("Input C : ");
		c = nilai.nextInt();
		r = c*0.8;
		System.out.println(c+" derajat C adalah "+r+" derajat Re");
	}
}
