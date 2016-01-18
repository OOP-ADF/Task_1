/*
Biyan Ilham Akbar
1301144319
IF-38-09
 */
package primenumber;
import java.util.Scanner;
/**
 *
 * @author Biyan Ilham Akbar
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Masukkan sebuah angka : ");
        Scanner inp=new Scanner(System.in);
        a=inp.nextInt();
        c=0;
        for(b=1;b<=a;b++){
            if (a%b==0){
                c++;
            }
        }
        if (c==2){
            System.out.println("Angka Prima");
        }
        else {
            System.out.println("Bukan angka prima");
        }
    }
    
}

