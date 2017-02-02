package task1;

import java.util.Scanner;

public class IndexPoint {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        double uts, uas, quiz;
        double hasil1, hasil2, hasil3;
        double hasil;
        String indexHasil;
        
        System.out.print("Masukkan nilai UTS : ");
        uts = inp.nextInt();
        
        System.out.print("Masukan nilai UAS : ");
        uas = inp.nextInt();
        
        System.out.print("Masukkan nilai Quiz : ");
        quiz = inp.nextInt();
        
        //-------------------------------------------//
        
       if((uts <= 100) && (uas <= 100) && (quiz <= 100)){
            hasil1 = 0.35*uts;
            hasil2 = 0.4*uas;
            hasil3 = 0.25*quiz;
            
            hasil = hasil1 + hasil2 + hasil3;
            System.out.println("Rata - Rata hasil : " + hasil);
            
            if ((hasil<=100) && (hasil>=85)){
                indexHasil = "Excellent";
            }
            else if ((hasil<=84) && (hasil>=75)){
                indexHasil = "Very Good";
            }
            else if ((hasil<=74) && (hasil>=65)){
                indexHasil = "Good";
            }
            else if ((hasil<=64) && (hasil>=50)){
                indexHasil = "Accepted";
            }
            else if ((hasil<=100) && (hasil>=0)){
                indexHasil = "Failed";
            }
            else{
                indexHasil = "Hasil error!";
            }
            
            //-------------------------------------//
            
            System.out.println("Index yang diperoleh : " + indexHasil);
        }
        else{
            System.out.println("Input salah!");
        }
    
  }
    
}
