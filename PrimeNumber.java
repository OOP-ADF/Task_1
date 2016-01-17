//Anggi Agustian - 1301144149
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int bilangan = input.nextInt();
        int b = 0;
        if (bilangan == 1) {
            System.out.print("Bilangan tersebut adalah Bilangan PRIMA ");
        } else {
            for (int i = 1; i <= bilangan; i++) {
                if (bilangan % i == 0) {
                    b = b + 1;
                }
            }
            if (b == 2) {
                System.out.print("Bilangan tersebut adalah Bilangan PRIMA ");
            } else {
                System.out.print("Bilangan tersebut bukanlah Bilangan PRIMA ");
            }
        }
    }
}

