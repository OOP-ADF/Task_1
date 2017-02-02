Daniel Tanta Christopher Sirait , 1301150054 , IF-39-12

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature, pilihan, reamur;
        
        System.out.println("Masukkan Pilihan anda :");
        System.out.println("1. Fahrenheit ke Reamur");
        System.out.println("2. Kelvin ke Reamur");
        pilihan = input.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Masukkan Temperature = ");
            temperature = input.nextInt();
            reamur = (4/9 * (temperature - 32));
            System.out.println("Reamur = "+reamur);
            } 
        else if (pilihan == 2){
            System.out.println("Masukkan Temperature = ");
            temperature = input.nextInt();
            reamur = (4/5 * (temperature - 273));
            System.out.println("Reamur = "+reamur);
        }
        }
}
