/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

import java.util.Scanner;

/**
 *
 * @author 1301154404_Muhammad Rifky Putra Ananda_IF39-12
 */
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner (System.in);
        System.out.print("Masukkan suhu Celsius : ");
        double cel = cin.nextInt();
        double rea = (4*cel)/5;
        double fah = ((9/5)*cel)+32;
        double kel = cel+273;
        
        System.out.println("= "+rea+" Reamur");
        System.out.println("= "+fah+" Fahrenheit");
        System.out.println("= "+kel+" Kelvin");
        
    }
    
}
