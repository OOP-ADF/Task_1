/*
 Adzan Nugraha
 1301140249
 IF-38-09
 */
package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author Adzan Nugraha
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float celcius;
        float fahrenheit;
        double kelvin;
        float reamur;
        int pilihan;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Suhu (Celcius) : ");
        celcius = scan.nextFloat();
        
        System.out.println("1. Convert Ke Fahrenheit");
        System.out.println("2. Convert Ke Kelvin");
        System.out.println("3. Convert Ke Reamur");
        
        pilihan = scan.nextInt();
        
        if (pilihan == 1)
        {
            fahrenheit = (celcius * 9/5 + 32);
            System.out.println(celcius + " Celcius = " + fahrenheit + " fahrenheit");
        }
        else if (pilihan == 2)
        {
            kelvin = (celcius + 273.15);
            System.out.println(celcius + " Celcius = " + kelvin + " Kelvin");
        }
        else if (pilihan == 3)
        {
            reamur = (celcius * 4/5);
            System.out.println(celcius + " Celcius = " + reamur + " Reamur");
        }
        else
        {
            System.out.println("Error!");
        }
    }
    
}
