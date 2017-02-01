/* Nama  	: Fadhlillah	
 * NIM 		: 1301154110
 * Kelas 	: IF 39-12
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author Fadhlillah
 */
public class temperature {
		public static void main (String[]args){
			Scanner celcius=new Scanner(System.in);
			System.out.println("Masukkan Suhu Dalam Celcius : ");
			int c=celcius.nextInt();
			System.out.println("1. Reamur ");
			System.out.println("2. Fahrenheit ");
			System.out.println("3. Kelvin ");
			Scanner input=new Scanner(System.in);
			System.out.println("Diubah dalam : ");
			int i=input.nextInt();
				int suhu;
				switch (i){
					case 1 :
						suhu=c*4/5;
						System.out.println(suhu+" Reamur");
						break;
					case 2 : 
						suhu=(c*9/5)+32;
						System.out.println(suhu+" Fahrenheit");
						break;
					case 3 :
						suhu=c+273;
						System.out.println(suhu+" Kelvin");
						break;
                    default : 
                         System.out.println("Pilihan Yang Anda Masukkan Salah");
                                }
                }
}