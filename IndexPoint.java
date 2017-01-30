/*
 * write a java program that ask user 3 inputs of number that represent mid-term score (UTS), end-term score (UAS), and Quiz score
 * calculate the final score of 35% mid-term score, 40% end-term score, and 25% Quiz score
 * determine the grade of the score using these rules, and write the output grade
 */

import java.util.Scanner;

/**
 *
 * @author Hendrik Christian Janifer Simanjuntak
 * 1301150021
 * Kelas39-07
 */
public class IndexPoint {

    private static int uts,uas,quiz;
    private static double na;
    static Scanner in = new Scanner(System.in);
    
    public void inputdata(){
        
        System.out.print(" Input Nilai UTS : ");
        uts = in.nextInt();
        System.out.print(" Input Nilai UAS : ");
        uas = in.nextInt();
        System.out.print(" Input Nilai Quiz: ");
        quiz = in.nextInt();
    }
    
    public void inputnilai(){
        na = (uts * 0.35) + (uas * 0.4) + (quiz * 0.25);
        System.out.print(" Nilai Akhir: ");
        System.out.println(na);
        
        if (na>=85 && na<=100)
        {
            System.out.println("Excellent");
        }

        else if (na>=75 && na<=84)
        {
            System.out.println("Very Good");
        }

        else if (na>=65 && na<=74)
        {
            System.out.println("Good");
        }

        else if (na>=50 && na<=64)
        {
            System.out.println("Accepted");
        }

        else if (na>=0 && na<=49)
        {
            System.out.println("Failed");
        }
    }
    
    public static void main(String[] args) {
       IndexPoint Q = new IndexPoint();
       Q.inputdata();
       Q.inputnilai();
    }   
}