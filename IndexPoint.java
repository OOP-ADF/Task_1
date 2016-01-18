/*
Nama : Vicha Octavia Tama
Nim  : 1301144209
Kelas: IF 38-09
 */
package indexpoint;
import java.util.Scanner;
/**
 *
 * @author Vicha Octavia Tama
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nilaiUAS;
        float nilaiUTS;
        float nilaiQUIZ;
        double totalNilai;
        Scanner input=new Scanner(System.in);
        
        System.out.println("==NILAI MAHASISWA==");
        System.out.println("Masukkan Nilai QUIZ : ");
        nilaiQUIZ=input.nextFloat();
        System.out.println("Masukkan Nilai UTS : ");
        nilaiUTS=input.nextFloat();
        System.out.println("Masukkan Nilai UAS : ");
        nilaiUAS=input.nextFloat();
        totalNilai=(0.25*nilaiQUIZ+0.35*nilaiUTS+0.4*nilaiUAS);
        
        if(totalNilai>84&&totalNilai<=100)
        {
            System.out.println("Excellent");
        }
        else if(totalNilai>74&&totalNilai<=84)
        {
            System.out.println("Very Good");
        }
        else if(totalNilai>64&&totalNilai<=74)
        {
            System.out.println("Good");
        }
        else if(totalNilai>49&&totalNilai<=64)
        {
            System.out.println("Accepted");
        }
        else
        {
            System.out.println("Failed");
        }
        
    }
    
}

