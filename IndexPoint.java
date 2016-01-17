/* Nama : Basado Jurianto Sitorus
 * Kelas :IF-39-02
 * NIM : 1301140002
 */
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author Bee
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner nilai = new Scanner (System.in);
    System.out.print("Masukkan Nilai UTS :");
    float nilaiuts = nilai.nextFloat();
    System.out.print("Masukkan Nilai UAS :");
    float nilaiuas = nilai.nextFloat();
    System.out.print("Masukkan Nilai Quiz :");
    float nilaiquiz = nilai.nextFloat();
    
    float nilaiakhir = (float) (( nilaiuts * 0.35) + (nilaiuas * 0.4) + (nilaiquiz * 0.25));
 
    if (nilaiakhir >= 85) {
        String grade = "Excellent";
        System.out.println("Score ="+nilaiakhir+",Grade ="+grade);
    }
    else if (nilaiakhir >=75){
        String grade = "Very good";
        System.out.println("Score ="+nilaiakhir+",Grade ="+grade);
    }
    else if (nilaiakhir >=65){
        String grade = "Good";
        System.out.println("Score ="+nilaiakhir+",Grade ="+grade);
    }
    else if (nilaiakhir >=50) {
        String grade = "Accepted";
        System.out.println("Score ="+nilaiakhir+",Grade ="+grade);
    }
    else if (nilaiakhir >=0) {
        String grade = "Failed";
        System.out.println("Score ="+nilaiakhir+",Grade ="+grade);
    }
  }
 }

