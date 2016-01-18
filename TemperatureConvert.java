/*
 Damar Radistya
 1103120164
 IF-38-09
 */

import java.util.Scanner;

public class TemperatureConvert {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String check="y";
        

        System.out.println("\nTEMPERATURE CONVERTER\n");

        System.out.print("input degrees to convert : ");
        double temp = scn.nextDouble();

        while ("y".equals(check)) {
            System.out.println("\n==AVAILABLE CONVERSION==");
            System.out.println("[1]Celcius to Reamur");
            System.out.println("[2]Celcius to Farenheit");
            System.out.println("[3]Celcius to Kelvin ");
            System.out.print("\nChoice :[1/2/3] ");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    double R = (0.8 * temp);
                    System.out.println(temp + "C = " + R + "R");
                    break;                   
                case 2:
                    double F = ((1.8 * temp) + 32);
                    System.out.println(temp + "C = " + F + "F");
                    break;
                case 3:
                    double K = (temp + 273.15);
                    System.out.println(temp + "C = " + K + "K");
                    break;  
            }
            System.out.print("\nConvert to another temperature? (y/n) :");
            check = scn.next();
        }
        System.out.println("Exit");
    }
}
