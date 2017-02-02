package PrimeNumber;
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        int count = 0;
        int bil;
        
        System.out.print("Masukkan bilangan : ");
        bil = bilangan.nextInt();
        for (int i = 2; i < bil ; i++){
            if ((bil % i) == 0){
                count++;
            }
        }
         if(count > 0 || bil < 2){
            System.out.println(bil+ " bukan bilangan prima");
        }
        else {
            System.out.println(bil + " merupakan bilangan prima");
        }
    }
}
