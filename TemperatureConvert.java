//Fauzan Ramadhan S
//IF 38-09
//1301140339
import java.util.*;

public class TemperatureConvert {

    public static void main(String[] args) {
		double celcius,reamur,fahrenheit,kelvin;
		int pil;
		Scanner in = new Scanner(System.in);
		System.out.println("1.Rubah Celcius ke Reamur");
		System.out.println("2.Rubah Celcius ke Fahrenheit");
		System.out.println("3.Rubah Celcius ke Kelvin");
		System.out.print("Masukan Pilihan: ");
		pil = in.nextInt();
		switch(pil){
			case 1:
			{
				System.out.print("Masukan suhu Celcius :");
				celcius= in.nextInt();
				reamur=celcius*0.8;
				System.out.println("Reamur	: "+reamur);
				break;
			}
			case 2:
			{
				System.out.print("Masukan suhu Celcius: ");
				celcius= in.nextInt();
				fahrenheit=(celcius*1.8)+32;
				System.out.println("Fahrenheit	: "+fahrenheit);
				break;
			}
			case 3:
			{
				System.out.print("Masukan suhu Celcius: ");
				celcius= in.nextInt();
				kelvin=celcius+273.15;
				System.out.println("Kelvin	: "+kelvin);
				break;
			}
			
		}
		
		
    }

}
