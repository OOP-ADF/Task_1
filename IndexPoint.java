/*
 * I Made Riartha Prawira
 * NIM : 1301140069
 * IF-38-09
 */
package indexpoint;
import java.util.Scanner;

public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nilaiUTS;
        float nilaiUAS;
        float kuis;
        double nilaitotal;
        
        Scanner ujian = new Scanner(System.in);
        
        System.out.println("Masukkan nilai UTS : ");
        nilaiUTS=ujian.nextFloat();
        
        System.out.println("Masukkan nilai UAS : ");
        nilaiUAS=ujian.nextFloat();
        
        System.out.println("Masukkan nilai Kuis : ");
        kuis=ujian.nextFloat();
        
        nilaitotal=0.35*nilaiUAS+0.40*nilaiUTS+0.25*kuis;
        
        System.out.println("Skor akhir kamu adalah : "+nilaitotal);
        
        if(nilaitotal>=85 && nilaitotal<=100){
            System.out.println("Excellent");
        }
        else if(nilaitotal>=75 && nilaitotal<=84){
            System.out.println("Very Good");
        }
        else if(nilaitotal>=65 && nilaitotal<=74){
            System.out.println("Good");
        }
        else if(nilaitotal>=50 && nilaitotal<=64){
            System.out.println("Accepted");
        }
        else if(nilaitotal>=0 && nilaitotal<=49){
            System.out.println("Failed");
        }
        
        
    }
}

