import java.util.Scanner;

public class PrimeNumber {
	/**
	*program java menentukan bilangan prima
	*oleh I Putu Prima Ananda IF-38-01 1301144291
	*/
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a;
		int prima = 1;
		
		System.out.print("Masukan bilangan : ");
		a = input.nextInt();
		
		for (int b = 2; b<a; b++){
			if ((a%b)==0){
				prima = 0;
				break;
			}
		}
		
		if (prima == 1){
			System.out.println(a+" merupakan bilangan prima");
		}
		else{
			System.out.println(a+" bukan merupakan bilangan prima");
		}
	}
}
