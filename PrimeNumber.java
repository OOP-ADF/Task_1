/*
* abdulnursahid - 1301154385 - if39-07
*/

package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int bil, i, p ;
        p = 0;
        Scanner cin = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        bil = cin.nextInt();
        
        for (i=1; i <= bil; i++){
            if(bil % i == 0){
                p++;
            }
        }
        
        if ( p == 2){
            System.out.println(bil + " Merupakan Bilangan Prima");
        }
        else if ( p != 2){
           System.out.println(bil + " Merupakan Tidak Bilangan Prima"); 
        } 
            
    }
    
}

