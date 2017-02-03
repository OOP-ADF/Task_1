package indexpoint;
import java.util.Scanner;
/**
 *
 * @author  Ressa Firmansyah Fatah
 *          1301154105
 *          IF-39-07
 */
public class IndexPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Input nilai uas : ");
        int uts = input.nextInt();
        System.out.print("Input nilai uts : ");
        int uas = input.nextInt();
        System.out.print("Input nilai quis : ");
        int quiz = input.nextInt();
        
        double nilai = (uts*0.35)+(uas*0.4)+(quiz*0.25);
        
        if (nilai >= 0 && nilai < 50)
            System.out.println("Nilai : " + nilai + ", Grade : Failed");
        else if (nilai < 65)
            System.out.println("Nilai : " + nilai + ", Grade : Accepted");
        else if (nilai < 75)
            System.out.println("Nilai : " + nilai + ", Grade : Good");
        else if (nilai < 85)
            System.out.println("Nilai : " + nilai + ", Grade : Very Good");
        else if (nilai <= 100)
            System.out.println("Nilai : " + nilai + ", Grade : Exellent");
        else
            System.out.println("error");
    }   
}