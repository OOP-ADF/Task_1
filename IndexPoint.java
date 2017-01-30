package indexpoint;
import java.util.Scanner;
/**
 *
 * @author  Kukuh Rahingga P
 *          1301150035
 *          IF-39-07
 */
public class IndexPoint 
{
    public static void main(String[] args) 
    {
        int uas, uts, quiz;
        double nilai;
        Scanner inp = new Scanner (System.in);
        
        System.out.print("Masukkan nilai uas : ");
        uts = inp.nextInt();
        System.out.print("Masukkan nilai uts : ");
        uas = inp.nextInt();
        System.out.print("Masukkan nilai quiz : ");
        quiz = inp.nextInt();
        
        nilai = (uts*0.35)+(uas*0.4)+(quiz*0.25);
        
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
            System.out.println("Penghitungan error, cek kembali input anda");
    }   
}
