import java.util.Scanner;

/**
 *
 * @author IFENDO MAZENDA PUTRA
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan asli : ");
        int bil= input.nextInt();
        if (bil == 0) {
            System.out.println(bil+" bukan merupakan bilangan asli");
        }
        else{
            int faktor = 0;
            System.out.print("faktor : ");
            for (int i = 1; i <= bil;i++) {
                if (bil % i == 0) {
                    faktor++;
                    System.out.print(i+" ");                    
                }
            }
            if (faktor == 2) {
                System.out.println("\n"+bil+" merupakan bilangan prima");
            }
            else{
                System.out.println("\n"+bil+" bukan merupakan bilangan prima");
            }
        }
    }
}

