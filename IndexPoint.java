/* Reynaldi Ananda Pane
   IF-38-09
   1301144099
*/
package indexpoint;
import java.util.Scanner;
/**
 *
 * @author Reynaldi Ananda Pane
 */
public class IndexPoint {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float uts;
        float uas;
        float quiz;
        double total;
        Scanner x = new Scanner(System.in);
        System.out.println("***INDEX POINT***");
        System.out.println("Masukkan nilai UTS  :");
        uts = x.nextFloat();
        System.out.println("Masukkan nilai UAS  : ");
        uas = x.nextFloat();
        System.out.println("Masukkan nilai Quiz :");
        quiz = x.nextFloat();
        
        total = (0.35*uts + 0.4*uas + 0.25*quiz);
        
        if (total >= 85 && total <= 100){
             System.out.println("Your Grade is Excellent");
        }
        else if (total >= 75 && total < 85){
             System.out.println("Your Grade is Very Good");
        }
        else if (total >= 65 && total < 75){
             System.out.println("Your Grade is Good");
        }
        else if (total >= 50 && total < 65){
             System.out.println("Your Grade is Accepted");
        }
        else if (total >= 0 && total < 50){
             System.out.println("You Are Failed");
        }
        
        
    }
    
}
