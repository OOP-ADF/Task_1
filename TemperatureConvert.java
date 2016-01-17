//Anggi Agustian - 1301144149

import java.util.Scanner;
public class TemperatureConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celcius, fahrenheit, kelvin, reamur;

        System.out.print("Masukan Suhu dalam Celcius  : ");
        celcius = input.nextInt();
        System.out.println("");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");
        System.out.print("Masukan Pilihan : ");
        int pilih = input.nextInt();
        System.out.println("");

        switch (pilih) {
            case 1:
                fahrenheit = (celcius * 9 / 5) + 32;
                System.out.println(celcius + " Celcius = " + fahrenheit + " Fahrenheit");
                break;
            case 2:
                kelvin = celcius + 273;
                System.out.println(celcius + " Celcius = " + kelvin + " Kelvin");
                break;
            case 3:
                reamur = celcius * 4 / 5;
                System.out.println(celcius + " Celcius = " + reamur + " Reamur");
                break;
            default:
                System.out.println("Pilihan salah");
                break;
        }
    }
}
