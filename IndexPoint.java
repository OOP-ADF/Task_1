//Firda Aminy Ma'ruf 1301144311 IF3801
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author Iwan Ma'ruf
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mid=new Scanner(System.in);
        Scanner end=new Scanner(System.in);
        Scanner quiz=new Scanner(System.in);
        System.out.print("Please enter your mid-term score: ");
        int x=mid.nextInt();
        System.out.println();
        System.out.print("Please enter your final-term score: ");
        int y=end.nextInt();
        System.out.println();
        System.out.print("Please enter your quiz score: ");
        int z=quiz.nextInt();
        System.out.println();
        double total=((0.35*x)+(0.4*y)+(0.25*z));
        if ((total>=85) && (total<=100)) {
            System.out.println("You have an EXCELLENT grade");
        }
        else if ((total>=75) && (total<=84)) {
            System.out.println("You have a VERY GOOD grade");
        }
        else if ((total>=65) && (total<=74)) {
            System.out.println("You have a GOOD grade");
        }
        else if ((total>=50) && (total<=64)) {
            System.out.println("Your grade is still ACCEPTABLE");
        }
        else if (total<=49) {
            System.out.println("YOU FAILED");
        }
    }
}

