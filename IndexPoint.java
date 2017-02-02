/*
Nama    : Muhammad Maulud Hidayatullah Rambe
NIM     : 1301154166
Kelas   : IF. 39-12
 */

import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args) {
        Scanner cinInt = new Scanner(System.in);
        Scanner cinDouble = new Scanner(System.in);
        double utsScore, uasScore, quizScore, finalScore;
        
        System.out.println("KALKULATOR NILAI");
        System.out.println("Batasan Nilai 0-100.");
        System.out.println("");
        System.out.print("Masukan Nilai QUIZ: ");
        quizScore = cinDouble.nextDouble();
        quizScore = quizScore*25/100;
        System.out.print("Masukan Nilai UTS : ");
        utsScore = cinDouble.nextDouble();
        utsScore = utsScore*35/100;
        System.out.print("Masukan Nilai UAS : ");
        uasScore = cinDouble.nextDouble();
        uasScore = uasScore*40/100;
        
        finalScore = quizScore + utsScore + uasScore;
        
        if(finalScore<=100 && finalScore>=85){
            System.out.println("Score: "+finalScore+" Grade: Excellent");
        }else if(finalScore<85 && finalScore>=75){
            System.out.println("Score: "+finalScore+" Grade: Very Good");
        }else if(finalScore<75 && finalScore>=65){
            System.out.println("Score: "+finalScore+" Grade: Good");
        }else if(finalScore<65 && finalScore>=50){
            System.out.println("Score: "+finalScore+" Grade: Accepted");
        }else if(finalScore<50 && finalScore>=0){
            System.out.println("Score: "+finalScore+" Grade: Failed");
        }   
    }
}
