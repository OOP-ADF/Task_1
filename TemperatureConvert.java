//Elsa Alifah Wijaya 1301144021 IF3801
package temperatureconverter;
import java.util.Scanner;
public class TemperatureConverter{
	public static void main(String[] args){
		Scanner celcius=new Scanner(System.in);
		Scanner pilihan=new Scanner(System.in);
		System.out.print("Please enter the Celcius degree: ");
		int c=celcius.next.int();
		System.out.println("Convert the Celcius into: ");
		System.out.println("1. Kelvin ");
		System.out.println("2. Fahrenheit ");
		System.out.println("1. Reamur ");
		System.out.println("Enter the menu number that you choose: ");
		int p=pilihan.nextInt();
		switch(p){
			case 1:
			{
				double k=(c+273);
				Systemout.println("The result of the convert is "+k+" Kelvin");
				break;
			}
			case 2:
			{
				double f=((c*9/5)+32);
				Systemout.println("The result of the convert is "+f+" Fahrenheit");
				break;
			}
			case 1:
			{
				double r=(c*4/5);
				Systemout.println("The result of the convert is "+r+" Reamur");
				break;
			}
			default:
				throw new AssertionError();
		}
	}
}
