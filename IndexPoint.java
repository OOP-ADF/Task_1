import java.util.Scanner;

/**
 *
 * @author Adli Rachman
 */
public class IndexPoint {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World");
        int uts,uas,quiz,NA;
        uts = 0; uas = 0; quiz = 0; NA = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai Quiz: ");
        quiz = in.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = in.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = in.nextInt();
        
        System.out.print("Grade: ");
        NA = (uts*35/100) + (uas*40/100) + (quiz*25/100);
        if (NA>=85){
            System.out.print("Excellent");
        }
        else if(NA>=75 && NA<=84){
            System.out.print("Very Good");
        }
        else if(NA>=65 && NA<=74){
            System.out.print("Good");
        }
        else if(NA<=64 && NA>=50){
            System.out.print("Accepted");
        }
        else if(NA<=49){
            System.out.print("Failed");
        }
