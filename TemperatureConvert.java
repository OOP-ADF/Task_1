//Nama : Aliya Nur Rezkita
//NIM : 1301144161
//Kelas : IF-38-01

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner celcius=new Scanner(System.in);
        System.out.print("Input suhu dalam celcius = ");
        int c=celcius.nextInt();
        
        System.out.println("Konversi ke: ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        Scanner pilihan=new Scanner(System.in);
        System.out.print("Masukkan Pilihan: ");
        int p=pilihan.nextInt();
        switch (p) {
            case 1:
                double r=(c*4/5);
                System.out.println(c + " Celcius = " + r + " Reamur");
                break;
            case 2:
                double f=((c*9/5)+32);
                System.out.println(c + " Celcius = " + f + " Fahrenheit");
                break;
            case 3:
                double k=(c+273);
                System.out.println(c + " Celcius = " + k + " Kelvin");
                break;
            
            default:
                throw new AssertionError();
        }
    }
}
