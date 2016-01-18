/*
YAHYA ERMAYA
1301140199
IF-38-09
*/

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        float celcius;
        float fahrenheit;
        double kelvin;
        float reamur;
        int pil;
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Suhu (Celcius) : ");
        celcius = scan.nextFloat();
        
        System.out.println("1. Convert Ke Fahrenheit");
        System.out.println("2. Convert Ke Kelvin");
        System.out.println("3. Convert Ke Reamur");
        
        pil = scan.nextInt();
        
        if (pil == 1)
        {
            fahrenheit = (celcius * 9/5 + 32);
            System.out.println(celcius + " Celcius = " + fahrenheit + " fahrenheit");
        }
        else if (pil == 2)
        {
            kelvin = (celcius + 273.15);
            System.out.println(celcius + " Celcius = " + kelvin + " Kelvin");
        }
        else if (pil == 3)
        {
            reamur = (celcius * 4/5);
            System.out.println(celcius + " Celcius = " + reamur + " Reamur");
        }
        else
        {
            System.out.println("Error!");
        }
    }   
}