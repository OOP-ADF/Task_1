/*
*lailis sa'adah
*1301154502
*if39-12
 */
package pkg1301154502_lailissaadah_if3912_task1;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class IndexPoint {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("UTS : ");
        int UTS = input.nextInt();
         System.out.print("UAS : ");
        int UAS = input.nextInt();
         System.out.print("Quiz : ");
        int Quiz = input.nextInt();
        
        double total; 
        total = ( UTS*0.35)+(UAS*0.40)+(Quiz*0.25);
        System.out.println(" nilai total: "+total);
        if ((total<=100)&&(total>=85)){
            System.out.println("excellent");
        } 
        else if ((total<=84)&&(total>=75)){
            System.out.println("very good");           
        }
        else if ((total<=74)&&(total>=65)){
         System.out.println("good");
        }
        else if ((total<=64)&&(total>=50)){
         System.out.println("accepted");
        }
        else if ((total<=49)&&(total>=0)){
         System.out.println("failed");
        }

    }
            
    
}

