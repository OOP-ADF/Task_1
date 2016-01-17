/* Nama : Basado Jurianto Sitorus
 * Kelas :IF-39-02
 * NIM : 1301140002
 */
package bilangan.prima;

/**
 *
 * @author Bee
 */
import java.util.Scanner;
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Angka :");
        int angka = input.nextInt();
        int i=1;
        int x = 0; 
        {if (angka % i == 0){
                x++;
            }
            i++;
           
            }
            if (x == 2){
                System.out.println("Angka yang anda inputkan"+angka+"adalah bilangan prima");
           }else{
                System.out.println("angka yang anda inputkan"+angka+"bukan bilangan prima");
                }
}
}
