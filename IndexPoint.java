package javaapplication1;

   import java.util.Scanner;
public class gradenilai {
     public static void main (String [] args){

String nama , nim ;
        final double n_tugas , n_uts , n_kuis , n_uas , n_akhir;
        Scanner input = new Scanner (System.in);
  System.out.println("Mencari grade");
        System.out.print("Nilai kuis : ");
        n_kuis = input.nextInt();
        System.out.print("Nilai uts : ");
        n_uts = input.nextInt();
        System.out.print("Nilai uas : ");
        n_uas = input.nextInt();
        n_akhir = ( 0.20 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);
        
        
    
     if (n_akhir >= 85 && n_akhir <=100){
            System.out.println("Excellent");
        }
        else if (n_akhir > 75 && n_akhir < 85){
            System.out.println("Very Good");
        }
        else if (n_akhir > 65 && n_akhir < 75){
            System.out.println("Good");
        }
        else if (n_akhir > 50 && n_akhir < 65){
            System.out.println("Accepted");
        }
        else {
            System.out.println("Failed");
        }
     
}
}
