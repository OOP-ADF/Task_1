import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args) {
        System.out.println("NILAI");
        Scanner cin = new Scanner(System.in);
        System.out.print("Nilai Kuis: ");
        int kuis = cin.nextInt();
        System.out.print("Nilai UTS: ");
        int uts = cin.nextInt();
        System.out.print("Nilai UAS: ");
        int uas = cin.nextInt();
        
        double finalscore = ((kuis*0.25) + (uts*0.35) + (uas*0.4));
        if (finalscore >= 85 && finalscore <= 100) {
            System.out.println("Grade : Excellent");
        }
        else if (finalscore >= 75 && finalscore <= 85) {
            System.out.println("grade : Very Good");
        }
        else if (finalscore >=65 && finalscore <=74 ) {
            System.out.println("Grade : Good");
        }
        else if (finalscore >=50 && finalscore <= 64) {
            System.out.println("Grade: Accepted");
        }
        else if (finalscore >= 49 && finalscore <=0) {
            System.out.println("Grade : Failed");
        }
    }
}

