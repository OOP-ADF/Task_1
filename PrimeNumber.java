package primenumber;
import java.util.Scanner;
/**
 *
 * @author Reynaldi Ananda Pane
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i; int bil; int j;
		j=0;
		System.out.println("***PROGRAM PRIME NUMBER***");
		Scanner x = new Scanner(System.in);
		System.out.println("Masukkan sebuah bilangan : ");
		bil = x.nextInt();
		
		for (i=1; i <= bil; i++) {
			if (bil % i==0) {
				j++;
			}
		}
		
		if (j==2) {
			System.out.println("Bilangan yang anda masukkan adalah bilangan prima");
		}
		
		else {
			System.out.println("Bilangan yang anda masukkan bukan bilangan prima");
		}
    }
    
}
