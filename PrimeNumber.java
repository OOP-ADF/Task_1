/* Nama		: Chando Anggara Natanael Batubara 
 * Nim		: 1301154390
 * Kelas	: IF 39-12
 

 */
import java.util.Scanner;

public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Masukkan Sembarang Bilangan : ");
    int angka = input.nextInt();
    int x = 0;
    for (int a = 1; a < angka; a++ )
    {
        if ((angka % a) == 0)
        {
            x++;
        }
    }
    if ( x == 1)
    {
        System.out.print(" Bilangan tersebut merupakan BILANGAN PRIMA ");
    }else
    {
        System.out.print("Bilangan tersebut BUKAN BILANGAN PRIMA ");
        
    }  
  }
}

