/**
 * NAMA : ANGKY FAJRIATI MS MUSA
 * KELAS : IF-38-01
 * NIM : 1301141221
 **/
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author AngkyMusa
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nilai UTS : ");
        int nuts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int nuas = input.nextInt();
        System.out.print("Masukkan Nilai Quiz : ");
        int nq = input.nextInt();
        System.out.println();
        double na = (0.35*nuts + 0.4*nuas + 0.25*nq );
        System.out.print("Your Grade is ");
        if (na>=85 && na<=100) {
            System.out.println("Excelent");
        }
        else if (na>=75 && na<85) {
            System.out.println("Very Good");
        }
        else if (na>=65 && na<75) {
            System.out.println("Good");
        }
        else if (na>=50 && na<65) {
            System.out.println("Accepted");
        }
        else if (na>=0 && na<55) {
            System.out.println("Failed");
        }
    }
    
}
