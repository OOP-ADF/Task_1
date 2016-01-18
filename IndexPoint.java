/* 
YAHYA ERMAYA
1301140199
IF-38-09
*/

import java.util.Scanner;

public class IndexPoint {
 	public static void main(String[] args) {
        float uts;
        float uas;
        float quis;
        double total;
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai UTS : ");
        uts=scan.nextFloat();
        
        System.out.println("Masukkan Nilai UAS : ");
        uas=scan.nextFloat();
        
        System.out.println("Masukkan Nilai quis : ");
        quis=scan.nextFloat();
        
        total = (0.35*uts + 0.4*uas + 0.25*quis);
        
        if (total>=85 && total<=100)
        {
             System.out.println("Grades : Excellent");
        }
        else if(total>=75 && total<85)
        {
            System.out.println("Grades : Very Good");
        }
        else if(total>=65 && total<75)
        {
            System.out.println("Grades : Good");
        }
        else if(total>=50 && total<65)
        {
            System.out.println("Grades : Accepted");
        }
        else
        {
            System.out.println("Your're Failed");
        }
    }   
}