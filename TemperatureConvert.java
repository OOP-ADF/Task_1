/*
Nama    : Arindra Rizky R
NIM     : 1103134466
Kelas   : IF-38-09
*/
package temperatureconvert;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner coba = new Scanner(System.in);
 
        String x;
        int menu;
        double n1, n2;

        for (x = "Y"; x.equals("Y") || x.equals("y");) {
            System.out.print("Masukkan suhu Celcius : ");
            n1 = input.nextDouble();
            System.out.println("MENU ");
            System.out.println("1. Convert to Reamur ");
            System.out.println("2. Convert to Fahrenheit ");
            System.out.println("3. Convert to Kelvin ");
            System.out.print("Pilih : ");
            menu = input.nextInt();
            switch (menu) {
                case 1: 
                {
                    n2 = 0.8 * n1;
                    System.out.println("Reamur : " + n2);
                    break;
                }
                case 2: 
                {
                    n2 = (1.8 * n1) + 32;
                    System.out.println("Fahrenheit : " + n2);
                    break;
                }
                case 3: 
                {
                    n2 = n1 + 273;
                    System.out.println("Kelvin : " + n2);
                    break;
                }
                default:
                    System.out.println("Inputan Salah!");
                break;
            }
            System.out.print("Coba lagi [Y/T]? ");
            x = coba.next();
        }
    }
}
