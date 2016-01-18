/* Ferdy Dian Anugrah 
   1301140035
   IF 38 05 */

import java.util.Scanner;

public class IndexPoint {

    public static void main(String[] args) {
       
	   Scanner nquis = new Scanner (System.in);
       Scanner nUAS = new Scanner (System.in);
       Scanner nUTS = new Scanner (System.in);
       System.out.println("Inputkan Nilai quis : ");
       int quis = quis.nextInt();
       System.out.println("Inputkan Nilai UTS : ");
       int uts = UTS.nextInt();
       System.out.println("Inputkan Nilai UAS : ");
       int uas = UAS.nextInt();
       
       int nilai;
       nilai = (quis*25/100)+(uts*35/100)+(uas*40/100);
       if ((nilai <= 100) && (nilai >=85))
           System.out.println("excellent");
       else if ((nilai <= 84) && (nilai >= 75))
           System.out.println("very good");
       else if ((nilai <= 74) && (nilai >= 65))
           System.out.println("good");
       else if ((nilai <= 64) && (nilai >= 50))
           System.out.println("accepted");
       else if ((nilai <= 49) && (nilai >= 0))
           System.out.println("failed");
       
       
    }
    
}
