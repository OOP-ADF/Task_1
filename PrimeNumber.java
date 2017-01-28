/*
* Diah Ajeng Dwi Yuniasih
* 1301154558
* IF-39-12
*/

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int n = input.nextInt();
		int c;
		
		c = 0;
		for (int i=1; i<=n; i++){
			if ((n % i) == 0) {
				c++;
			}
		}
		if (c == 2){
			System.out.println(n + " is prime number");
		}
		else{
			System.out.println(n + " is not prime number");
		}
	}
}