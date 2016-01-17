/*
nama:Lenni Syarifah Lubis
nim:1301144152
kelas:IF 38 02
*/

import java.util.Scanner;
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double uas, uts, kuis, hasil;
        
        Scanner read = new Scanner(System.in);
        System.out.print("Masukan nilai UAS: ");
        uas = read.nextDouble();
        System.out.print("Masukan nilai UTS: ");
        uts = read.nextDouble();
        System.out.print("Masukan nilai KUIS: ");
        kuis = read.nextDouble();
        
        hasil = (uas * 0.4)+(uts * 0.35)+(kuis * 0.25);
        
        if ((hasil >=0) & (hasil <=49)){ 
            System.out.print("Failed");
    }
        else if ((hasil >=50) & (hasil <=64)){
            System.out.print("Accepted");
        }
        else if ((hasil >=65) & (hasil <=74)){
            System.out.print("Good");
                    }
        else if ((hasil >=75) & (hasil <=84)){
            System.out.print("Very Good");
        }
        else if ((hasil >=85) & (hasil<=100)){
            System.out.print("Excellent");
        }
    }
    }
