/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//ANNISA RIZKI PRATIWI WIBOWO
//1301144391
//IF-38-01

package primenumber;
import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int n=input.nextInt();
        int x=0;
        if (n == 1) 
        {
            System.out.println("Bukan Bilangan Prima");
        }
        else
        {
            for (int i=1; i<=n; i++)
            {
                if ((n % i) == 0)
                {
                    x=x+1;
                }
            }
            if (x <= 2)
            {
                System.out.println("Bilangan Prima");
            }
            else
            {
                System.out.println("Bukan Bilangan Prima");
            }
        }
}
