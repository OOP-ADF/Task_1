//Rona Uli Pardede (1301144051)
//IF 38-01
package indexpoint;
import java.util.Scanner;

/**
 *
 * @author Rona
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner uts = new Scanner (System.in);
        Scanner uas = new Scanner (System.in);
        Scanner kuis = new Scanner (System.in);
        System.out.println("Masukan Nilai UTS: ");
        int t = uts.nextInt();
        System.out.println("Masukan Nilai UAS: ");
        int a = uas.nextInt();
        System.out.println("Masukan Nilai Kuis: ");
        int k = kuis.nextInt();
        System.out.println();
        double x=((t*0.35)+(a*0.4)+(k*0.25));
        if ((x>=85) && (x<=100)){
        System.out.println("EXELLENT");
    }
        else if ((x>=75) && (x<=84)){
        System.out.println("VERY GOOD");
    }
        else if ((x>=65) && (x<=74)){
        System.out.println("GOOD");
    }
        else if ((x>=50) && (x<=64)){
        System.out.println("ACCEPTED");
    }   
        else if ((x>=0) && (x<=49)){
        System.out.println("FAILED");
    }
    }
    
}
