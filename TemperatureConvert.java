/*
Name        : Pima Hani Safitri
Student ID  : 1301140202
Class       : IF-38-02
 */
package task1.konverter.suhu;
import java.util.Scanner;
/**
 *
 * @author Pima Hani
 */
public class Task1KonverterSuhu {

    public static double celciusToReamur(float suhu) {
        double hasil;
        hasil=(4*suhu)/5;
        return hasil;
    }
    public static double celciusToFahrenheit(float suhu){
        double hasil;
        hasil=((9*suhu)/5)+32;
        return hasil;
    }
    public static double celciusToKelvin(float suhu){
       double hasil;
       hasil=(suhu+273);
       return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner pilihan = new Scanner(System.in);
        float suhu;
        int pil;
        double hasil;
        System.out.print(" Masukkan Suhu dalam Celcius : ");
        suhu=input.nextInt();
        System.out.println(" 1. Reamur ");
        System.out.println(" 2. Fahrenheit");
        System.out.println(" 3. Kelvin ");
        System.out.println(" 4. Exit ");
        System.out.print(" Masukkan pilihan : ");
        pil=pilihan.nextInt();
        if(pil==1){
            System.out.println(celciusToReamur(suhu));
        }
        else if(pil==2){
            System.out.println(celciusToFahrenheit(suhu));
        }
        else if(pil==3){
            System.out.println(celciusToKelvin(suhu));
        }    
}
