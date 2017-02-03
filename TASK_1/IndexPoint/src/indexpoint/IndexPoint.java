/* Nindia Cahyaning Putri
IF 39-07
1301154567 */
package indexpoint;
import java.util.Scanner;
public class IndexPoint {
    public static void main(String[] args) {
          String name;
          int score1, score2, score3;
          double midterm, endterm, quiz, finalscore;
          
          Scanner masukan = new Scanner(System.in);
          
          System.out.print("Input name = ");
          name = masukan.nextLine();
          
          System.out.print("Input Midterm Score = ");
          score1 = masukan.nextInt();
          
          System.out.print("Input Endterm Score = ");
          score2 = masukan.nextInt();
          
          System.out.print("Input Quiz Score = ");
          score3 = masukan.nextInt();
          
          midterm = 0.35 * score1;
          endterm = 0.4 * score2;
          quiz = 0.25 * score3;
          finalscore = midterm + endterm + quiz;
          System.out.println("Final Score = " +finalscore);
    
          if ((finalscore >= 85) && (finalscore <= 100)){
              System.out.println("Excellent");
          }
          else if ((finalscore >= 75) && (finalscore <= 84)) {
              System.out.println("Very Good");
          }
          else if ((finalscore >= 65) && (finalscore <= 74)) {
              System.out.println("Good");
          }
          else if ((finalscore >= 50) && (finalscore <= 64)) {
              System.out.println("Accepted");
          }   
          else if ((finalscore >=0) && (finalscore <= 49)) {
              System.out.println("Failed");
          }
          
    }
}

          
         
    
    
    

