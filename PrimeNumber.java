// SELVI WIDYAPRADITIA PANGESTI, 1301144041, IF-38-01

import java.util.Scanner;

public class PrimeNumber {
 public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int x=in.nextInt();
        int y=0;
        for (int i = 1; i < x; i++) {
            if(x%i==0)
                y=y+1;
        }
        if(y==1)
            System.out.println("Prima");
        else  
            System.out.println("Bukan Prima");
    }
}
