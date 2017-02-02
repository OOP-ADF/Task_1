/*
 * Lailis Sa'adah
 *1301154502
 *If39-12
 */
package pkg1301154502_lailissaadah_if3912_task1;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class PrimeNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" masukkan bilangan : ");
        int bilangan = input.nextInt();
        
        boolean prima = true;
        for (int i=2; i<bilangan; i++){
            if ((bilangan % i) == 0){
                prima = false; break;
                
            }
        }
        if (prima)
            System.out.println(bilangan + " adalah bilangan Prima ");
        else 
            System.out.println(bilangan + " adalah bukan bilangan prima ");
       
        
    }
}

