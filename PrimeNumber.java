/*
 * Alfian Rahman Aziz
 * 1301150063
 * IF 39-07
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author Alfian R7
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for check:");
        //capture the input in an integer
        int m = scan.nextInt();
        for (int i = 2; i <= m / 2; i++) {
            n = m % i;
            if (n == 0) {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime) {
            System.out.println(m + " is Prime Number");
        } else {
            System.out.println(m + " is not Prime Number");
        }
    }
}
