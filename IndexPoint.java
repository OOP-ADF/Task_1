//Erwin Yulizar F || 1301144031 || IF-38-01


import java.util.Scanner;

public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);

        System.out.print("Masukkan nilai UTS : ");
        int nilaiUts = nilai.nextInt();
        System.out.print("Masukkan nilai Tugas : ");
        int nilaiTugas = nilai.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int nilaiUAS = nilai.nextInt();

        double nilaiAkhir = (nilaiUts * 0.35) + (nilaiUAS * 0.4) + (nilaiTugas * 0.25);

        if ((nilaiAkhir >= 85) && (nilaiAkhir <= 100)) {
            System.out.println("excellent");
        }
        else if (nilaiAkhir >=75){
            System.out.println("very good");
        }
        else if (nilaiAkhir >= 65){
            System.out.println("good");
        }
        else if (nilaiAkhir >= 50){
            System.out.println("accepted");
        }else {
            System.out.println("failed");
        }
    }
}
