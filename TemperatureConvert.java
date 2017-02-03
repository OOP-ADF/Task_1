import java.util.Scanner;

public class Suhu {

    public static void main(String[] args) {
        double a, reamur, fahrenheit, kelvin;
        int b;
        Scanner cinI = new Scanner(System.in);
        Scanner cinD = new Scanner(System.in);

        System.out.println("KONVERSI SUHU");
        System.out.println("============================");
        System.out.print("Masukkan Suhu Dalam Celcius : ");
        a = cinI.nextDouble();

        System.out.println("Konversi Suhu : ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Pilih Konversi No : ");
        b = cinD.nextInt();
        System.out.println();
        if (b == 1) {
            reamur = 0.8 * a;
            System.out.println("Hasil "+a+" di Convert Ke Reamur: " + reamur);
        } else if (b == 2) {
            fahrenheit = (1.8 * a) + 32;
            System.out.println("Hasil "+a+" di Convert Ke Fahrenheit: " + fahrenheit);
        } else if (b == 3) {
            kelvin = 273 + a;
            System.out.println("Hasil "+a+" di Convert Ke Kelvin: " + kelvin);
        }
    }

}
