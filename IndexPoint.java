/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexpoint;

/**
 *
 * @author Bayu Nugroho
 * Class : IF 38 09
 * Date : 17/01/2016
 */
import java.util.Scanner;
public class Indexpoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner UAS = new Scanner (System.in);
       Scanner quiz = new Scanner (System.in);
       Scanner UTS = new Scanner (System.in);
       System.out.println("Inputkan Nilai Quiz : ");
       int bquiz = quiz.nextInt();
       System.out.println("Inputkan Nilai UTS : ");
       int buts = UTS.nextInt();
       System.out.println("Inputkan Nilai UAS : ");
       int buas = UAS.nextInt();
       
       int nilai;
       nilai = (bquiz*25/100)+(buts*35/100)+(buas*40/100);
       if ((nilai <= 100) && (nilai >=85))
           System.out.println("EXCELLENT");
       else if ((nilai <= 84) && (nilai >= 75))
           System.out.println("VERY GOOD");
       else if ((nilai <= 74) && (nilai >= 65))
           System.out.println("GOOD");
       else if ((nilai <= 64) && (nilai >= 50))
           System.out.println("ACCEPTED");
       else if ((nilai <= 49) && (nilai >= 0))
           System.out.println("FAILED");
       
       
    }
    
}

