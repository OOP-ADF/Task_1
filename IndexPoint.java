//Dhiva Azhara 1301144101 IF3801
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author dhivazhr
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double uts, uas, quiz, nilai;
        String grade;
        
        System.out.print("Nilai UTS: ");
        Scanner input1 = new Scanner(System.in);
        uts = input1.nextDouble();
        
        System.out.print("Nilai UAS: ");
        Scanner input2 = new Scanner(System.in);
        uas = input2.nextDouble();
        
        System.out.print("Nilai Quiz: ");
        Scanner input3 = new Scanner(System.in);
        quiz = input3.nextDouble();
        
        nilai = ((0.3*uts)+(0.4*uas)+(0.25*quiz));
        if (nilai>=85 && nilai<=100){
            grade = "Excelent";
        } else if (nilai>=75 && nilai<=84){
            grade = "Very Good";
        } else if (nilai>=65 && nilai<=74){
            grade = "Good";
        } else if (nilai>=50 && nilai<=64){
            grade = "Accepted";
        } else{
            grade = "Failed";
        }
       
        System.out.print("Grade: " +grade);
        System.out.println();
    }
    
}
