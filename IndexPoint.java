package indexpoint;

import java.util.Scanner;

/**
 *
 * @author yuslanabubakar
 */
public class IndexPoint {
    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Program Index Score");
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai UTS : ");
        int uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int uas = input.nextInt();
        System.out.print("Masukkan Nilai Quiz : ");
        int quiz = input.nextInt();
        
        System.out.println();
        
        double total = (0.35*uts + 0.4*uas + 0.25*quiz);
        
        if (total >= 85 && total <= 100){
            System.out.println("Your Grade is Excellent");
        }
        else if (total >= 75 && total < 85){
            System.out.println("Your Grade is Very Good");
        }
        else if (total >= 65 && total < 75){
            System.out.println("Your Grade is Good");
        }
        else if (total >= 50 && total < 65){
            System.out.println("Your Grade is Accepted");
        }
        else if (total >= 0 && total < 50){
            System.out.println("You Are Failed");
        }
    }
    
}
