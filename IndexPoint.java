
Daniel Tanta Christopher Sirait , 1301150054 , IF-39-12

import java.util.Scanner;
public class IndexPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String grade = null;
        double uas, uts, quiz, total;
        System.out.println("Menghitung Nilai Mahasiswa");
        System.out.println("Masukkan Nilai UTS :");
        uts = input.nextInt();
        System.out.println("Masukkan Nilai UAS :");
        uas = input.nextInt();
        System.out.println("Masukkan Nilai Quiz :");
        quiz = input.nextInt();
        total = (0.35 * uts + 0.40 * uas + 0.25 * quiz);
        if (total >= 85 && total <= 100){
            grade = "Excellent";
        }
        else if (total > 75 && total < 84){
            grade = "Very Good";
        }
        else if (total > 65 && total < 74){
            grade = "Good";
        }
        else if (total > 50 && total < 64){
            grade = "Accepted";
        }
        else if (total < 49){
            grade = "failed";
        }
            System.out.println("Nilai Akhir anda "+total +", Dinyatakan "+grade);
        }
        }
