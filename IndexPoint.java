
package indexpoint;
import java.util.Scanner;
// @author Irfan Trianto/1301144111/IF-38-01
public class IndexPoint {

    
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        double uts,uas,quiz,grade;
   
        System.out.print("Mid-term Score(UTS) : ");
        uts = inputan.nextInt();
        
        System.out.print("End-term Score(UAS) : ");
        uas = inputan.nextInt();
        
        System.out.print("Quiz Score          : ");
        quiz = inputan.nextInt();
        
        grade = uts/100*35 + uas/100*40 + quiz/100*25;
        
        if (grade >= 85)
            System.out.println("Score " + grade + " Grade : Excellent");
        else if ((grade >= 75) && (grade <= 84))
            System.out.println("Score " + grade + " Grade : Very Good");
        else if ((grade >= 65) && (grade <= 74))
            System.out.println("Score " + grade + " Grade : Good");        
        else if ((grade >= 50) && (grade <= 64))
            System.out.println("Score " + grade + " Grade : Accepted");
        else if ((grade >= 0) && (grade <= 49))
            System.out.println("Score " + grade + " Grade : Failed");
    }
    
}

