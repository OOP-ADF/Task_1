/*
Andi Masruril Haq
1301140399
IF 38-09
*/
import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args){
        double uts,uas,quiz,total;
        Scanner inputan = new Scanner (System.in);
        System.out.print("Masukkan Nilai UTS : ");
        uts = inputan.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        uas = inputan.nextInt();
        System.out.print("Masukkan Nilai Quiz : ");
        quiz = inputan.nextInt();
        total = (uts*35/100)+(uas*40/100)+(quiz*25/100);
        System.out.println("total Nilai Anda adalah : "+total);
        if (total >= 85){
            System.out.println("excellent");
        }
        else if (total >=75 ){
            System.out.println("very good");
        }
        else if (total >=65){
            System.out.println("good");
        }
        else if (total >=50){
            System.out.println("accepted");
        }
        else{
            System.out.println("failed");
        }        
      
    }
}
