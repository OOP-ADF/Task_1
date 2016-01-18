/*
Nama : Deta Kurnia Soundra
NIM : 1301140109
Kelas : IF 38-09
 */
package bilangan.prima;

import java.util.Scanner;

/**
 *
 * @author soundra
 */
public class BilanganPrima {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p;
        int q;
        int r;
        Scanner scan = new Scanner(System.in);
        
        r = 0;
        System.out.println("Masukkan Bilangan : ");
        p = scan.nextInt();
        
        for (q=1;q<=p;q++)
        {
            if (p%q == 0)
            {
                r++;
            }
        }
        
        if (r == 2)
        {
            System.out.println("Bilangan Yang Telah Anda Masukkan Termasuk Prima");
        }
        else
        {
            System.out.println("Bilangan Yang Telah Anda Masukkan Bukan Bilangan Prima");
        }
    } 
}

