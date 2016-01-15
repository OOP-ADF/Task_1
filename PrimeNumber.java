// botak
import java.util.Scanner;

public class PrimeNumber {
    
    public static boolean isPrime(int num) {
        int to = (int) Math.sqrt(num) + 1;
        
        for (int i = 2; i <= to; i++) {
            if (num % i == 0) {
                return false;                
            }
        }
        return num > 1 && true;
    }
       
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       int num = sc.nextInt();
       
       if (isPrime(num)){
           System.out.println("this number is prime");
       } else {
           System.out.println("This number is not prime");
       }
 
    }
}