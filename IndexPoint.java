package task_1;
import java.util.Scanner;
/**
 *
 * @author Andre Anugrah
 */
public class IndexPoint 
{
    public static void main(String[] args) 
    {
        //input
        Scanner input = new Scanner (System.in);
        System.out.print("Nilai uas : ");
        int uts = input.nextInt();
        System.out.print("Nilai uts : ");
        int uas = input.nextInt();
        System.out.print("Nilai quis : ");
        int quiz = input.nextInt();
        
        //program
        double nilai = (uts*0.35)+(uas*0.4)+(quiz*0.25);
        
        //output
        if (nilai >= 0 && nilai < 50)
            System.out.println(nilai + ", Grade : Failed");
        else if (nilai < 65)
            System.out.println(nilai + ", Grade : Accepted");
        else if (nilai < 75)
            System.out.println(nilai + ", Grade : Good");
        else if (nilai < 85)
            System.out.println(nilai + ", Grade : Very Good");
        else if (nilai <= 100)
            System.out.println(nilai + ", Grade : Exellent");
    }   
}
