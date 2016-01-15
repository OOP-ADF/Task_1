package primenumber;

import java.util.Scanner;

/**
 *
 * @author yuslanabubakar
 */
public class PrimeNumber {
    public static void main(String[] args) {               
        System.out.println("Selamat Datang Di Program Bilangan Prima");
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        
        if (angka % 2 == 1) {
            System.out.println("Angka "+angka+" adalah bilangan prima");
        }
        else {
            System.out.println("Angka "+angka+" adalah bukan bilangan prima");
        }
    }
    
}
