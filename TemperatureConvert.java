
package temperatureconvert;
import java.util.Scanner;
// @author Irfan Trianto/1301144111/IF-38-01
public class TemperatureConvert {

    public static void main(String[] args) {
       Scanner inputan = new Scanner(System.in);
       int Pilih=0;
       double celci,hitung;
       System.out.println("Pilihlah : ");
       System.out.println("1. Convert the temperature to Reamur ");
       System.out.println("2. Convert the temperature to Fahrenheit ");
       System.out.println("3. Convert the temperature to Kelvin ");
       System.out.print("Masukan pilihan 1-3 : "); Pilih = inputan.nextInt();
       if (Pilih == 1) {
                System.out.print("Masukan Celcius : "); celci = inputan.nextDouble();
                hitung = celci*4/5;
                System.out.println("Reamur : " + hitung);
                
       }else if (Pilih == 2){
                System.out.print("Masukan Celcius : "); celci = inputan.nextDouble();
                hitung = 9/5*celci+32;
                System.out.println("Fahrenheit : " + hitung);
                
       }else if (Pilih == 3){
                System.out.print("Masukan Celcius : ");celci = inputan.nextDouble();
                hitung = celci+273;
                System.out.println("Kelvin : " + hitung);
       }        
    }
    
}
