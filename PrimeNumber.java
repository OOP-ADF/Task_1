DANIA MEGA PURI MARTA
1301144322
IF 38 02

import java.util.Scanner;
public class BilPrim {
	public static void main (String[]args) {
		int a,hitung=0;
		Scanner input_user = new Scanner (System.in);
		
		System.out.print ("Masukkan sebuah angka : ");
		a = input_user.nextInt();
		for (int i=1;i<=a;i++) {
			if (a % i == 0) {
				hitung++;
			}
		}
		if (hitung == 2) {
			System.out.println(a+" adalah bilangan prima");
		}
		else {
			System.out.println(a+" bukan bilangan prima");
		}
	}
}
