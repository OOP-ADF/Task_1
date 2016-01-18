/*
Nama 	: Iqbal Pratomo Santoso
Kelas	: IF-38-02
NIM 	: 1301144042
 */
package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author iqbal
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float celcius;
        int pilih;
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan nilai celcius : ");
        celcius = baca.nextFloat();
        System.out.println("Pilih Menu :");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        pilih = baca.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Hasilnya adalah : "+(0.8)*celcius);
            break;
            case 2:
                System.out.println("Hasilnya adalah : "+(((1.8)*celcius)+32));
            break;
            case 3:
                System.out.println("Hasilnya adalah : "+(celcius+273));
            break;
        }
    }
    
}
