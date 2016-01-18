// Ibnu Malik Al Kusaeri - 1301140359 - if38-09
import java.util.*;
import static java.lang.System.exit;

public class TemperatureConvert {

    public static void main(String[] args) {
		double c,r,f,k;
		int opt=0;
		Scanner in = new Scanner(System.in);
		while(opt!=4)
		{
		System.out.println("Temperature Converter");
		System.out.println("1. Celcius to Reamur\n2. Celcius to Fahrenheit \n3. Celcius to Kelvin\n4. Exit");
		System.out.println("Enter your Choice");
		opt = in.nextInt();
		switch(opt){
			case 1:
			{
				System.out.println("Enter Celcius Degrees");
				c= in.nextInt();
				r=c*0.8;
				System.out.println("Reamur	: "+r);
				break;
			}
			case 2:
			{
				System.out.println("Enter Celcius Degrees");
				c= in.nextInt();
				f=(c*1.8)+32;
				System.out.println("Reamur	: "+f);
				break;
			}
			case 3:
			{
				System.out.println("Enter Celcius Degrees");
				c= in.nextInt();
				k=c+273.15;
				System.out.println("Reamur	: "+k);
				break;
			}
			case 4:
			{
				exit(0);
			}
			default:
				System.out.println("Invalid Choice!");
				break;
		}
		}
		
		
    }

}
