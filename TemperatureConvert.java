/*
 * Alfian Rahman Aziz
 * 1301150063
 * IF 39-07
 */
import java.util.Scanner;

public class TemperatureConvert {

    public static void main(String[] args) {
        int n;
        float c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of Celcius :");
        c = scan.nextInt();
        System.out.println("Choose to Convert");
        System.out.println ("1. Convert To Reamur");
        System.out.println("2. Convert to Fahrenheit");
        System.out.println("3. Convert To Kelvin");
        System.out.println("choose 1 to 3");
        n = scan.nextInt();
        switch (n) {
            case 1:
                ToReamur(c);
                break;
            case 2:
                ToFahrenheit(c);
                break;
            case 3:
                ToKelvin(c);
                break;
        }
    }

    public static void ToReamur(float c) {
        float r;
        Scanner scan = new Scanner(System.in);
        r = (float) (c * 0.8);
        System.out.println(c + " degrees Celcius is");
        System.out.println(r + " degrees Reamur");
    }

    public static void ToFahrenheit(float c) {
        float   f;
        Scanner scan = new Scanner(System.in);
        f = (float) (c * 1.8 + 32);
        System.out.println(c + " degrees Celcius is");
        System.out.println(f + " degrees Fahrenheit");
    }
    public static void ToKelvin(float c) {
        float k;
        Scanner scan = new Scanner(System.in);
        k = (float) (c + 273.15);
        System.out.println(c + " degrees Celcius is");
        System.out.println(k + " degrees Kelvin");
    }
}