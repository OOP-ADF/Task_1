/**
 *
 * @author Fitrah Bima Nusantara
 * Class : IF 38 09
 * Student ID : 1301140295
 */
package temperatureconvert1;
import java.util.Scanner;
public class TemperatureConvert1 {
    public static void main(String[] args) {
        double cel,rea,fah,kel;
        
            System.out.println("Temperature Converter");
                
                    Scanner celcius = new Scanner (System.in);  
                    System.out.println("Nilai celcius:");  
                    cel = celcius.nextInt();
                    rea=(0.8*cel);
                    fah=(1.8*cel)+32;
                    kel=(cel+273);
                    System.out.println("Celcius     : "+cel); 
                    System.out.println("Reamur      : "+rea); 
                    System.out.println("Fahrenheit  : "+fah); 
                    System.out.println("Kelvin      : "+kel); 
            }
 }

