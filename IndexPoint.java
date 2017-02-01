/* Nama  : Faishal Wafi N
   NIM   : 1301154222
   Kelas : IF-39-12
*/

import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Masukan nilai UTS : ");
        int uts = cin.nextInt();
        System.out.print("Masukan nilai UAS : ");
        int uas = cin.nextInt();
        System.out.print("Masukan nilai Kuis : ");
        int kuis = cin.nextInt();
        
        double nilaitotal = (0.35*uts) + (0.40*uas) + (0.25*kuis);
        if (nilaitotal >= 85 && nilaitotal <= 100){
            System.out.println("Grade : Excellent");
        }else if (nilaitotal >= 75 && nilaitotal < 85){
            System.out.println("Grade : Very Good");
        }else if (nilaitotal >=65 && nilaitotal < 75){
            System.out.println("Grade : Good");
        }else if (nilaitotal >=50 && nilaitotal < 65){
            System.out.println("Grade : Accepted");
        }else {
            System.out.println("Grade : Failed");
        }
    }
}
