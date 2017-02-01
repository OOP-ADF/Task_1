/**
 * Nama: Herica Bunga Maharani
 * Nim: 1301154572
 * Kelas: IF-39-12
 */
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print ("Masukkan Bilangan: ");
        int a = cin.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            if (a%i==0)
                b++; 
            }
            if (b==2) {
                System.out.println ("Bilangan Prima");
            } else {
                System.out.println ("Bukan Prima");
            }
    }
  }

