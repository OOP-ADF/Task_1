/**
 * NAMA : ANGKY FAJRIATI MS MUSA
 * KELAS : IF-38-01
 * NIM : 1301141221
 **/
package primenumber;

import java.util.Scanner;

/**
 *
 * @author AngkyMusa
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Mengecek Bilangan Prima");
        System.out.print("Masukkan Bilangan : ");
        int a = input.nextInt();
        boolean b = true;
        for (int c=2; c<a; c++) {
            if (a%c==0) {
                b=false;
            }
        }
        if(b) {
            System.out.println("Bilangan "+a+" adalah bilangan Prima");
        }
        else {
            System.out.println("Bilangan "+a+" bukan bilangan Prima");
        }
    }
    
}
