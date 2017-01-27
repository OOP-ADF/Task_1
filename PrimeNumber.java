/**
* PrimeNumber is a java program that ask user an input
* of integer and determine whether the number is prime or not
*
* @author  Afnizar Nur Ghifari (1301152427) - IF3907
* @version 1.0
* @since   27-01-2017
*/

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i, n;
    boolean isPrime = true;
    String result;

    System.out.println("Insert number you want to check : ");
    n = in.nextInt();

    for(i = 2; i < n; i++) {
      if(n % i == 0) {
        isPrime = false;
        break;
      }
    }

    result = ((isPrime == true) ? "Prime" : "Not Prime");
    System.out.println(result);
  }
}
