/*
Andi Masruril Haq
1301140399
IF 38-09
*/

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int bil, i;
        boolean prima;
        
        Scanner inputan= new Scanner (System.in);
        System.out.print("Masukkan Angka : ");
        bil = inputan.nextInt();
        prima = true;
        for (i=2;i<bil;i++){
            if ((bil % i) == 0){
                prima = false;
            }
        }
        if (prima == true)
            System.out.println(bil+ " adalah bilangan prima");
        else
            System.out.println(bil + " adalah bukan bilangan prima");
        
    }
    
}
