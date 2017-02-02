package task1;

import java.util.Scanner;


public class TemperatureConvert {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double celc, hasil;
        int pilihan;
        
        System.out.print("Masukkan suhu (dalam celcius) : ");
        celc = inp.nextDouble();
        
        //-------------------------------------------------//
        
        Scanner inpString = new Scanner(System.in);
        
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Pilih konversi : ");
        
        pilihan = inpString.nextInt();
        
        //-------------------------------------------------//
        
        if (pilihan == 1){
            hasil = 0.8*celc;
            System.out.println("Hasil :: " + hasil);
        }
        else if (pilihan == 2){
            hasil = (1.8*celc) + 32;
            System.out.println("Hasil :: " + hasil);
        }
        else if (pilihan == 3){
            hasil = celc + 273;
            System.out.println("Hasil :: " + hasil);
        }
        else{
            System.out.println("Input salah!");
    }
        
  }
    
}
