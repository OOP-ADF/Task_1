package primenumber;
import java.util.Scanner;
/**
 *
 * @author  Ressa Firmansyah Fatah
 *          1301154105
 *          IF-39-07
 */
public class PrimeNumber {
    public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Masukkan angka : ");
	int x = input.nextInt();	
	int count = 0;
	for (int i = 1; i <= x; i++){
		if (x % i == 0){
			count = count+1;
		}
	}
			
	if (count == 2){
		System.out.println("Bilangan prima");
	}
	else{
		System.out.println("Bukan prima");
	}
    } 
}