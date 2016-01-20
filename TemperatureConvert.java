/**
 * NAMA : ANGKY FAJRIATI MS MUSA
 * KELAS : IF-38-01
 * NIM : 1301141221
 **/
package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author AngkyMusa
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program Konversi Suhu");
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        int mulai;
        do{
        System.out.print("Masukkan suhu (dalam satuan Celcius) : ");
        float a = input.nextFloat();
        System.out.println("Konvert Ke Satuan : 1. Reamur     2. Farenheit   3. Kelvin");
        System.out.print("Masukkan Pilihan : ");
        int pil = input.nextInt();
        switch (pil) {
            case 1 : {
            System.out.println(a + " celcius = " + (a*4/5) + " reamur");
            break;
        }
            case 2 : {
            System.out.println(a + " celcius = " + (a*9/5+32) + " farenheit");
            break;
        }
            case 3 : {
            System.out.println(a + " celcius = " + (a*+273.15) + " kelvin");
            break;
        }
            default : {
                System.out.print("Pilihan tidak ada");
        }
        }
        System.out.println();
        System.out.print("Mulai lagi? (1=Yes/2=No) : ");
        mulai= input.nextInt();
    }
    while(mulai==1);
    }
}
