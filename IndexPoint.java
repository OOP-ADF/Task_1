/*
Nama: ZULFA UMI WARDANI
Nim: 1301144082
Kelas: IF-38-02
*/

import java.util.Scanner;

/**
 *
 * @author ZULFA UMI WARDANI
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String index = null;
        System.out.println("Aplikasi Index Nilai");
        System.out.print("Kuis : ");
        Scanner kuis = new Scanner(System.in);
        double nkuis = kuis.nextInt();
        System.out.print("UTS : ");
        Scanner uts = new Scanner(System.in);
        double nuts = uts.nextInt();
        System.out.print("UAS : ");
        Scanner uas = new Scanner(System.in);
        double nuas = uas.nextInt();
        
        double nakhir = (nkuis*0.25)+(nuts*0.35)+(nuas*0.4);
        
        if (nakhir>=85 && nakhir<=100) {
            index = "Exellent";
        }else if (nakhir>=75 && nakhir<=84) {
            index = "Very Good";
        }else if (nakhir>=65 && nakhir<=74) {
            index = "Good";
        }else if (nakhir>=50 && nakhir<=64) {
            index = "Accepted";
        }else if (nakhir>=0 && nakhir<=49) {
            index = "Failed";
        }
        
        
        System.out.println("Nilai Kuis  : "+nkuis);
        System.out.println("Nilai UTS   : "+nuts);
        System.out.println("Nilai UAS   : "+nuas);
        System.out.println("Nilai Akhir : "+nakhir);
        System.out.println("Index Nilai : "+index);
    }
}
