/*
Name        : Adi Nugroho
Student ID  : 1301144271
Class       : IF-38-01
*/
package task_1.pkg1;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        boolean prime = true;
        
        for (int i=2; i < number;){
            if ((number % i)==0){
            prime = false;
            break;
        }
        i++;   
    }
    if (prime)
        System.out.println(number + " is a prime number");
    else
        System.out.println(number + " isn't a prime number");
    }
}

