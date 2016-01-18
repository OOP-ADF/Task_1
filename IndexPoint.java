/**
 *
 * @author Fitrah Bima Nusantara
 * Class : IF 38 09
 * Student ID : 1301140295
 */
package indexpoint;
import java.util.Scanner;
public class IndexPoint {
    public static void main(String[] args) {
       
       Scanner uas = new Scanner (System.in);
       Scanner quiz = new Scanner (System.in);
       Scanner uts = new Scanner (System.in);
         System.out.println("Nilai Quiz : ");
            int xquiz = quiz.nextInt();
         System.out.println("Nilai UTS : ");
            int xuts = uts.nextInt();
         System.out.println("Nilai UAS : ");
            int xuas = uas.nextInt();
       
       int total;
       total = (xquiz*25/100)+(xuts*35/100)+(xuas*40/100);
       if ((total <= 100) && (total >=85))
           System.out.println("Excellent");
       else if ((total <= 84) && (total >= 75))
           System.out.println("Very Good");
       else if ((total <= 74) && (total >= 65))
           System.out.println("Good");
       else if ((total <= 64) && (total >= 50))
           System.out.println("Accepted");
       else if ((total <= 49) && (total >= 0))
           System.out.println("Failed");
    }
}