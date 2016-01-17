//Syahrizal Hafid Rozaqi - IF3802 - 1301144252
import java.util.Scanner;
public class IndexPoint {
    public static void main(String[] args) {
        System.out.println("Menghitung Nilai Akhir");
        System.out.print("Masukkan Nilai Quiz : ");
        Scanner nilai = new Scanner(System.in);
        float nilaiquiz = nilai.nextFloat();
        System.out.print("Masukkan Nilai UTS : ");
        float nilaiuts = nilai.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        float nilaiuas = nilai.nextFloat();
        
        float hasilquiz = ((25*nilaiquiz)/100);
        float hasiluts = ((35*nilaiuts)/100);
        float hasiluas = ((40*nilaiuas)/100);
        float total = (hasilquiz+hasiluts+hasiluas);
        
        if (total >= 85){
            String grade = "Excellent";
            System.out.println("Anda memiliki Index Point "+total+" Dengan Grade = "+grade);
        }
        else if (total >= 75){
            String grade = "Very Good";
            System.out.println("Anda memiliki Index Point "+total+" Dengan Grade = "+grade);
        }
        else if (total >= 65){
            String grade = "Good";
            System.out.println("Anda memiliki Index Point "+total+" Dengan Grade = "+grade);
        }
        else if (total >= 50){
            String grade = "Accepted";
            System.out.println("Anda memiliki Index Point "+total+" Dengan Grade = "+grade);
        }
        else if (total >= 0){
            String grade = "Failed";
            System.out.println("Anda memiliki Index Point "+total+" Dengan Grade = "+grade);
        }
    }
}