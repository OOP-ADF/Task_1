package nilai;

/**
 * @author HP
 * Nama : Zulvan Firdaus
 * NIM : 1301142292
 */
import java.util.Scanner;
public class task1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner (System.in);  
    System.out.print("UTS : ");  
    int uts = masukan.nextInt();
    System.out.print("UAS : ");  
    int uas = masukan.nextInt();  
    System.out.print("Quiz : ");  
    int quiz = masukan.nextInt();
    double hasil=((uts*35)+(uas*40)+(quiz*20))/100;
    
    if(hasil < 50) System.out.println("Failed");
    else if (hasil<65) System.out.println("Accepted");
    else if (hasil<75) System.out.println("Good");
    else if (hasil<65) System.out.println("Very Good");
    else System.out.println("Excelent");
    }
    
}
