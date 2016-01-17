/*
 * I Komang Hendra Wijaya Kusuma
 * 1301144139
 * IF-38-09
 */
package indexpoint;
import java.util.Scanner;

/**
 *
 * @author I Komang Hendra Wijaya Kusuma
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float uts;
        float uas;
        float quiz;
        double hasil;
        
        Scanner scanInt = new Scanner(System.in);
        
        System.out.println("Nilai UTS : ");
        uts=scanInt.nextFloat();
        System.out.println("Nilai UAS : ");
        uas=scanInt.nextFloat();
        System.out.println("Nilai QUIZ : ");
        quiz=scanInt.nextFloat();
        
        hasil=0.35*uts+0.4*uas+0.25*quiz;
        System.out.println("Nilai total anda adalah : "+hasil );
        
        if(hasil>=85 && hasil<=100){
            System.out.println("Grade : Excellent");
        } 
        else if(hasil>=75 && hasil<85){
            System.out.println("Grade : Very Good");
        }
        else if(hasil>=65 && hasil<75){
            System.out.println("Grade : Good");
        }
        else if(hasil>=50 && hasil<65){
            System.out.println("Grade : Accepted");
        }
        else if(hasil<50){
            System.out.println("Grade : Failed");
        }
               
        
    }
    
}

