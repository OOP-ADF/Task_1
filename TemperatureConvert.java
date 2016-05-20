// nama : adrian g nurcahyo
// kelas : if-38-02
// nim : 1301140092
import java.util.Scanner;
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1. Celcius ke Kelvin");
        System.out.println("2. Celcius ke Fahrenheit");
        System.out.println("3. Celcius ke Reamur");
        Scanner pil = new Scanner (System.in);
        System.out.print("Pilihan : ");
        int pilihan = pil.nextInt();
        
        if (pilihan == 1)
        {
            Scanner celcius = new Scanner (System.in);
            System.out.print("Masukan Angka dalam celcius : ");
            int cel = celcius.nextInt();
            double hasil1 = (cel+273);
            System.out.println("Hasil : "+hasil1);  
        }
        if (pilihan == 2)
        {
            Scanner celcius = new Scanner (System.in);
            System.out.print("Masukan Angka dalam celcius : ");
            float cel = celcius.nextFloat();
            float hasil2 = (float) ((1.8*cel)+32);
            System.out.println("Hasil : "+hasil2);
        }
        if (pilihan == 3)
        {
            Scanner celcius = new Scanner (System.in);
            System.out.print("Masukan Angka dalam celcius : ");
            float cel = celcius.nextFloat();
            float hasil3 = (float) ((0.8)*cel);
            System.out.println("Hasil : "+hasil3);
        }
    }
}