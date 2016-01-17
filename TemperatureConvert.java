/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author Riartha
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float temperatur;
        int pilihan;
        double angkaubah;
        
        Scanner pilih = new Scanner(System.in);
        
        System.out.println("1.Convert To Reamur");
        System.out.println("2.Convert To Fahrenheit");
        System.out.println("3.Convert To Kelvin");
        System.out.println("Masukkan temperatur (celcius) : ");
        temperatur=pilih.nextFloat();
        System.out.println("Pilih menu : ");
        pilihan=pilih.nextInt();
        
        switch (pilihan) {
            case 1:
                angkaubah=temperatur*4/5;
                System.out.println("Temperatur dalam reamur yaitu "+angkaubah);
                break;
            case 2:
                angkaubah=temperatur*9/5+32;
                System.out.println("Temperatur dalam Fahrenheit yaitu "+angkaubah);
                break;
            case 3:
                angkaubah=temperatur+273.15;
                System.out.println("Temperatur dalam Kelvin yaitu "+angkaubah);
                break;
            default:
                break;
        }
    }
    
}
