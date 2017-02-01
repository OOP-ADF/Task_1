/* Nama  : Faishal Wafi N
   NIM   : 1301154222
   Kelas : IF-39-12
*/

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Masukan suhu : ");
        int c = cin.nextInt();
        
        System.out.println("Konvert ke : ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Pilihan : ");
        int pil = cin.nextInt();
        
        double hasil;
        
        switch (pil) {
            case 1:
                hasil = c*4/5;
                System.out.println("Hasil = "+hasil+" Reamur");
                break;
            case 2:
                hasil = (9/5*c) + 32;
                System.out.println("Hasil = "+hasil+" Fahrenheit");
                break;
            case 3:
                hasil = 273 + c;
                System.out.println("Hasil = "+hasil+" Kelvin");
                break;
            default:
                break;
        }
    }
    
}