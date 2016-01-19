import java.util.Scanner;

public class IndexPoint{
    /*
    * Created by 
    * Name       : Dede Kiswanto
    * Student ID : 1301140171
    * Class      : IF-38-01
    */
    
    // Class Variable / Values
    int uts, uas, quiz; // for constuctor variable
    double finalScore;
    String grade;
    
    // Constructor for Index Class
    public IndexPoint(int uts, int uas, int quiz){
        this.uts = uts;
        this.uas = uas;
        this.quiz = quiz;
    }
    
    // Method for Calculate final score
    public void setFinalScore(){
        finalScore = 0.35 * uts + 0.4 * uas + 0.25 * quiz;
    }
    
    // Method for set index grade
    public void setIndex(){
        if(finalScore >= 85){
            grade = "Excellent";
        } else if (finalScore >= 75){
            grade = "Very Good";
        } else if (finalScore >= 65){
            grade = "Good";
        } else if (finalScore >= 50){
            grade = "Accepted";
        } else {
            grade = "Failed";
        }
    }
    
    public static void main(String[] args){
        //Create Scanner for prompt input varible
        Scanner scanInt = new Scanner(System.in); 
        int uts, uas, quiz;
        
        System.out.println("Index Point Exercise ");
        
        // Input User 
        System.out.print("Input UTS Score : ");
        uts = scanInt.nextInt();
        
        System.out.print("Input UAS Score : ");
        uas = scanInt.nextInt();
        
        System.out.print("Input Quiz Score : ");
        quiz = scanInt.nextInt();
        
        // Create object myIndex from IndexPoint Class
        IndexPoint myIndex = new IndexPoint(uts,uas,quiz);
        
        // Calling method SetFinalScore & SetIndex from object myIndex
        myIndex.setFinalScore();
        myIndex.setIndex();
        
        // Output the Grade & Final Score
        System.out.println("Final Socre : " + myIndex.finalScore);
        System.out.println("Grade : " + myIndex.grade);
    } 
}