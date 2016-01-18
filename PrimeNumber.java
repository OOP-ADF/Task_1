/*
Nama : Fatima Nurshafarani
NIM	 : 1301144245
Kelas : IF-38-01
*/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = scan.nextInt();
        boolean prime = true;
        for (int i = 2; i < input; i++){
            if (input % i == 0){
                prime = false;
            }
        }
        if (prime == false){
            System.out.println(input + " is not prime");
        }
        else if (prime == true){
            System.out.println(input + " is prime");
        }
    }
}