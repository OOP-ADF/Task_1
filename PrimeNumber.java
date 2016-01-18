//Dhiva Azhara 1301144101 IF3801

package primenumber;

import java.util.Scanner;

/**
 *
 * @author dhivazhr
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka, prima;
        
        System.out.println("Masukkan angka: ");
        
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();
        
        prima = 0;
        for (int i=1; i<=angka; i++){
            if (angka % i == 0)
            {
                prima++;
            }
        }
        if (prima==2) {
            System.out.println("Angka " +angka +" merupakan bilangan prima");
        }
        else{
            System.out.println("Angka " +angka+ " bukan bilangan prima");
        }  
    }
    
}

