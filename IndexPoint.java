/*
Nama : Deta Kurnia Soundra
NIM : 1301140109
Kelas : IF 38-09
 */
package menentukan_index;

import java.util.Scanner;

/**
 *
 * @author soundra
 */
public class Menentukan_index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float quiz;
        float uts;
        float uas;
        double total;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai UTS Anda : ");
        uts=scan.nextFloat();
        
        System.out.println("Masukkan Nilai UAS Anda : ");
        uas=scan.nextFloat();
        
        System.out.println("Masukkan Nilai Quiz Anda : ");
        quiz=scan.nextFloat();
        
        total = (0.35*uts + 0.4*uas + 0.25*quiz);
        
        if (total>84 && total<=100)
        {
             System.out.println("Nilai nya sangat Sempurna :)");
        }
        else if(total>74 && total<=84)
        {
            System.out.println("Nilai nya sangat memuaskan :)");
        }
        else if(total>64 && total<=74)
        {
            System.out.println("Nilai nya bagus :)");
        }
        else if(total>49 && total<=64)
        {
            System.out.println("Nilai nya cukup :)");
        }
        else
        {
            System.out.println("Maaf kamu gagal :(");
        }
    }
