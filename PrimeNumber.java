// Name	: Gangsar Yoga Pamungkas
// NIM		: 1301154096
// Kelas	: IF-39-12
import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args) {
		int input ;
		int a,b;
		boolean prima;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan bilangan : ");
		input = scan.nextInt();

		for (a = 2; a < input; a++){
			prima = true;
			for(b = 2; b < a ; b++){
				if(a % b == 0)
				{
					prima = false;
					break;
				}
			}
			if(prima==true){
			System.out.println(a+" prima");
		}
		}
		}
		}
	