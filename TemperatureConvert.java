/*
 * I Komang Hendra Wijaya Kusuma
 * 1301144139
 * IF-38-09
 */
package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author I Komang Hendra Wijaya Kusuma
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float C;
        int pilihan;
        double K;
        double R;
        double F;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Suhu (Celcius) : ");
        C=scan.nextFloat();
        
        System.out.println("Pilihan : ");
        System.out.println("1. Konversi ke Reamur");
        System.out.println("2. Konversi ke Fahrenheit");
        System.out.println("3. Konversi ke Kelvin");
        System.out.println("Masukan pilihan : ");
        pilihan=scan.nextInt();
        
        if (pilihan == 1)
        {
            R=C*0.8;
            System.out.println("Suhu dalam Reamur = "+R);
        }
        
        else if (pilihan == 2)
        {
            F=C*1.8+32;
            System.out.println("Suhu dalam Reamur = "+F);
        }
        
        else if (pilihan == 3)
        {
            K=C+273.15;
            System.out.println("Suhu dalam Reamur = "+K);
        }
        
        else
        {
            System.out.println("Pilihan Salah");
        }
            
    }
    
}
