Jeremiah Hasudungan IF 39-07 1301154287 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author Jeremi
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double s_mid,s_end,s_quiz,s_avg;
        System.out.println(" Mid Term Score : ");
        s_mid = scan.nextInt();
        System.out.println(" End Term Score : ");
        s_end = scan.nextInt();
        System.out.println(" Quiz Score     : ");
        s_quiz = scan.nextInt();
        s_avg = (s_mid*0.35 + s_end*0.4 + s_quiz*0.25);
        
        if(s_avg >=85 && s_avg <=100){
            System.out.println(" Grade :  Excellent");
        }
        else if(s_avg >= 75 && s_avg < 85){
            System.out.println(" Grade : Very Good ");
        }
        else if(s_avg >=65 && s_avg < 75){
            System.out.println(" Grade : Good ");
        }
        else if(s_avg >=50 && s_avg < 65){
            System.out.println(" Grade : Accepted ");
        }
        else if(s_avg >=0 && s_avg <50){
            System.out.println(" Grade : Failed ");
        }
    }
    
}


