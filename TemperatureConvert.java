package task_1;

import java.util.Scanner;

/**
 *
 * @author Ridwan Hadiansyah
 * 1301154273 / IF 39-07
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);
        System.out.print("Masukkan Suhu Dalam Bentuk Celcius : ");
        float input = cin.nextFloat();
        float hasilF = input * 9/5 + 32;
        float hasilR = input * 4/5;
        float hasilK = input + 273;
        System.out.println("Maka Hasilnya Adalah : ");
        System.out.println("Celcius : " +input);
        System.out.println("Reamur : " +hasilR);
        System.out.println("Farenheit : " +hasilF);
        System.out.println("Kelvin : " +hasilK);
    }
}
