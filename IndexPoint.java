
import java.util.Scanner; 

/**
 *
 * @author Alwi faisal
 */
public class IndexPoint {
    
    
    public static void main(String[] args) {
            String nama ,nim ;
            final double n_tugas, n_uts, n_uas,n_quiz, n_akhir;
            Scanner input = new Scanner (System.in);
            System.out.println ("====nilai akhir mahasiswa===\n");
            System.out.print("Masukan nama :");
            nama = input.nextline();
            System.out.print ("nim : ");
            nim  = input.nextline();
            System.out.print("nilai tugas   :");
            n_tugas = input.nextint();
            System.out.print("nilai uts :");
            n_uts = input.nextint();
            System.out.print("nilai quiz    :");
            n_quiz = input.nextint();
            System.out.print("nilai uas   :");
            n_uas = input.nextint();
            n_akhir = (0.15 * n_tugas + 0.20 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);
            System.out.println(nama+" NIM"+nim+" nilai akhir "+n_akhir);
            
          if (n_akhir >= 85 && n_akhir <=100){
            grade = 'A';
        }
        else if (n_akhir > 75 && n_akhir < 85){
            grade = 'B';
        }
        else if (n_akhir > 65 && n_akhir < 75){
            grade = 'C';
        }
        else if (n_akhir > 50 && n_akhir < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("\n"+nama+"  NIM "+nim+" nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n Lulus");
        }
        else {
            System.out.println("\n"+nama+" NIM "+nim+" nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n Tidak Lulus");
        }  
    }
}
