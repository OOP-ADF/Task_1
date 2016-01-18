import java.util.Scanner;

/**
 * Eka Putri
 * 1301144312
 * IF 38 02
 */

public class IndexPoint {

    
    public static void main(String[] args) {
        
        Scanner masukkan = new Scanner(System.in);
        
        String nama, grade;
        int nuts,nuas,nquis;
        double muts,muas,mquis,makhir;
        
        System.out.print("Masukkan Nama Anda : ");
        nama = masukkan.nextLine();
        System.out.print("Masukkan Nilai UTS : ");
        nuts = masukkan.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nuas = masukkan.nextInt();
        System.out.print("Masukkan Nilai QUIS : ");
        nquis = masukkan.nextInt();
        
        muts = nuts*0.35;
        muas = nuas*0.40;
        mquis = nquis*0.25;
        makhir = muts+muas+mquis;
        
        System.out.println("===================================");
        
        if (makhir >= 85)
        {
            grade = "EXCELLENT";
        }
        else if (makhir >= 75)
        {
            grade = "VERY GOOD";
        }
        else if (makhir >= 65)
        {
            grade = "GOOD";
        }
        else if (makhir >= 50)
        {
            grade = "ACCEPTED";
        }
        else
        {
            grade = "FAILED";
        }
        
        System.out.print("Jadi Siswa Yang Bernama " + nama + "");
        System.out.println(" memperoleh nilai akhir sebesar " + makhir);
        System.out.println("Grade nilai yang didapat adalah " + "" + grade);
        }
}

