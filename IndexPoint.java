/*
Nama : Fatima Nurshafarani
NIM	 : 1301144245
Kelas : IF-38-01
*/
import java.util.Scanner;

public class IndexPoint {

    static void hitIndex(int uts, int uas, int quiz) {
        int score = (int) (0.35 * uts + 0.4 * uas + 0.25 * quiz);
        System.out.println("Score :  " + score);
        if (score >= 85 && score <= 100) {
            System.out.println("Grade : Excellent ");
        } else if (score >= 75 && score <= 84) {
            System.out.println("Grade : Very Good ");
        } else if (score >= 65 && score <= 74) {
            System.out.println("Grade : Good ");
        } else if (score >= 50 && score <= 64) {
            System.out.println("Grade : Accepted ");
        } else {
            System.out.println("Grade : Failed ");
        }
    }

    public static void main(String[] args) {
        int uts,uas,quiz;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Nilai UTS : ");
        uts = input.nextInt();
        System.out.println("Input Nilai UAS : ");
        uas = input.nextInt();
        System.out.println("Input Nilai Quiz : ");
        quiz = input.nextInt();
        hitIndex(uts,uas,quiz);
    }

}
