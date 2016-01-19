//Rona Uli Pardede (1301144051)
//IF 38-01

package temperatureconverter;

import java.util.Scanner;

/**
 *
 * @author Rona
 */
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        Scanner celcius=new Scanner(System.in);
        Scanner pilihan=new Scanner(System.in);
        System.out.print("Masukan Nilai Suhu (Celcius): ");
        int c=celcius.nextInt();
        
        do{
        System.out.println("Konversi Suhu Ke: ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");
        System.out.println("4. Keluar ");
        System.out.print("Menu Pilihan: ");
        pilih = pilihan.nextInt();
        switch(pilih) {
            case 1:
            {
                double f=((c*9/5)+32);
                System.out.println("Hasil Konversinya adalah " +f+ " Fahrenheit");
                System.out.println();
                break;
            }
            case 2:
            {
                double k=(c+273);
                System.out.println("Hasil Konversinya adalah " +k+ " Kelvin");
                System.out.println();
                break;
            }
            case 3:
            {
                double r=(c*4/5);
                System.out.println("Hasil Konversinya adalah " +r+ " Reamur");
                System.out.println();
                break;
            }
        }
    }
    while(pilih < 4);
}    
}
