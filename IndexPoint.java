/*
Nama 	: Iqbal Pratomo Santoso
Kelas	: IF-38-02
NIM 	: 1301144042
 */
package indexpoint;

import java.util.Scanner;
/**
 *
 * @author iqbal
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        double uts,uas,quiz,hasil;
        System.out.print("Masukkan Nilai UTS : ");
        uts = baca.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        uas = baca.nextDouble();
        System.out.print("Masukkan Nilai Quiz : ");
        quiz = baca.nextDouble();
        hasil = (0.35*uts)+(0.4*uas)+(0.2*quiz);
        if((hasil>=85)&&(hasil<=100)){
            System.out.println("Excellent");
        }else if((hasil>=75)&&(hasil<85)){
            System.out.println("Very Good");
        }else if((hasil>=65)&&(hasil<75)){
            System.out.println("Goog");
        }else if((hasil>=50)&&(hasil<65)){
            System.out.println("Accepted");
        }else if((hasil>=0)&&(hasil<50)){
            System.out.println("Failed");
        }
    }
    
}

