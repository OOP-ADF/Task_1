/*
 * Alfian Rahman Aziz
 * 1301150063
 * IF 39-07
 */
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author Alfian R7
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        scores();
    }

    public static void scores() {
        double UAS, UTS, QUIS,score;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Nilai UAS : ");
        UAS = scan.nextInt();
        System.out.println("Masukan Nilai UTS : ");
        UTS = scan.nextInt();
        System.out.println("Masukan Nilai QUIS : ");
        QUIS = scan.nextInt();
        score = (UAS * 0.35) + (UTS * 0.40) + (QUIS * 0.25);
        System.out.println("Nilai akhir  " + score);
        if ( 100>= score && score >= 85){
            System.out.println("Excenllent");
        }
        else if ( score >=75 && score <=84){
            System.out.println("Very Good");
        }
        else if ( score <= 74 && score >=65 ){
            System.out.println("Good");
        }
        else if ( 64 >=score && score >= 50 ){
            System.out.println("Accepted");
        }
        else if ( score <49 ){
            System.out.println("Failed");
        }

    }

}


