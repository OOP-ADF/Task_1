/*
Nama    : Muhammad Maulud Hidayatullah Rambe
NIM     : 1301154166
Kelas   : IF. 39-12
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner cinInt = new Scanner(System.in);
        int number, counter;
        
        System.out.println("PRIME NUMBER CHECKER");
        System.out.println("");
        System.out.print("Masukan sebuah bilangan bulat: ");
        number = cinInt.nextInt();
        counter = 0;
        
        for(int i=1; i<=number; i++){
            if((number % i)==0){
                counter++;
            }
        }
        
        if(counter>2){
            System.out.println(number+" adalah BUKAN bilangan PRIMA");
        }else{
            System.out.println(number+" adalah bilangan PRIMA");
        }
    }
}
