//Elsa Alifah Wijaya 1301144021 IF3801
package primenumber;
import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		int angka;
		int prima = 1;
		Scanner input  = new Scanner (System.in);
		System.out.print("Masukkan angka: ");
		angka=input.nextInt();
		for(int b =2;b<angka;b++){
			if((angka%b)==0{
				prima=0;
				break;
			}
		}
		if (prima==1){
			System.out.println(angka+" adalah bilangan prima");
		}
		else{
			System.out.println(angka+" adalah bilangan bukan prima");
		}
	}
}
