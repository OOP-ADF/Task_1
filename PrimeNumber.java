/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;
import java.util.Scanner; 
/**
 *
 * @author Metteora
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i; int angka; int j;
		j=0;
		System.out.println("PROGRAM PRIME NUMBER");
		Scanner a = new Scanner(System.in);
		System.out.println("Masukkan sebuah angka : ");
		angka = a.nextInt();
		
		for (i=1; i <= angka; i++) {
			if (angka % i==0) {
				j++;
			}
		}
		
		if (j==2) {
			System.out.println("Angka tersebut angka prima");
		}
		
		else {
			System.out.println("Angka tersebut bukan prima");
		}
	}
}

