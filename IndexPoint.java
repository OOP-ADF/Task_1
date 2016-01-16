/*
 Adzan Nugraha
 1301140249
 IF-38-09
 */
package indexpoint;
import java.util.Scanner;
/**
 *
 * @author Adzan Nugraha
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
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai UTS : ");
        uts=scan.nextFloat();
        
        System.out.println("Masukkan Nilai UAS : ");
        uas=scan.nextFloat();
        
        System.out.println("Masukkan Nilai QUIZ : ");
        quiz=scan.nextFloat();
        
        total = (0.35*uts + 0.4*uas + 0.25*quiz);
        
        if (total>84 && total<=100)
        {
             System.out.println("Your Score is Excellent");
        }
        else if(total>74 && total<=84)
        {
            System.out.println("Your Score is Very Good");
        }
        else if(total>64 && total<=74)
        {
            System.out.println("Your Score is Good");
        }
        else if(total>49 && total<=64)
        {
            System.out.println("Your Score is Accepted");
        }
        else
        {
            System.out.println("Your're Failed");
        }
    }
    
}

