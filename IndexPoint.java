import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai UTS    : ");
        int uts= input.nextInt();
        System.out.print("Masukkan Nilai UAS    : ");
        int uas= input.nextInt();
        System.out.print("Masukkan Nilai Quiz   : ");
        int quiz= input.nextInt();
        
        float hasil=(0.35 * uts)+(0.4 * uas)+(0.25 * quiz);
        
        if (hasil <= 49){
            System.out.println("\nGrade = Failed");
        }
        else{
            if (hasil <= 64) {
                System.out.println("\nGrade = Accepted");
            }
            else{
                if (hasil <= 74) {
                    System.out.println("\nGrade = Good");
                }
                else{
                    if (hasil <= 84) {
                        System.out.println("\nGrade = Very Good");
                    }
                    else{
                        System.out.println("\nGrade = Excellent");
                    }
                }
            }
        }
    }
}
