/* Ferdy Dian Anugrah 
   1301140035
   IF 38 05 */

import java.util.Scanner;
public class TemperatureConvert {

    public static void main(String[] args) {
		Double celcius,fahrenheit,reamur,kelvin;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Celcius : ");
		celcius = input.nextDouble();
		fahrenheit = (celcius*1.8)+32;
		reamur = (celcius*0.8);
		kelvin = (celcius + 273);
		
		System.out.println("Celcius : " +celcius);
		System.out.println("------------");
		System.out.println("Conversion Results");
		System.out.println("Fahrenheit : " +fahrenheit);
		System.out.println("Reamur : " +reamur);
		System.out.println("Kelvin : " +kelvin);
    
}
}