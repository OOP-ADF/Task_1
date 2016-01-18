/*
Andi Masruril Haq
1301140399
IF 38-09
*/

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args){
        int pil;
        double c,f,r,k;
        Scanner inputan = new Scanner (System.in);
        System.out.print("Masukkan Nilai Suhu(Celcius) : ");
        c = inputan.nextDouble();
        System.out.println(" ");
        do {            
            System.out.println("Konversi ke ");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Reamur");
            System.out.println("3. Kelvin");
            System.out.println("4. Exit");
            System.out.println("pilihan : ");
            pil = inputan.nextInt();
            switch (pil){
                case 1:
                    f=(c*1.8)+32;
                    System.out.println("Hasilnya Adalah : "+f);
                    System.out.println(" ");
                    break;
                case 2:
                    r=c*0.8;
                    System.out.println("Hasilnya Adalah : "+r);
                    System.out.println(" ");
                    break;
                case 3:
                    k=c+273.15;
                    System.out.println("Hasilnya Adalah : "+k);
                    System.out.println(" ");
                    break;     
        }
       } while (pil<4);
    }
}
