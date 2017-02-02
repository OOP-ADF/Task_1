//Irvan Nur Apendi 1301154208 IF-39-12
import java.util.Scanner;
public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu yang akan di convert : ");
        int suhu = input.nextInt();
        System.out.println("Pilih akan di convert ke mana : ");
        System.out.println("1. Reamur");
        System.out.println("2. Kelvin");
        System.out.println("3. Fahrenheit");
        
        double hasil;
        int pilihan = input.nextInt();
        if (pilihan == 1) 
        { 
            hasil = 0.8 * suhu;
            System.out.print("Hasilnya adalah = " + hasil + "Reamur");
        }
        if (pilihan == 2)
        {
            hasil = 273 + suhu;
            System.out.print("Hasilnya adalah = " + hasil + "Kelvin");
        }
        if (pilihan == 3) 
        {
            hasil = (9/5 * suhu) + 32;
            System.out.print("Hasilnya adalah = " + hasil + "Fahrenheit");
    }
        else 
        {
            System.out.print("Menu yang di input tidak ada di menu ");
        }
    }
}
