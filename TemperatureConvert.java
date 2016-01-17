/*
Nama    : Zardarian Ahadika N.
NIM     : 1301140112
Kelas   : IF-38-02
 */
package task_1temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author Zardarian
 */
public class Task_1TemperatureConvert {
    
    public static void main(String[] args) {
        Scanner inputsuhu = new Scanner(System.in);
        Scanner inputtipe = new Scanner(System.in);
        double suhu;
        String tipe;
        System.out.println("Suhu dalam celcius : ");
        suhu = inputsuhu.nextInt();
        System.out.println("Diubah kedalam (Reamur/Fahrenheit/Kelvin)");
        tipe = inputtipe.nextLine();
        if (tipe.equals("reamur")){
            suhu = (suhu*0.8);
            System.out.println(suhu+" Reamur");
        }
        else if (tipe.equals("fahrenheit")){
            suhu = ((suhu*1.8)+32);
            System.out.println(suhu+" Fahrenheit");
        }
        else if (tipe.equals("kelvin")){
            suhu = (suhu+273.15);
            System.out.println(suhu+" Kelvin");
        }
        else{
            System.out.println("Tipe suhu salah");
        }
    }
    
}
