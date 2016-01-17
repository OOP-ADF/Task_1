/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturconvert;
import java.util.Scanner;

/**
 *
 * @Author      : Rizky Muhammad Rifai
 * @Student ID  : 1301144019
 * @Class       : IF-38-09
 */
public class TemperaturConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int menu;
        double x;
        double y;
        System.out.println("Menu : ");
        System.out.println("[1]. Convert to Reamur ");
        System.out.println("[2]. Convert to Fahrenheit ");
        System.out.println("[3]. Convert to Kelvin ");
        System.out.print("Choose : ");
        menu = input.nextInt();
        
        switch (menu) {
            case 1:
                System.out.print("Input Celcius : ");
                x = input.nextDouble();
                y = x*4/5;
                System.out.println("Reamur : " + y);
                break;
            case 2:
                System.out.print("Input Celcius : ");
                x = input.nextDouble();
                y = 9/5*x+32;
                System.out.println("Fahrenheit : " + y);
                break;
            case 3:
                System.out.print("Input Celcius : ");
                x = input.nextDouble();
                y = x+273;
                System.out.println("Kelvin : " + y);
                break;
            default:
                break;
        }
            
    }
    
}
