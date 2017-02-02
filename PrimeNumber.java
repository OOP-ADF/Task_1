Jeremiah Hasudungan IF-3907 1301154287

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author Jeremi
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scan = new Scanner(System.in);
            System.out.println(" Masukan Bilangan Yang akan di cek : ");
            int bilangan = scan.nextInt();
            boolean prime = true;
            
            for (int i=2; i<bilangan; i++){
    
                if ((bilangan % i) == 0) {
                    prime = false; break;

                    }
                }
            if (prime)
                System.out.println(bilangan + " Merupakan bilangan prima ");
            else
                System.out.println(bilangan + " Bukan bilangan prima  " );
    }
                    
    }
    


