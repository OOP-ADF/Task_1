import java.util.Scanner;

/**
 * Eka Putri
 * 1301144312
 * IF 38 02
 */

public class TemperatureConvert {

    
    public static void main(String[] args) {
        
        Scanner masukkan = new Scanner(System.in);
        
        int c,n;
        double f,k,r;
        
        System.out.println("Masukkan Angka Derajat Celcius : ");
        c = masukkan.nextInt();
        
       System.out.println("=======================================");
       
        System.out.println("MENU");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");
        System.out.print("Masukkan Pilihan : ");
        n = masukkan.nextInt();
        
        switch(n) {
            case 1 :
                f = c * 1.8 + 32;
                System.out.println(c+ " Celcius = "+f+" Fahrenheit");
                break;
            case 2 :
                k = c + 273.15;
                System.out.println(c+ " Celcius = "+k+" Kelvin");
                break;
            case 3 :
                r = c * 0.8;
                System.out.println(c+ " Celcius = "+r+" Reamur");
                break;
        }
    }
}
