/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

/**
 *
 * @author Rendy
 */

import java.util.Scanner;
public class suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Suhu (Dalam Celcius) : ");
        float temp = input.nextFloat();
        float Fahreinheit = temp * 9/5 + 32;
        float Reamur = temp * 4/5;
        float Kelvin = temp + 273;
        System.out.println("Reamur      : " +Reamur);
        System.out.println("Farenheit   : " +Fahreinheit);
        System.out.println("Kelvin      : " +Kelvin);
    }
}
    

