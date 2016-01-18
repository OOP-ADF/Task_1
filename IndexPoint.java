/*
Biyan Ilham Akbar
1301144319
IF-38-09
*/
package indexpoint;
import java.util.Scanner;
/**
 *
 * @author Biyan Ilham Akbar
 */
public class IndexPoint {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float kuis;
        float uts;
        float uas;
        double tot;
        Scanner inp = new Scanner(System.in);
        System.out.println("***INDEX POINT***");
        System.out.println("Masukkan Nilai UTS  :");
        uts = inp.nextFloat();
        System.out.println("Masukkan Nilai UAS  : ");
        uas = inp.nextFloat();
        System.out.println("Masukkan Nilai Kuis :");
        kuis = inp.nextFloat();
        
        tot = (0.25*kuis + 0.35*uts + 0.4*uas);
        
        if (tot >= 85 && tot <= 100){
             System.out.println("Grade is Excellent");
        }
        else if (tot >= 75 && tot < 85){
             System.out.println("Grade is Very Good");
        }
        else if (tot >= 65 && tot < 75){
             System.out.println("Grade is Good");
        }
        else if (tot >= 50 && tot < 65){
             System.out.println("Grade is Accepted");
        }
        else if (tot >= 0 && tot < 50){
             System.out.println("Failed");
        }
        
        
    }
    
}
