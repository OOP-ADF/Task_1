package task_1;

import java.util.Scanner;

/**
 *
 * @author Ridwan Hadiansyah
 * 1301154273/IF 39-07
 */
public class Task_1 {
    //Prime NUMBER
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);
        System.out.println("PrimeNumber");
        System.out.print("Masukkan Angka : ");
        int angka = cin.nextInt();
        
        int count = 0;
        for (int i = 1; i<=angka; i++) {
            if (angka % i == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            System.out.println(+ angka +" Adalah Bilangan Prima");
        } else {
            System.out.println(+ angka +" Bukan Bilangan Prima");
        }
    }
}

