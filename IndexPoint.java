/**
* IndexPoint is a java program that ask user 3 inputs of number that
* represent mid-term score (UTS), end-term score (UAS), and Quiz score
* calculate the final score of 35% mid-term score, 40% end-term score, and 25% Quiz score
*
* @author  Afnizar Nur Ghifari (1301152427) - IF3907
* @version 1.0
* @since   27-01-2017
*/

import java.util.Scanner;

public class IndexPoint {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int uts, uas, quiz;
    float finalScore;

    System.out.println("Insert your UTS score");
    uts = in.nextInt();
    System.out.println("Insert your UAS score");
    uas = in.nextInt();
    System.out.println("Insert your QUIZ score");
    quiz = in.nextInt();

    finalScore = (float)((uts * 0.35) + (uas * 0.4) + (quiz * 0.25));

    if(finalScore <= 49) {
      System.out.println("Failed");
    } else if(finalScore <= 64) {
      System.out.println("Accepted");
    } else if(finalScore <= 74) {
      System.out.println("Good");
    } else if(finalScore <= 84) {
      System.out.println("Very Good");
    } else if(finalScore <= 100) {
      System.out.println("Excellent");
    }
  }
}
