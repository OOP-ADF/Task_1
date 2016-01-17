//Syahrizal Hafid Rozaqi - IF3802 - 1301144252
import java.util.Scanner;
public class TemperatureConvert {
    public static void main(String[] args) {
        
        System.out.println("KONVERSI SUHU");
        System.out.println("1. Celcius -> Reamur");
        System.out.println("2. Celcius -> Fahrenheit");
        System.out.println("3. Celcius -> Kelvin");
        Scanner pil = new Scanner (System.in);   
        System.out.print("Masukan pilihan : ");
        
        Scanner C = new Scanner (System.in);
        
        int pilih = pil.nextInt();
        if (pilih == 1){
            System.out.print("Masukan Angka Celcius : "); 
            int celcius = C.nextInt();
            int hasilR = (int) (celcius*0.8);
            System.out.println("Hasil Konversi Celcius to Reamur = "+hasilR); 
        }
        if (pilih == 2){
            System.out.print("Masukan Angka Celcius : "); 
            int celcius = C.nextInt();
            int hasilR = (int) ((celcius*1.8)+32);
            System.out.println("Hasil Konversi Celcius to Fahrenheit = "+hasilR);
        }
        if (pilih == 3){
            System.out.print("Masukan Angka Celcius : "); 
            int celcius = C.nextInt();
            int hasilR = (int) (celcius+273);
            System.out.println("Hasil Konversi Celcius to Fahrenheit = "+hasilR);
        }
    }
}