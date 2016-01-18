/*
Nama : Vicha Octavia Tama
Nim  : 1301144209
Kelas: IF 38-09
 */
package primenumber;
import java.util.Scanner;
/**
 *
 * @author Vicha Octavia Tama
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka;
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("==CEK PRIMA==");
        System.out.println("Masukkan angka : ");
        angka=input.nextInt();
        
        i = 0;
        for(int a=1;a<=angka;a++)
        {
            if(angka%a==0)
            {
                i=i+1;
            }
        }
        
        if(i==2)
        {
            System.out.println("Bilangan tersebut adalah bilangan prima");
        }
        else
        {
            System.out.println("Bilangan tersebut bukan merupakan bilangan prima");
        }
        
        }
}

