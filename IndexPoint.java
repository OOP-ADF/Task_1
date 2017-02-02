package task_1;

import java.util.Scanner;

/**
 *
 * @author Ridwan Hadiansyah
 * 1301154273 / IF 39-07
 */
public class IndexPoint {
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);
        
        System.out.print("Masukkan Nilai QUIZ : ");
        int quiz = cin.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int uts = cin.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int uas = cin.nextInt();
        
        double nilaiAkhir = (quiz*0.25)+(uts*0.35)+(uas*0.4);
        
        if(nilaiAkhir >= 0 && nilaiAkhir < 50) {
            System.out.println("Nilai Akhir : " +nilaiAkhir +" Grade : Failed");
        } else if(nilaiAkhir < 65) {
            System.out.println("Nilai Akhir : " +nilaiAkhir +" Grade : Accept");
        } else if(nilaiAkhir < 75) {
            System.out.println("Nilai Akhir : " +nilaiAkhir +" Grade : Good");
        } else if(nilaiAkhir < 85) {
            System.out.println("Nilai Akhir : " +nilaiAkhir +" Grade : Very Good");
        } else if(nilaiAkhir <=100) {
            System.out.println("Nilai Akhir : " +nilaiAkhir +" Grade : Excellent");
        }
    }
}
