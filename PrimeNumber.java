/* Thoriq Abdul Aziz Muqodas
	1301144341
	IF-38-01
*/
import java.util.Scanner;
public class PrimeNumber{
	
	public static void main(String[]args){
		Scanner check = new  Scanner(System.in);
		System.out.print("Masukan Angka : ");
		int x = check.nextInt();
		int j = 0;
		for(int i=2;i<x;i++){
			if(x%i==0){
				j++;
			}
		}
		if(j==0){
			System.out.println(x+" adalah bilangan Prima");
		}
		else{System.out.println(x+" bukan bilangan Prima");}
	}
}
