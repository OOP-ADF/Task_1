
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        
        double mscore, escore, qscore, fscore;
        
        Scanner score = new Scanner (System.in);
        System.out.print("Input Mid-term Score : ");
        mscore = score.nextFloat();
        System.out.print("Input End-term Score : ");
        escore = score.nextFloat ();
        System.out.print("Input Quiz Score : ");
        qscore = score.nextFloat ();
        
        fscore = (0.35 * mscore + 0.40 * escore + 0.25 * qscore);
       
        System.out.print("Your Final Score : "+ fscore);
        
        if (fscore>=85 && fscore<=100){
            System.out.println("Excellent");
        }
        else if(fscore>=75 && fscore<=84){
           System.out.println("Very Good");
        }
        else if(fscore>=65 && fscore<=74){
            System.out.println("Good");
        }
        else if (fscore>=50 && fscore<=64){
            System.out.println("Accepted");
        }
        else{
            System.out.println("Failed");    
            
        }
    }
}

