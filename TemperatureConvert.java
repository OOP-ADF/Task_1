/* Nama		: M.Widadio Ilham
  * Nim		: 1301154306
  * Kelas	: IF 39-12
  */
import java.util.Scanner;

public class TemperatureConvert {
     public static void main(String[] args) {
         Scanner temperature = new Scanner(System.in);
         System.out.println("Masukkan Suhu dalam celcius : ");
         int input = temperature.nextInt();
         System.out.println("Pilih suhu yang akan di convert ke mana : ");
         System.out.println("1. Reamur");
         System.out.println("2. Kelvin");
         System.out.println("3. Fahrenheit");
         
         double h;
         int pilih = temperature.nextInt();
         if (pilih == 1) 
         { 
             h = 0.8 * input;
            System.out.print("Hasilnya adalah = " + h + "Reamur");
         }
         if (pilih == 2)
         {
             h = 273 + input;
             System.out.print("Hasilnya adalah = " + h + "Kelvin");
         }
         if (pilih == 3) 
        {
             h = (9/5 * input) + 32;
             System.out.print("Hasilnya adalah = " + h + "Fahrenheit");
         }
         else if (pilih > 3)
         {
             System.out.print("Menu yang di input tidak ada di menu ");
         }
     }
 
   
 }