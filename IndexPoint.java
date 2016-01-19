//Widya Wirachantika 1301144011

import java.util.Scanner;

public class IndexPoint {

    static void Index(double uts, double uas, double kuis) {
        double idx = 0.35 * uts + 0.4 * uas + 0.25 * kuis;
        System.out.println(idx);
        if (idx <= 100 && idx >= 85) {
            System.out.println("Excellent");
        } else if (idx <= 84 && idx >= 75) {
            System.out.println("Very Good");
        } else if (idx <= 74 && idx >= 65) {
            System.out.println("Good");
        } else if (idx <= 64 && idx >= 50) {
            System.out.println("Accepted");
        } else if (idx <= 49 && idx >= 0) {
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Index Point");
        System.out.println("Input Mid-Term Score: ");
        double midTerm = scan.nextInt();
        System.out.println("Input End-Term Score: ");
        double endTerm = scan.nextInt();
        System.out.println("Input Quiz Score: ");
        double quiz = scan.nextInt();
        Index(midTerm, endTerm, quiz);
    }
}

