//Nindia Cahyaning Putri
//IF39-07
//1301154567

package primenumber;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan sebuah bilangan : ");
        int bil = input.nextInt ();
        boolean prima = true;
        for (int i=2 ; i<bil ; i++) {
            if ((bil % i) == 0) {
                prima = false;   
            }  
        }
        if (prima)
            System.out.print(bil+ " bilangan prima ");
        else
            System.out.print(bil+ " bukan bilangan prima ");
        
            }
        }
