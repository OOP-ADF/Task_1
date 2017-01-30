import java.util.Scanner;
/**
 * Hardiyan Ichsan Gunawan
 * 1301154138
 * IF 39 12
 * @author Harude
 */
public class IndexPoint {
    public static void main(String[] args) {
        int n1,n2,n3;
        double na;
        
        System.out.print("Input UTS: ");
        Scanner cin = new Scanner(System.in);
        n1 = cin.nextInt();
        System.out.print("Input UAS: ");
        n2 = cin.nextInt();
        System.out.print("Input Quiz: ");
        n3 = cin.nextInt();
        na = 0;
        na = (0.35 * n1) + (0.4 * n2) + (0.25 * n3);
        System.out.println("Score: "+na);
        
        if (na >= 85 && na <=100){
            System.out.println("Grade: A (Excellent)");
        } else if (na >= 75){
            System.out.println("Grade: B (Very Good)");
        } else if (na >= 65){
            System.out.println("Grade: C (Good)");
        } else if (na >= 50){
            System.out.println("Grade: D (Accepted)");
        } else {
            System.out.println("Grade: E (Failed)");
        }
    }
}
