package TUGASPBO;

import java.util.Scanner;

/**
 *
 * @author Ergandhi Yudha Kurniawan 1301154147
 */
public class No3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.print("Masukkan Bilangan dalam Bentuk Celcius : ");
        double bilcelcius = Input.nextInt();
        
        System.out.println("Pilih Bentuk Tujuan : ");
        System.out.println("1. Fahrenheit ");
        System.out.println("2. Kelvin ");
        System.out.println("3. Reamur ");
        
        System.out.print("Masukkan Pilihan : ");
        int pilihan = Input.nextInt();
        double hasil = 0;
        
        switch (pilihan) {
            case 1:
                hasil =  1.8 * bilcelcius + 32;
                break;
            case 2:
                hasil = (273 + bilcelcius);
                break;
            case 3:
                hasil = 0.8 * bilcelcius;
                break;
            default:
                break;
        }
       
        System.out.println("Hasil : "+hasil);
        
    }
}
