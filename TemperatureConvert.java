/*
Name        : Adi Nugroho
Student ID  : 1301144271
Class       : IF-38-01
*/
package task_1.pkg1;
import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Temperature (in Celcius degree) : "); 
        int celcius = input.nextInt();
        System.out.println("Convert Temperature to : ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Reamur");
        System.out.println("3. Kelvin");
        System.out.println("Convert to ? : ");
        int choose =input.nextInt();
        switch (choose){
            case 1 :
                    double fahrenheit = (celcius * 1.8) + 32;  
                    System.out.println("Temperature on Fahrenheit degree is " + fahrenheit);  
                    break;
            case 2 :
                    double reamur = 0.8 * celcius;  
                    System.out.println("Temperature on Reamur degree is  " + reamur);
                    break; 
            case 3 :
                    double kelvin = celcius + 273.15;  
                    System.out.println("Temperature on Kelvin degree is " + kelvin);  
                    break;
        }       
    }   
}
