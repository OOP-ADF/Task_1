package primenumber;
import java.util.Scanner;

// @author Irfan Trianto/1301144111/IF-38-01
public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner inputan = new Scanner (System.in);
        int angka;
        int pr=0;
        System.out.print("Masukkan Angka : ");
        angka = inputan.nextInt();
        System.out.println();
        for (int i=2; i<angka; i++){
    
            if ((angka % i) == 0) {

            pr = 1; break;

                }
        }
       if (pr!=1)

            System.out.println(angka + " merupakan bilangan PRIMA ");

            else

            System.out.println(angka + " merupakan BUKAN bilangan PRIMA ");

    }
    
}

