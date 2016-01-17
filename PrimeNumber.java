
/*
 * I Made Riartha Prawira
 * 1301140069
 * IF-38-09
 */
package primenumber;
import java.util.Scanner;

/**
 *
 * @author Riartha
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float number;
        
        Scanner prima = new Scanner(System.in);
        
        System.out.println("Masukkan angka : ");
        number=prima.nextFloat();
        
        if(number%2==0 || number%3==0 || number%4==0 || number%5==0 || number%6==0 || number%7==0 || number%8==0 || number%9==0){
            System.out.println("Angka "+number+"bukan merupakan angka prima");
        }
        else if(number%number==0 && number%1==0 && number%2==1 && number%3==1 && number%4==1 && number%5==1 && number%6==1 && number%7==1 && number%8==1 && number%9==1){
            System.out.println("Angka "+number+"merupakan angka prima");
        }
    }
    
}
