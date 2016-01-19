//Rona Uli Pardede (1301144051)
//IF 38-01

package primenumber;
import java.util.Scanner;
/**
 *
 * @author Rona
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Bilangan:   ");
        int x = input.nextInt();
        boolean prima = true;
        for (int i=2; i<x; i++){
            if ((x%i)==0){
                prima = false; break;
                
            }
        }
        if (prima==true)
            System.out.println(x+" merupakan bilangan prima.");
        else
            System.out.println(x+" bukan merupakan bilangan prima.");
    }
    
}

