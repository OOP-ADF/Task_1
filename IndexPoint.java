
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexpoint;

/**
 *
 * @author mahasiswabelajar7[1301144342]
 * Class : IF 38 02
 * Date : 1/16/2016
 */
import java.util.Scanner;
public class Indexpoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner uts = new Scanner (System.in);
        Scanner uas = new Scanner (System.in); 
        Scanner quiz = new Scanner (System.in); 
        System.out.println("Masukan nilai UTS:");  
        int buts = uts.nextInt();
        System.out.println("Masukan nilai UAS:");  
        int buas = uas.nextInt();
        System.out.println("Masukan nilai Quiz:");  
        int bquiz = quiz.nextInt();
        
        int score;
        score = (buts*35/100)+(buas*40/100)+(bquiz*25/100);
        
        if ((score<=100) && (score>85))  
            System.out.println("Excellent");  
        else if ((score<=84) && (score>75))  
            System.out.println("Very Good");  
        else if ((score<=74) && (score>65))  
            System.out.println("Good");  
        else if ((score<=64) && (score>50))  
            System.out.println("Accepted");  
        else if ((score<=49) && (score==0))  
            System.out.println("Failed");  
    }
    
}
