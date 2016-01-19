/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//ANNISA RIZKI PRATIWI WIBOWO
//1301144391

package indexpoint;
import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner uts = new Scanner(System.in);
        Scanner uas = new Scanner(System.in);
        Scanner kuis = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai UTS: ");
        int mid = uts.nextInt();
        System.out.println();
        System.out.print("Masukkan Nilai UAS: ");
        int end = uas.nextInt();
        System.out.println();
        System.out.print("Masukkan Nilai Kuis: ");
        int quiz = kuis.nextInt();
        System.out.println();
        
        double na = ((0.35*mid)+(0.40*end)+(0.25*quiz));
        if ((na >= 85) && (na <= 100))
        {
            System.out.println("EXCELLENT");
        }
        else if ((na >= 75) && (na <= 84))
        {
            System.out.println("VERY GOOD");
        }
        else if ((na >= 65) && (na <= 74))
        {
            System.out.println("GOOD");
        }
        else if ((na >= 50) && (na <= 64))
        {
            System.out.println("ACCEPTED");
        }
        else if ((na >= 0) && (na <= 49))
        {
            System.out.println("FAILED");
        }
    }
    
}
