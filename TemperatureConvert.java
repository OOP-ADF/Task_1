/*
 Muhammad Arif Kurniawan
 1301144091
 IF-38-01
*/
package task_1;

import java.util.Scanner;

/**
 *
 * @author Kurniawan
 */
public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
	System.out.print("Masukkan temperatur dalam Celcius: ");  
	int c = input.nextInt();  
 	System.out.println("===================================");	  
	System.out.println("Convert ke: ");  
	System.out.println("1. Reamur");  
	System.out.println("2. Kelvin");  
 	System.out.println("3. Fahrenheit");  
 	System.out.println("===================================");  
	System.out.print("Masukkan pilihan: ");  
	int pil = input.nextInt();    				  
	switch(pil)  
	{  
            case 1:   
                    double r = 0.8 * c;  
                    System.out.println("Reamur = " + r);  
                    break;  
            case 2:   
                    double k = c + 273.15;  
                    System.out.println("Kelvin = " + k);  
                    break;  
            case 3:   
                    double f = (c * 1.8) + 32;  
                    System.out.println("Fahrenheit = " + f);  
                    break;  
            default:   
                    System.out.println("Pilihan tidak tersedia, hanya 1-3");  
                    break;  
        }   
    }
}
