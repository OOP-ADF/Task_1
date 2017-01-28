/*
*PROGRAM INDEXPOINT
*
* write a java program that ask user 3 inputs of number that represent mid-term score (UTS), end-term score (UAS), and Quiz score
* calculate the final score of 35% mid-term score, 40% end-term score, and 25% Quiz score
* determine the grade of the score using these rules, and write the output grade
*
*Developed by Gabe Dimas Wicaksana (1301154245) - IF 3907 in Telkom University
*/

import java.util.Scanner;

class score {
    
    private double finalScore;
    public void grade(double uts, double uas, double quiz) {
        finalScore = (uts * 0.35) + (uas * 0.4) + (quiz * 0.25);
        
        if ( finalScore <= 100 && finalScore > 84) {
            System.out.println("Excellent!");
        }
        else if ( finalScore <= 84 && finalScore > 74) {
            System.out.println("Very Good!");
        }
        else if ( finalScore <= 74 && finalScore > 64) {
            System.out.println("Good!");
        }
        else if ( finalScore <= 64 && finalScore > 49) {
            System.out.println("Accepted!");
        }
        else if ( finalScore <= 49 && finalScore >= 0) {
            System.out.println("Failed!");
        }
    }
}

public class IndexPoint {

    public static void main(String[] args) {
        
        int uts, uas, quiz;
        Scanner input = new Scanner(System.in);
        score sc = new score();
        
        System.out.println("Masukkan nilai Mid-term(UTS) : ");
        uts = input.nextInt();
        
        System.out.println("Masukkan nilai End-term(UAS) : ");
        uas = input.nextInt();

        System.out.println("Masukkan nilai Quiz : ");
        quiz = input.nextInt();
        
        sc.grade(uts, uas, quiz);
    }
    
}
