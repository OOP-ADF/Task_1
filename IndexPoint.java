/**
 * Nama: Herica Bunga Maharani
 * Nim: 1301154572
 * Kelas: IF-39-12
 */
import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);
        
        System.out.print ("Masukkan Nilai Kuis: ");
        int kuis = cin.nextInt();
        System.out.print ("Masukkan Nilai UTS: ");
        int uts = cin.nextInt();
        System.out.print ("Masukkan Nilai UAS: ");
        int uas = cin.nextInt();
        
        double n_akhir=(0.25*kuis) + (0.35*uts) + (0.40*uas);
        if (n_akhir >= 85 && n_akhir <= 100) {
            System.out.println("Excellent");
        } else if (n_akhir >= 75 && n_akhir <= 84) {
            System.out.println("Very Good");
        } else if (n_akhir >= 65 && n_akhir <= 74) {
            System.out.println("Good");
        } else if (n_akhir >= 50 && n_akhir <= 64) {
            System.out.println("Accepted");
        } else {
            System.out.println("Failed");
        }
    }
}
