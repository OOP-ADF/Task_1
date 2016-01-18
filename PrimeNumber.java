 // Reza Aryadi - 1301144179 - IF3809
 
 import java.util.Scanner;
 
 public class PrimeNumber {
 	public static void main(String[] args) {
 		int bilanganUser;
 		int cek=1;
 		Scanner n = new Scanner(System.in);
		System.out.print("Masukkan nilai : ");
		bilanganUser = n.nextInt();
 		for (int i=2; i<bilanganUser; i++) {
 			if (bilanganUser%i==0) {
 				cek = 0;
 			}
 		}
 		if (cek==1) {
 			System.out.println("bilangan prima");
 		}
 		else {
 			System.out.println("bukan bilangan prima");
 		}
 	}
 }