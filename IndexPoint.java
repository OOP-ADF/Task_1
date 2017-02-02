/**
 * Nafasa Muth Ma'nah
 * 1301150441
 */
package IndexPoint;

import java.util.Scanner;

public class IndexPoint{
  public static void main(String[] args) {
    
        String nama;
        int nilai1, nilai2, nilai3,nim;
        double kuis, uts, uas, na;
        
        Scanner a = new Scanner(System.in);
        
        System.out.print(" Masukkan Nama Mahasiswa : ");
        nama = a.nextLine();
        System.out.print("Masukkan NIM Mahasiswa : ");
        nim = a.nextInt();
        System.out.print("Masukkan nilai UTS Mahasiswa : ");
        nilai1 = a.nextInt();
        System.out.print("Masukkan nilai UAS Mahasiswa : ");
        nilai2 = a.nextInt();
        System.out.print("Masukkan nilai Kuis Mahasiswa : ");
        nilai3 = a.nextInt();
        
        uts = 0.35*nilai1;
        uas = 0.4*nilai2;
        kuis = 0.25*nilai3;
        na = uts + uas + kuis;
        if ((na >=85) && (na<=100)){
            System.out.println("Grade : Excellent");
        }
        else if ((na>=75) && (na<=84)){
            System.out.println("Grade : Very Good");
        }
        else if ((na>=65) && (na<=74)){
            System.out.println("Grade : Good");
        }
        else if ((na>=50) && (na<=64)){
            System.out.println("Grade : Accepted");
        }
        else if ((na>=0) && (na<=49)){
            System.out.println("Grade : Failed");
        }
        System.out.print("Mahasiswa dengan Nama " + nama + " Mendapatkan Nilai Akhir : " + na);
    }   
}