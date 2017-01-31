/*
 * write a java program that ask user an input of number that represent a temperature in celcius degrees from 
 * ask the user the choices to convert the temperature to Reamur degrees from, Fahrenheit degrees from, or Kelvin
 * write the output
 *ask the user if he/she wants to convert the number to another degrees from
 */
package temperatureconvert;

import java.util.Scanner;
import static temperatureconvert.TemperatureConvert.in;

/**
 *
 * @author Hendrik Christian Janifer Simanjuntak
 * 1301150021
 * Kelas39-07
 */
public class TemperatureConvert {

    private static double na;
    private static int celc,pilih;
    static Scanner in = new Scanner(System.in);
    
    public void Reamur(){
        na = celc * 4/5;
        System.out.println(celc + " Celcius: "+ na +" Reamur" );
    }
    
    public void Fahrenheit(){
        na = celc * 9/5 + 32;
        System.out.println(celc + " Celcius: "+ na +" Fahrenheit");
    }
    
    public void Kelvin(){
        na = celc + 273.15;
        System.out.println(celc + " Celcius: "+ na +" Kelvin");
    }
    
    public void menu(){
        do{
            System.out.println("Choose To Convert");
            System.out.println("1. Celcius To Reamur");
            System.out.println("2. Celcius To Fahrenheit");
            System.out.println("3. Celcius To Kelvin");
            System.out.print("Choose Menu: ");
            pilih = in.nextInt();
        }while(pilih == 1 && pilih == 2 && pilih == 3 && pilih > 3);
    }
    
    public static void main(String[] args) {
        TemperatureConvert T = new TemperatureConvert();
        System.out.print("Masukkan Suhu: ");
        celc = in.nextInt();
      
        do{
            System.out.println();
            T.menu();
            System.out.println();
            do{
                if(pilih == 1){
                    T.Reamur();
                    System.out.println();
                }
                if(pilih == 2){
                    T.Fahrenheit();
                    System.out.println();
                }
                if(pilih == 3){
                    T.Kelvin();
                    System.out.println();
                }
                
                System.out.println("Apakah anda ingin ke menu convert ? Tekan '1' jika 'IYA' atau '2' jika 'TIDAK' ");
                System.out.print("Pilih: ");
                pilih = in.nextInt();
            }while(pilih != 2 && pilih == 1 && pilih > 2);
        }while(pilih == 1);
    }
}