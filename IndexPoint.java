//Sylvia Dwi Anggraini
//1301154469
//if-39-07

package IndexPoint;
import java.util.Scanner;

public class IndexPoint{
    public static void main(String[] args) {
        String nama;
        int nilai1, nilai2, nilai3;
        double uas, uts, quis, nakhir;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        nama = input.nextLine();
        
        System.out.println("Masukkan Nilai kuis : ");
        nilai1 = input.nextInt();
        
        System.out.println("Masukkan Nilai uts : ");
        nilai2 = input.nextInt();
        
        System.out.println("Masukkan Nilai UAS : ");
        nilai3 = input.nextInt();
        
        quis = 0.25 * nilai1;
        uts = 0.35 * nilai2;
        uas = 0.4 * nilai3;
        
        nakhir = quis+uts+uas;
        System.out.println("Jadi nilai akhirnya adalah : "+nakhir);
        
        if(nakhir>=85 && nakhir<=100){
            System.out.println("Excellent");
        }
        else if(nakhir>=75 && nakhir<=84){
            System.out.println("Very Good");
        }
        else if(nakhir>=65 && nakhir<=74){
            System.out.println("Good");
        }
        else if(nakhir>=50 && nakhir<=64){
            System.out.println("Accepted");
        }
        else if(nakhir>=49 && nakhir<=0){
            System.out.println("Failed");
        }
    }
}
        
