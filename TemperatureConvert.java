/* Thoriq Abdul Aziz Muqodas
	1301144341
	IF-38-01
*/
import java.util.Scanner;

public class TemperatureConvert{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Celcius Temperature :");
		double temp = input.nextDouble();
		double f = (temp*9/5+32);
		double r = (temp*4/5);
		double k = (temp+273);
		System.out.println("1.Fahrenheit\n"+"2.Reamur\n"+"3.Kelvin\n");
		System.out.print("Konversi ke :");
		int pil = input.nextInt();
		
		switch (pil){
			case 1: System.out.println("Fahrenheit : "+f);
					break;
			case 2: System.out.println("Reamur : "+r);
					break;
			case 3: System.out.println("Kelvin : "+k);
					break;
		}
	}
}
