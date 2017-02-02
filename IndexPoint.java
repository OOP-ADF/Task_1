/*
/* Azahra Kartika-1301154460-IF-39-12
 */
package primernumber;

/**
 *
 * @author Acer
 */
import java.util.Scanner;

public class IndexPoint {
    public static void main (String[] args)
    {Scanner cin = new Scanner (System.in);
    System.out.print("Input nilai UTS = ");
    int uts = cin.nextInt();
    System.out.print("Input nilai UAS = ");
    int uas = cin.nextInt();
    System.out.print("Input nilai Kuis = ");
    int kuis = cin.nextInt();
    
    double akhir = (0.35*uts) + (0.40*uas) + (0.25*kuis);
            if (akhir >= 85 && akhir <= 100)
            {
                System.out.print("Excellent");
            }
            else if (akhir >=75 && akhir <= 84)
            {
                System.out.print("Very Good");
            }
            else if (akhir >=65 && akhir <=74)
            {
                System.out.print("Good");
            }
            else if (akhir >=50 && akhir <= 64)
            {
                System.out.print("Accepted");
            }
            else
            {
                System.out.print("Failed");
            }
    }
}

