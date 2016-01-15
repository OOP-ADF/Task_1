//Anang Kurniawan 
//1301140192
//IF-38-02

import java.util.Scanner;

public class IndexPoint {
    
    public static void main(String[] args) {
        
        double uts;
        double uas;
        double kuis;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai UTS: ");
        uts = input1.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = input2.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input3.nextDouble();
        
        double nilai = uts*0.35 + uas*0.4 + kuis*0.25;
        
        String indeks = null;
        if (nilai >= 85 && nilai <= 100)
        {
            indeks = "Excellent";
        }
        else if (nilai >= 75 && nilai < 85)
        {
            indeks = "Very Good";
        }
        else if (nilai >= 65 && nilai < 75)
        {
            indeks = "Good";
        }
        else if (nilai >= 50 && nilai < 65)
        {
            indeks = "Acceptable";
        }
        else if (nilai <= 0 && nilai < 50)
        {
            indeks = "Failed";
        }
        
        System.out.println("Nilai Akhir: "+nilai);
        System.out.println("Keterangan: " );
        System.out.println(indeks);
    }
    
}
