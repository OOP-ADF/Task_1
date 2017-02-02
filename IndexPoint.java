package alwaw;

import java.util.Scanner;

public class Index {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        double uts, uas, quis;
        double hasilA, hasilB, hasilC;
        double hasil;
        String indexHasil;
        
        System.out.print("Nilai UTS : ");
        uts = cin.nextInt();
        
        System.out.print("Nilai Uas : ");
        uas = cin.nextInt();
        
        System.out.print("Nilai Quiz : ");
        quis = cin.nextInt();
        
        if ((uts <= 100) && (uas <= 100) && (quis <= 100)){
            hasilA = 0.35*uts;
            hasilB = 0.4*uas;
            hasilC = 0.25*quis;
        hasil = hasilA + hasilB + hasilC;
        System.out.println("Rata-Rata hasil : " + hasil);
            
        if ((hasil<=100) && (hasil>=85)){
            indexHasil = "Excellent";
        }
        else if ((hasil<=84) && (hasil>=75)){
            indexHasil = "VeryGood";
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
            indexHasil = "Hasil Error";
        }
        System.out.println("index yg diperoleh : " +indexHasil);
        }
        else{
            System.out.println("input salah");
        }
    }
}   
