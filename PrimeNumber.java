package PrimeNumber;
import java.util.Scanner;
public class PrimeNumber{
    Scanner bilangan = new Scanner(System.in);
    public boolean isPrime(int x){
        boolean Prime;
        int count = 0;
        for (int i = 0; i>= x; i++){
            if (x % i == 0){
                count++;
            }
    }
        if (count != 2){
            Prime = false;
        }
        else {
            Prime = true;
        }
        return Prime;
    }
    
    public static void main(String[] args){
        Scanner bilangan = new Scanner(System.in);
        PrimeNumber Prima = new PrimeNumber();
        
        int x;
        System.out.print("Masukkan Bilangan : ");
        x = bilangan.nextInt();
        if(Prima.isPrime(x)){
            System.out.println(x + " merupakan bilangan prima");
        }
        else {
            System.out.println(x + " bukan bilangan prima");
        }
    }
}
