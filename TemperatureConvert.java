/*
Nama : Deta Kurnia Soundra
NIM : 1301140109
Kelas : IF 38-09
 */
package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author soundra
 */
public class Konversisuhu {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       
        int celcius, pilih;
        double fahrent, kelvin, reamur;
        
        System.out.print("Masukkan suhu dalam celcius: ");
        Scanner input1 = new Scanner(System.in);
        celcius = input1.nextInt();
        
        do{
        System.out.println("Convert celcius ke: ");
        System.out.println("1. Fahrenheit ");
        System.out.println("2. Kelvin ");
        System.out.println("3. Reamur ");
        System.out.println("4. Exit ");
        
        System.out.print("Pilihan: ");
        Scanner input2 = new Scanner(System.in);
        pilih = input2.nextInt();
        
        switch(pilih){
            case 1:
            {
                fahrent = ((celcius*9/5)+32);
                System.out.println("Hasilnya: " +fahrent+ " Fahrenheit");
                System.out.println();
                break;
            }
            case 2:
            {
                kelvin=(celcius+273);
                System.out.println("Hasilnya:  " +kelvin+ " Kelvin");
                System.out.println();
                break;
            }
            case 3:
            {
                reamur=(celcius*4/5);
                System.out.println("Hasilnya: " +reamur+ " Reamur");
                System.out.println();
                break;
            } 
        }
    }
    while(pilih<4);
    }
}
