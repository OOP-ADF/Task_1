/*
* I Komang Hendra Wijaya Kusuma
* 1301144139
* IF-38-09
 */
package primenumber;
import java.util.Scanner;
/**
 *
 * @author I Komang Hendra Wijaya Kusuma
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int angka;
        int jumlah;
              
        System.out.println("Masukkan Angka : ");
        angka=scan.nextInt();
        
        jumlah=0;
        
        for (int i = 1; i <=angka; i++) {
             if(angka%i==0)
             {
                 jumlah++;
             }
        }
        
        if (jumlah == 2)
        {
            System.out.println(angka+" adalah bilangan prima"); 
        }
        
        else
        {
            System.out.println(angka+" adalah bukan bilangan prima");
        }
    }
}
