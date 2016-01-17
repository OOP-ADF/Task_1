/*
nama:Lenni Syarifah Lubis
nim:1301144152
kelas:IF 38 02
*/

import java.util.Scanner;
public class PrimeNumber {
    /**
     * @param args the command line arguments
     */
public static void main (String[] args){
    int angka,hasil,a,b;
    
    
    Scanner read = new Scanner(System.in);
    System.out.print("Masukkan Angka :");
    angka = read.nextInt();
    
    a = 1;
    b = 0;
    
    while (a <= angka) {
        if (angka % a == 0){
            b++;
        }
        
        a++;
    }
    if (b == 2){
        System.out.print("Prima");
    }
    else{
        System.out.print("Tidak prima");
    }
}
    }
    