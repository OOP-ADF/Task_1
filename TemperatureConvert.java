/*
 * Lailis Sa'adah
 * 1301154502
 * If39-12
 */
package pkg1301154502_lailissaadah_if3912_task1;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class TemperatureConvert {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai celcius: ");
        double celcius = input.nextDouble();
        System.out.println(" Convert to ");
        System.out.println(" 1.fahrenheit");
        System.out.println(" 2. reamur ");
        System.out.println(" 3.kelvin ");
        System.out.print(" pilih : ");
        int pilih = input.nextInt();
        double fahrenheit,reamur,kelvin;
        if (pilih == 1){
        fahrenheit= celcius*1.8+32;
        System.out.println("fahrenheit :"+fahrenheit);
        }
        else if (pilih == 2){
        reamur= celcius*0.8;
        System.out.println("reamur :"+reamur);
        }
        else if (pilih == 3){
        kelvin=celcius+273.15;
        System.out.println("kelvin :"+kelvin);
        } else
            System.out.println("Pilihan anda tidak ada");
    }
    
}
