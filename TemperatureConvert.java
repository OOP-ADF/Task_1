//Anang Kurniawan 
//1301140192
//IF-38-02

import java.util.Scanner;

public class TemperatureConvert {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Bilangan (Dalam derajat Celcius): ");
        int c = input1.nextInt();
        System.out.println("Ingin Konversi ke: ");
        System.out.println("1. Kelvin");
        System.out.println("2. Reamur");
        System.out.println("3. Fahrenheit");
        System.out.print("Masukkan Pilihan: ");
        int pil = input2.nextInt();
        double hasil;
        if (pil == 1)
        {
            hasil = c + 273;
        }
        else if (pil == 2)
        {
            hasil = 0.8*c;
        }
        else
        {
            hasil = (1.8*c)+32;
        }
        System.out.println("Hasil Konversi: "+hasil);
    }
    
}
