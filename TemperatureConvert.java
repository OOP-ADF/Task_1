//Firda Aminy Ma'ruf 1301144311 IF3801
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverternew;

import java.util.Scanner;

/**
 *
 * @author Iwan Ma'ruf
 */
public class TemperatureConverterNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pil, cel;
        double fah, rea, kel;
        
        Scanner celcius=new Scanner(System.in);
        Scanner pilihan=new Scanner(System.in);
        System.out.print("Please enter the Celcius degree: ");
        cel=celcius.nextInt();
        do {
            System.out.println("Convert the Celcius into: ");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Reaumur");
            System.out.println("3. Kelvin");
            System.out.print("Enter the menu number that you choose: ");
            pil=pilihan.nextInt();
            switch(pil) {
            case 1:
            {
                fah=((cel*9/5)+32);
                System.out.println("The result of the convert is " +fah+ " Fahrenheit");
                break;
            }
            case 2:
            {
                rea=(cel*4/5);
                System.out.println("The result of the convert is " +rea+ " Reaumur");
                break;
            }
            case 3:
            {
                kel=(cel+273);
                System.out.println("The result of the convert is " +kel+ " Kelvin");
                break;
            }
            }
        } while (pil < 3);
    }
    
}

       /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverternew;

import java.util.Scanner;

/**
 *
 * @author Iwan Ma'ruf
 */
public class TemperatureConverterNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pil, cel;
        double fah, rea, kel;
        
        Scanner celcius=new Scanner(System.in);
        Scanner pilihan=new Scanner(System.in);
        System.out.print("Please enter the Celcius degree: ");
        cel=celcius.nextInt();
        do {
            System.out.println("Convert the Celcius into: ");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Reaumur");
            System.out.println("3. Kelvin");
            System.out.print("Enter the menu number that you choose: ");
            pil=pilihan.nextInt();
            switch(pil) {
            case 1:
            {
                fah=((cel*9/5)+32);
                System.out.println("The result of the convert is " +fah+ " Fahrenheit");
                break;
            }
            case 2:
            {
                rea=(cel*4/5);
                System.out.println("The result of the convert is " +rea+ " Reaumur");
                break;
            }
            case 3:
            {
                kel=(cel+273);
                System.out.println("The result of the convert is " +kel+ " Kelvin");
                break;
            }
            }
        } while (pil < 3);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverternew;

import java.util.Scanner;

/**
 *
 * @author Iwan Ma'ruf
 */
public class TemperatureConverterNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pil, cel;
        double fah, rea, kel;
        
        Scanner celcius=new Scanner(System.in);
        Scanner pilihan=new Scanner(System.in);
        System.out.print("Please enter the Celcius degree: ");
        cel=celcius.nextInt();
        do {
            System.out.println("Convert the Celcius into: ");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Reaumur");
            System.out.println("3. Kelvin");
            System.out.print("Enter the menu number that you choose: ");
            pil=pilihan.nextInt();
            switch(pil) {
            case 1:
            {
                fah=((cel*9/5)+32);
                System.out.println("The result of the convert is " +fah+ " Fahrenheit");
                break;
            }
            case 2:
            {
                rea=(cel*4/5);
                System.out.println("The result of the convert is " +rea+ " Reaumur");
                break;
            }
            case 3:
            {
                kel=(cel+273);
                System.out.println("The result of the convert is " +kel+ " Kelvin");
                break;
            }
            }
        } while (pil < 3);
    }
    
}
