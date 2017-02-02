
package task1;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int angka;
        int hitung = 0;
        
        System.out.print("Masukkan angka : ");
        angka = inp.nextInt();
        
        for (int i = 1 ; i <= angka ; i++ ){
            if(angka % i == 0){
                hitung++;
            }
        }

        
        if (hitung == 2 | hitung == 1){
            System.out.println("Bilangan prima");
        }
        else{
            System.out.println("Bukan Bilangan prima");
        }
    }
    
}
