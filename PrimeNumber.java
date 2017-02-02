/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rifkymaulana;

import java.util.Scanner;

/**
 * Nama 	: Rifky Maulana
 * NIM 		: 1301154180
 * Kelas 	: IF-39-12
 * @author Jay
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("=======Pengecekan Bilangan Prima=======");
        System.out.print("Masukkan angka = ");
        int n = cin.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                count++;
            }
        }
        if(n > 0 && count == 0){
            System.out.println("Angka " +n+ " Adalah Bilangan Prima");
        }
        else {
            System.out.println("Angka " +n+ " Bukan Merupakan Bilangan Prima");
        }  
        System.out.println();
    }
}
