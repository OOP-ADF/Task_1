/*
Biyan Ilham Akbar
1301144319
IF-38-09
 */
package temperatureconvert;
import java.util.Scanner;

/**
 *
 * @author Biyan Ilham Akbar
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float celcius;
        float farenheit;
        float reamur;
        double kelvin;
        
        System.out.println("===--MESIN KONVERSI SUHU--===");
        System.out.println("Masukkan besar suhu (Celcius) : ");
        Scanner term = new Scanner(System.in);
        celcius = term.nextFloat();
		System.out.println();
        System.out.println("Pilih Jenis Satuan Suhu : ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Reamur");
        System.out.println("3. Kelvin");
        System.out.println("Pilihan : ");
        int angk = term.nextInt();
        if (angk == 1) {
            farenheit = celcius * 9/5 + 32;
            System.out.println(celcius + " C = " + farenheit + " F");
        } 
        else if (angk == 2) {
            reamur = (celcius * 4/5);
            System.out.println(celcius + " C = " + reamur + " R");
        }
        else if (angk == 3) {
            kelvin = (celcius + 273.15);
            System.out.println(celcius + " C = " + kelvin + " K");
        }
        else {
            System.out.println("Tidak Tersedia !!");
        }
        
        
    }
    
}
