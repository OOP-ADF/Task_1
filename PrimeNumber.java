/* Nama       : Serlii Ratmala Crusita
 * Nim        : 1301154474
 * Kelas      : IF 39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganprima;

import java.util.Scanner;

/**
 *
 * @author Serlii R. Crusita
 */
public class bilanganPrima {
	public static void main (String [] args){
		Scanner masukkan = new Scanner (System.in);
		System.out.println ("Masukkan Bilangan : ");
		int x = masukkan.nextInt ();
		int y = 0;
		for (int i=1; i<x; i++){
			if (x%i == 0){
				y = y+1;
			}
		}
		if (y==1){
			System.out.println ("Bilangan ini adalah bilangan Prima");
		}
		else{
			System.out.println ("Bilangan ini BUKAN bilangan prima");
		}
        }
}

