/*
Nama : Vicha Octavia Tama
Nim  : 1301144209
Kelas: IF 38-09
 */
package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author Vicha Octavia Tama
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float reamur;
        double kelvin;
        float fahrenheit;
        float celcius;
        int pil;
        Scanner input= new Scanner(System.in);
        
        System.out.println("==Temperature Convert==");
        System.out.println("Masukkan suhu celcius : ");
        celcius=input.nextFloat();
        System.out.println("=PILIHAN=");
        System.out.println("1. Convert suhu ke Reamur");
        System.out.println("2. Convert suhu ke Kelvin");
        System.out.println("3. Convert suhu ke Fahrenheit");
        System.out.println("Masukkan pilihan : ");
        pil=input.nextInt();
        
        if(pil==1)
        {
            reamur=(celcius*4/5);
            System.out.println(celcius+" Celcius = "+reamur+" Reamur");
        }
        else if(pil==2)
        {
            kelvin=(celcius*273.15);
            System.out.println(celcius+" Celcius = "+kelvin+ " Kelvin");
        }
        else if(pil==3)
        {
            fahrenheit=(celcius*9/5+32);
            System.out.println(celcius+" Celcius = " +fahrenheit+" Fahrenheit");
        }
        else
        {
            System.out.println("Pilihan salah");
        }
    }
    
}
