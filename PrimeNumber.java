/*
 Adzan Nugraha
 1301140249
 IF-38-09
 */
package primenumber;
import java.util.Scanner;
/**
 *
 * @author Adzan Nugraha
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        int z;
        Scanner scan = new Scanner(System.in);
        
        z = 0;
        System.out.println("Masukkan Bilangan : ");
        x = scan.nextInt();
        
        for (y=1;y<=x;y++)
        {
            if (x%y == 0)
            {
                z++;
            }
        }
        
        if (z == 2)
        {
            System.out.println("Bilangan Yang Anda Masukkan Prima");
        }
        else
        {
            System.out.println("Bilangan Yang Anda Masukkan Bukan Prima");
        }
    } 
}

