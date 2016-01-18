// Muhammad Andika SM
// 1301140145
// IF 38-09

import java.util.Scanner;

    public class IndexPoint {

        public static void main(String[] args) {
       
        Scanner quiz = new Scanner (System.in);
        
        System.out.println("Your Quiz : ");
        int nquiz = quiz.nextInt();
        
        Scanner uas = new Scanner (System.in);
        
        System.out.println("Your UAS : ");
        int nuas = uas.nextInt();
        
        Scanner uts = new Scanner (System.in);
        
        System.out.println("Your UTS : ");
        int nuts = uts.nextInt();
                            
        int index;
        index = (nquiz*25/100)+(nuts*35/100)+(nuas*40/100);
        if ((index <= 100) && (index >=85))
           System.out.println("Excellent");
        else if ((index <= 84) && (index >= 75))
           System.out.println("Very Good");
        else if ((index <= 74) && (index >= 65))
           System.out.println("Good");
        else if ((index <= 64) && (index >= 50))
           System.out.println("Accepted");
        else if ((index <= 49) && (index >= 0))
           System.out.println("Failed");
       
       
    }
    
}