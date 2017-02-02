
import java.util.Scanner;
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int uts,uas,kuis;
        double scr;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nilai: ");
        uts = scan.nextInt();
        uas = scan.nextInt();
        kuis = scan.nextInt();
        
        scr = (uts*0.35) + (uas*0.4) + (kuis*0.25);
        
        if(scr<=100 && scr>84){
            System.out.println("Excellent");
        }
        else if(scr<=84 && scr>74){
            System.out.println("Very Good");
        }
        else if(scr<=74 && scr>64){
            System.out.println("Good");
        }
        else if (scr<=64 && scr>49){
            System.out.println("Accepted");
        }
        else {
            System.out.println("Failed");
        }
    }
    
}