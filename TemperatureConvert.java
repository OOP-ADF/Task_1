/*
 * Nama     : GENTUR CIPTO TRI ATMAJA
 * NIM      : 1301140239
 * KELAS    : IF 38-09
 */
package temperatureconvert;

import java.util.Scanner;

/**
 *
 * @author ENTUR CIPTO TRI ATMAJA
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilihan; 
        double cel;
        double fah;
        double kel; 
        double ream;
        int i; 
        Scanner scan = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++Temperature Converter++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.print("Masukkan Suhu dalam Celcius : ");
        cel = scan.nextInt();
                    
            System.out.println("++++++++++++++++++++++++++++++++++Pilihan Suhu Converter+++++++++++++++++++++++++++++++++");
            System.out.println("1. Fahrenheit       2. Kelvin       3. Reamur");
            System.out.print("Pilihan : ");
            pilihan = scan.nextInt();
            if (pilihan == 1)
                {
                    fah = ((9 * cel)/5)+32;
                    System.out.print("Celcius : ");
                    System.out.println(cel);
                    System.out.print("Fahrenheit :");
                    System.out.print(fah);
                }
            else if (pilihan == 2)
                {
                    kel = (cel +273);
                    System.out.print("Celcius : ");
                    System.out.println(cel);
                    System.out.print("Kelvin :");
                    System.out.print(kel);
                }
            else if (pilihan == 3)
                {
                    ream = ((4 * cel)/5);
                    System.out.print("Celcius : ");
                    System.out.println(cel);
                    System.out.print("Reamur :");
                    System.out.print(ream);
                }
    }
}
