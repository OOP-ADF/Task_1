//Indriani Mentaruk 1301144121 IF-38-01

import java.util.Scanner;
public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Angka : ");
		int x = input.nextInt();
		boolean prime = true;
		for (int i = 2; i < x; i++){
			if (x % i == 0){
				prime = false; break;
			}
		}
		if (prime)
		System.out.println(x + "Bukan Bilangan Prima");
		}
		else 
			System.out.println(x + "Adalah Bilangan Prima");
		}
    
	}
