/* 
Kevin Prakarsa B R (1301144169)
IF-38-09
*/
import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args){
		int uts, uas, kuis
        double akhir;
        Scanner inputan = new Scanner (System.in);
        System.out.print("Nilai UTS\t : ");
        uts = inputan.nextInt();
        System.out.print("Nilai UAS\t : ");
        uas = inputan.nextInt();
        System.out.print("Nilai Quiz\t : ");
        kuis = inputan.nextInt();
		
		system.out.println("")
        akhir = ((0.35 * uts) + (0.40 * uas) + (0.25 * kuis));
        System.out.println("Nilai Akhir\t : "+akhir);
		system.out.println("")
		
        if (total >= 85){
            System.out.println("excellent");
        }
        else if (total >=75 ){
            System.out.println("very good");
        }
        else if (total >=65){
            System.out.println("good");
        }
        else if (total >=50){
            System.out.println("accepted");
        }
        else{
            System.out.println("failed");
        }        
      
    }
}
