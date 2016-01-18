import java.util.Scanner;

/**
 * Eka Putri
 * 1301144312
 * IF 38 02
 */


public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner masukkan = new Scanner(System.in);
		
		System.out.println("Masukkan Angka : ");
                int bil = masukkan.nextInt();
                boolean prima = true;
        
               for (int i=2; i<bil; i++)
               {
                     if ((bil % i) == 0) {
                        prima = false;
                        break;
                     }
               }
               if (prima)
                    System.out.println(bil + " adalah bilangan prima ");
               else
                    System.out.println(bil + " adalah bukan bilangan prima ");
    }
}
