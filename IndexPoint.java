package indexpoint;

import java.util.Scanner;

public class IndexPoint {

    public static void main(String[] args) 
    {
        Scanner nilai = new Scanner(System.in);
        
        double n_uts, n_uas, n_kuis, n_akhir;
        System.out.print("Masukkan nilai UTS : ");
        n_uts = nilai.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        n_uas = nilai.nextInt();
        System.out.print("Masukkan nilai Kuis : ");
        n_kuis = nilai.nextInt();
        n_akhir = (0.35 * n_uts + 0.40 * n_uas + 0.25 * n_kuis);
        
        if (n_akhir >= 85) 
        {
            System.out.println("Excellent");
        }
        else if (n_akhir >= 75 && n_akhir < 85)
        {
            System.out.println("Very Good");
        }
        else if (n_akhir >= 65 && n_akhir < 75)
        {
            System.out.println("Good");
        }
        else if (n_akhir >= 50 && n_akhir < 65)
        {
            System.out.println("Accepted");
        }
        else 
        {
            System.out.println("Failed");
        }
        
        System.out.print(n_akhir + " itu nilai akhir Anda");
    }
}