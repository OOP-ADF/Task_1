/* Nama		: Chando Anggara Natanael Batubara 
 * Nim		: 1301154390
 * Kelas	: IF 39-12
 */
 
import java.util.Scanner;

public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner quiz = new Scanner (System.in);
    System.out.println("Masukkan Nilai Quiz : ");
    int  k = quiz.nextInt();
    Scanner uts = new Scanner (System.in);
    System.out.println("Masukkan Nilai UTS : ");
    int  l = uts.nextInt();
    Scanner uas = new Scanner (System.in);
    System.out.println("Masukkan Nilai UAS : ");
    int  m = uas.nextInt();
    double nakhir;
    int nakhirQuiz, nakhirUts, nakhirUas;
    nakhirQuiz = k*25/100;
    nakhirUts  = l*35/100;
    nakhirUas  = m*40/100;
    nakhir = nakhirQuiz + nakhirUts + nakhirUas;
    if (nakhir >= 85 && nakhir <=100)
    {
        System.out.print("Index nilai akhir anda : EXCELLENT ");
    }
    else if (nakhir >= 75 && nakhir <=84)
    {
        System.out.print("Index nilai akhir anda : VERY GOOD ");
    }
    else if (nakhir >= 65 && nakhir <=74)
    {
        System.out.print("Index nilai akhir anda : GOOD ");
    }
    else if (nakhir >= 55 && nakhir <=64)
    {
        System.out.print("Index nilai akhir anda : ACCEPTED ");
    }
    else
    {
        System.out.print("Index nilai akhir anda : FAILED ");
    }
        
    }
       
}