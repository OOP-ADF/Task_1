package indexpoint;
import java.util.Scanner;
/**
 *
 * @author Andi Akhmad Fauzi
 */
/* Andi Akhmad Fauzi IF-38-09 1301144009 */
public class IndexPoint {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float mid;
        float fin;
        float quiz;
        double tot;
        Scanner x = new Scanner(System.in); // Scanner Float
        System.out.println("=== INDEX POINT CALCULATOR ===");
        System.out.print("Input Mid-Term (UTS) Score  : "); mid = x.nextFloat();
        System.out.print("Input Final test (UAS) Score  : "); fin = x.nextFloat();
        System.out.print("Input Quiz Score : "); quiz = x.nextFloat();
        
        tot = ((0.35*mid) + (0.4*fin) + (0.25*quiz));
        System.out.println("Your total Score is: " + tot);
        if (tot >= 85 && tot <= 100)
             System.out.println("Your Grade is Excellent");
        else if (tot >= 75 && tot < 85)
             System.out.println("Your Grade is Very Good");
        else if (tot >= 65 && tot < 75)
             System.out.println("Your Grade is Good");
        else if (tot >= 50 && tot < 65)
             System.out.println("Your Grade is Accepted");
        else if (tot >= 0 && tot < 50)
             System.out.println("You Are Failed");     
    }
    
}
