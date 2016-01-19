/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//ANNISA RIZKI PRATIWI WIBOWO
//130114391
//IF-38-01

package temperatureconvert;
import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner celcius = new Scanner(System.in);
        Scanner pil = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celcius: ");
        int c=celcius.nextInt();
        System.out.println("Convert Celcius ke ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Masukkan Pilihan: ");
        int p=pil.nextInt();
        switch(p)
        {
            case 1:
            {
                double r=(c*4/5);
                System.out.println("Hasil Convert adalah "+r+" Reamur");
                break;
            }
            case 2:
            {
                double f=((c*9/5)+32);
                System.out.println("Hasil Convert adalah "+f+" Fahrenheit");
                break;
            }
            case 3:
            {
                double k=(c+273);
                System.out.println("Hasil Convert adalah "+k+" Kelvin");
                break;
            }
            default: 
                throw new AssertionError();
        }
    }
    
}
