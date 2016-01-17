//Raja Ryan Pradana
//IF-38-02
//1301140302


import java.util.Scanner;
public class TemperatureConvert {
public static void main(String[] args) {
  System.out.println("KONVERSI SUHU");
        System.out.println("1. Celcius -> Reamur");
        System.out.println("2. Celcius -> Fahrenheit");
        System.out.println("3. Celcius -> Kelvin");
        Scanner suhu = new Scanner (System.in);   
        System.out.print("Masukan pilihan : ");
        int pilihan = suhu.nextInt();
        
        if(pilihan == 1){
            System.out.print("Masukkan suhu (dalam Celcius) : ");
            int celcius = suhu.nextInt();
            int hasilreamur = (int) (celcius*0.8);
            System.out.println("Hasil suhu ini (dalam Reamur) : "+hasilreamur);
        }
        if(pilihan == 2){
            System.out.print("Masukkan suhu (dalam Celcius) : ");
            int celcius = suhu.nextInt();
            int hasilfahrenheit = (int) ((celcius*1.8)+32);
            System.out.println("Hasil suhu ini (dalam Fahrenheit) : "+hasilfahrenheit);
        }
        if(pilihan == 3){
            System.out.print("Masukkan suhu (dalam Celcius) : ");
            int celcius = suhu.nextInt();
            int hasilkelvin = (int) (celcius+273);
            System.out.println("Hasil suhu ini (dalam Kelvin) : "+hasilkelvin);
        }
}
}   