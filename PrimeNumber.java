/*
Nama    : Arindra Rizky R
NIM     : 1103134466
Kelas   : IF-38-09
*/
package primenumber;

/**
 *
 * @author Admin
 */

import java.util.Scanner;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        int bil = n.nextInt();
        boolean prima = true;
        for (int i = 2; i < bil; i++) {
            if ((bil % i) == 0) {
                prima = false;
                break;
            }
        }
        if (prima) {
            System.out.println(bil + " bilangan prima ");
        } else {
            System.out.println(bil + " bukan bilangan prima ");
        }
    }
    
}
