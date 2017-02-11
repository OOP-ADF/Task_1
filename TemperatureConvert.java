/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu celcius: ");
        int celcius = input.nextInt();
        int reamur = celcius*4/5;
        int fahrenheit = celcius*9/5+32;
        int kelvin = celcius+273;
        int menu = 1;
        while (menu>0){
        System.out.println("Menu convert");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("0. Exit");
        System.out.print("Pilih menu : ");
        menu = input.nextInt();
        switch (menu){
            case 1: 
                System.out.println(reamur);
                break;
            case 2:
                System.out.println(fahrenheit);
                break;
            case 3:
                System.out.println(kelvin);
                break;
        }
    }
    
 }
}
