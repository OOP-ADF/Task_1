import java.util.Scanner;

public class CobaScore {

    public static void main(String[] args) {
        double lastNilai, nilaiUTS, nilaiUAS, nilaiQuiz;
        Scanner cinD = new Scanner(System.in);

        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = cinD.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = cinD.nextDouble();
        System.out.print("Masukkan Nilai Quiz: ");
        nilaiQuiz = cinD.nextDouble();

        lastNilai = (0.35 * nilaiUTS) + (0.4 * nilaiUAS) + (0.25 * nilaiQuiz);

        if (lastNilai >= 85.0 && lastNilai <= 100) {
            System.out.println("EXCELLENT");
        } else if (lastNilai >= 75 && lastNilai <= 84) {
            System.out.println("VERY GOOD");
        } else if (lastNilai >= 65 && lastNilai <= 74) {
            System.out.println("GOOD");
        } else if (lastNilai >= 50 && lastNilai <= 64) {
            System.out.println("ACCEPTED");
        } else if (lastNilai >= 0 && lastNilai <= 49) {
            System.out.println("FAILED");
        }
    }

}

