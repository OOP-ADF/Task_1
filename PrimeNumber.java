//Name 			: Mohammad Zakie Faiz Rahiemy
//Student ID 	: 1301144422
//Class			: IF-38-02

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
		int number,prime=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = input.nextInt();
		for(int i=1;i<=number;i++){
			if (number%i==0){
				prime++;
			}
		}
		if (prime==2){
			System.out.print("The number is a prime number");
		}else{
			System.out.print("The number is not a prime number");
		}
	}
}