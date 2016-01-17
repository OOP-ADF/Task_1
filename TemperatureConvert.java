/* Nama : Basado Jurianto Sitorus
 * Kelas :IF-39-02
 * NIM : 1301140002
 */
package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author Bee
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===== TEMPERATUR CONVERT =====");
        System.out.println("1.CELCIUS TO REAMURE ");
        System.out.println("2.CELCIUS TO FAHRENHEIT");
        System.out.println("3.CELCIUS TO KELVIN");
        Scanner suhu = new Scanner (System.in);
        System.out.print("Pilih menu :");
        int menu = suhu.nextInt();
        
        if (menu == 1){
            System.out.println("Temperature in Celcius :");
            int celcius = suhu.nextInt();
            int reamure = (int) (0.8 * celcius);
            System.out.println("Temperature in Reamure :"+reamure);
        }
        if (menu == 2){
            System.out.println("Temperature in Celcius :");
            int celcius = suhu.nextInt();
            int fahreinheit = (int) ((1.8 * celcius)+32);
            System.out.println("Temperature in Fahreinhet ="+fahreinheit);
        }
        if (menu == 3) {
            System.out.println("Temperature in Celcius :");
            int celcius = suhu.nextInt();
            int kelvin = (int) (celcius + 273);
            System.out.println("Temperature in Kelvin ="+kelvin);
        }
    }
}

