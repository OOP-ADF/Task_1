/*
 Setyo Haryo A
 1301144059 
 IF-38-09
 */
package temperatur.convert;
import java.util.Scanner;

/**
 *
 * @author Setyo
 */
public class TemperaturConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        // TODO code application logic here
        float celcius;
        float fahrenheit;
        float reamur;
        double kelvin;
        int pilih;
        Scanner s = new Scanner(System.in);
        
        System.out.println("masukkan suhu awal (celcius) : ");
        celcius = s.nextFloat();
        
        System.out.println("1. ubah ke fahrenheit");
        System.out.println("2. ubah ke reamur");
        System.out.println("3. ubah ke kelvin");
    }
    
}
