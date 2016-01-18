/*
 Damar Radistya
 1103120164
 IF-38-09
 */


import java.util.Scanner;

public class PrimeNumber {

    public static boolean Prime(int num) {
        for (int i = 2; i <= num/2; i ++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int num;
        String check = "y";
        Scanner s = new Scanner(System.in);

        System.out.println("Prime Number Checker");

        while ("y".equals(check)) {

            System.out.print("\nInput number : ");

            num = s.nextInt();

            if (Prime(num)) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
            System.out.print("\nCheck Again? (y/n) :");
            check = s.next();
        }
    }
}