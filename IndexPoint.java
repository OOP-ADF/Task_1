// nama : adrian g nurcahyo
// kelas : if-38-02
// nim : 1301140092
import java.util.Scanner;
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("1. Masukan nilai UAS : ");
        Scanner uas = new Scanner (System.in);
        float nilai = uas.nextInt();
        
        System.out.print("2. Masukan nilai UTS : ");
        Scanner uts = new Scanner (System.in);
        float nilai2 = uts.nextInt();
        
        System.out.print("3. Masukan nilai Quiz : ");
        Scanner quiz = new Scanner (System.in);
        float nilai3 = quiz.nextInt();
        
        float hasiluas = (float) (0.4*nilai);
        float hasiluts = (float) (0.35*nilai2);
        float hasilquiz = (float) (0.25*nilai3);
        float hasil = (hasiluas+hasiluts+hasilquiz);
        
        if ((hasil >= 85) && (hasil<=100))
        { 
            String grade = "Excellent";
            System.out.println("Kamu memiliki index point "+hasil+" dengan grade "+grade);
        }
        else if (hasil >= 75)
        { 
            String grade = "Very Good";
            System.out.println("Kamu memiliki index point "+hasil+" dengan grade "+grade);
        }
        else if (hasil >= 65)
        { 
            String grade = "Good";
            System.out.println("Kamu memiliki index point "+hasil+" dengan grade "+grade);
        }
        else if (hasil >= 50)
        { 
            String grade = "Accepted";
            System.out.println("Kamu memiliki index point "+hasil+" dengan grade "+grade);
        }
        else if (hasil >= 0)
        { 
            String grade = "Failed";
            System.out.println("Kamu memiliki index point "+hasil+" dengan grade "+grade);
        }
    }
}
