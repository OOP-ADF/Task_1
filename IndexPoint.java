/*
 Damar Radistya
 1103120164
 IF-38-09
 */

import java.util.Scanner;

public class IndexPoint {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String check = "y";
        
        System.out.println("\nINDEX POINT CALC");

        while ("y".equals(check)) {
            System.out.print("\n\ninput Quiz score      : ");
            double quiz = scn.nextDouble();
            System.out.print("input mid-term score  : ");
            double mid = scn.nextDouble();
            System.out.print("input end-term score  : ");
            double end = scn.nextDouble();

            double fnl = ((0.25 * quiz) + (0.35 * mid) + (0.4 * end));
            String fnlGrade = getGrade(fnl);
            System.out.println(fnlGrade);

            System.out.print("\nInput another Score? (y/n) : ");
            check = scn.next();
        }
    }

    public static String getGrade(double fnl) {
        String fnlGrade = "";

        if (fnl >= 85 && fnl <= 100) {
            fnlGrade = "excellent";
        } else if (fnl >= 75 && fnl <= 84) {
            fnlGrade = "very good";
        } else if (fnl >= 65 && fnl <= 74) {
            fnlGrade = "good";
        } else if (fnl >= 50 && fnl <= 64) {
            fnlGrade = "accepted";
        } else if (fnl <= 49) {
            fnlGrade = "failed";
        }
        return "Final Grade is : " + fnlGrade;
    }
}
