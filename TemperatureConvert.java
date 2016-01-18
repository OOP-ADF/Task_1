/*
Nama : Fatima Nurshafarani
NIM	 : 1301144245
Kelas : IF-38-01
*/
import java.util.Scanner;

public class TemperatureConvert {

    static void hitCelcius(double cel) {
        double f = ((9.0/5.0) * cel) + 32.0;
        System.out.println("Fahrenheit : " + f);
        double r = ((4.0/5.0) * cel);
        System.out.println("Reamur : " + r);
        double k = (cel + 273.0);
        System.out.println("Kelvin : " + k);
    }
    
    static void hitReamur(double rea){
        double c = ((5.0/4.0) * rea);
        System.out.println("Celcius : " + c);
        double f = ((9.0/4.0) * rea) + 32.0;
        System.out.println("Fahrenheit : " + f);
        double k = ((5.0/4.0) * rea) + 273.0;
        System.out.println("Kelvin : " + k);
    }
    
     static void hitFahrenheit(double fah){
        double c = ((5.0/9.0) * (fah - 32.0));
        System.out.println("Celcius : " + c);
        double r = ((4.0/9.0) * (fah - 32.0));
        System.out.println("Reamur : " + r);
        double k = ((5.0/9.0) * (fah - 32.0)) + 273.0;
        System.out.println("Kelvin : " + k);
    }
     
      static void hitKelvin(double kel){
        double c = (kel - 273.0);
        System.out.println("Celcius : " + c);
        double f = ((9.0/5.0) * (kel - 273.0)) + 32.0;
        System.out.println("Fahrenheit : " + f);
        double r = ((4.0/5.0) * (kel - 273.0));
        System.out.println("Reamur : " + r);
    }
   
    public static void main(String[] args) {
        int inp;
        double c;
        double r;
        double f;
        double k;
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.println("Menu : ");
        System.out.println("1. Hitung Celcius");
        System.out.println("2. Hitung Reamur");
        System.out.println("3. Hitung Fahrenheit");
        System.out.println("4. Hitung Kelvin");
        System.out.println("Pilih : ");
        menu = input.nextInt();
        
        switch (menu){
            case 1:
                System.out.println("Masukkan Celcius : ");
                inp = input.nextInt();
                c = (double) inp;
                hitCelcius(c);
                break;
            case 2:
                System.out.println("Masukkan Reamur : ");
                inp = input.nextInt();
                r = (double) inp;
                hitReamur(r);
                break;
            case 3:
                System.out.println("Masukkan Fahrenheit : ");
                inp = input.nextInt();
                f = (double) inp;
                hitFahrenheit(f);
                break;
            case 4:
                System.out.println("Masukkan Kelvin : ");
                inp = input.nextInt();
                k = (double) inp;
                hitKelvin(k);
                break;
        }
    }
}
