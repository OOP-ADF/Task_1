/*
Nama 	: Muhammad Zakaria Musa
NIM 	: 1103130047
Kelas	: IF-39-07
*/
import java.util.Scanner;
public class PrimeNumber{
	public static String cekPrime(int num){
			if(num==2){
				return "adalah";
			}
			for(int i = 3;i < num; i+=2){
				if(num%i == 0){
					return "bukan";
				}
			}
			return "adalah";
		}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Inputkan bilangan yang akan di cek  : ");
		int num = in.nextInt();
		String hasil = cekPrime(num);
		System.out.println("Angka "+num+" "+hasil+" bilangan prima");
	}

}
