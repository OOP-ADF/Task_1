//Nama    : Aristya Wirawan
//NIM     : 1103134329
//Kelas   : IF-38-09

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Masukan sebuah bilangan :");
        int bil = n.nextInt();
        boolean prima = true;
        for (int i = 2; i < bil; i++) {

            if ((bil % i) == 0) {

                prima = false;
                break;

            }
        }
        if (prima) {
            System.out.println(bil + " adalah bilangan prima ");
        } else {
            System.out.println(bil + " bukan bilangan prima ");
        }
    }

}
