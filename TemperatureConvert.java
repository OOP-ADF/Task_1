/* Reynaldi Ananda Pane
   IF-38-09
   1301144099
*/
package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author Reynaldi Pane
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float cel;
        float far;
        float rea;
        double kev;
        
        System.out.println("***TEMPERATURE CONVERT***");
        System.out.println("Masukkan suhu dalam celcius : ");
        Scanner x = new Scanner(System.in);
        cel = x.nextFloat();
        System.out.println("Pilih konversi : ");
        System.out.println("1. Ke Fahrenheit ");
        System.out.println("2. Ke Reamur ");
        System.out.println("3. Ke Kelvin ");
        System.out.println("Pilihan : ");
        int pil = x.nextInt();
        if (pil == 1) {
            far = (cel * 9/5 + 32);
            System.out.println(cel + " celcius = " + far + " fahrenheit");
        } 
        else if (pil == 2) {
            rea = (cel * 4/5);
            System.out.println(cel + " celcius = " + rea + " reamur");
        }
        else if (pil == 3) {
            kev = (cel + 273.15);
            System.out.println(cel + " celcius = " + kev + " kelvin");
        }
        else {
            System.out.println("Pilihan tidak ada !");
        }
        
        
    }
    
}
