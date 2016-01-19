//Widya Wirachantika 1301144011 IF-38-01

import java.util.Scanner;

public class TemperatureConvert {
    static void Fahrenheit (double f){
        double r = 4.0/9.0 *f;
	      System.out.println(r + " degree Reamur");
        double c = 5.0 / 9.0 * f-32.0;
	      System.out.println(c + " degree Celcius");
        double k = 5.0/9.0 * f-32.0+273.0;
	      System.out.println(k + " degree Kelvin");				
    }
    
    static void Reamur(double r){
        double f = 9.0/4.0*r+32.0;
	      System.out.println(f + " degree Fahrenheit");
        double c = 5.0/4.0*r;
	      System.out.println(c + " degree Celcius");
        double k = 5.0/4.0*r +273.0;
	      System.out.println(k + " degree Kelvin");				
    }
    
    static void Celcius(double c){
        double f = 9.0/5.0*c+32.0;
	      System.out.println(f + " degree Fahrenheit");
        double r = 4.0/5.0*c;
	      System.out.println(r + " degree Reamur");
        double k = c+273.0;
	      System.out.println(k + " degree Kelvin");				
    }
    
    static void Kelvin(double k){
        double f = k*1.8-459.67;
	      System.out.println(f + " degree Fahrenheit");
        double r = k - 273.15 * 0.8;
	      System.out.println(r + " degree Reamur");
        double c = k - 273.15;
	      System.out.println(k + " degree Celcius");				
    }

  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    		System.out.println("Temperature Convert");
    		System.out.println("1. Fahrenheit");
    		System.out.println("2. Reamur");
    		System.out.println("3. Celcius");
        System.out.println("4. Kelvin");
    		System.out.println("Enter a number: ");
    		int input = scan.nextInt();
    		switch (input){
    			case(1) :
    			{
                                System.out.println("Enter degree's Fahrenheit: ");
                                double fh = scan.nextDouble();
                                Fahrenheit(fh);
    			}
                            case(2) :
    			{
                                System.out.println("Enter degree's Reamur: ");
                                double re = scan.nextDouble();
                                Reamur(re);
    			}
                            case(3) :
    			{
                                System.out.println("Enter degree's Celcius: ");
                                double cl = scan.nextDouble();
                                Celcius(cl);
    			}
                            case(4) :
    			{
                                System.out.println("Enter degree's Kelvin: ");
                                double kl = scan.nextDouble();
                                Kelvin(kl);
    			}
    		}
    }
    
}	
