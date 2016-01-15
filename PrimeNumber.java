/*
Name : Riksa Meidy Karim
Student ID : 1301142289
Class : IF-38-09

*/

import java.util.Scanner;

class PrimeNumber{
	static int countFactors(int a){
		int jum=0;
		for(int i=2;i<a;i++){
			if(a%i==0){jum++;}
		}
		return jum;	
	}
	static boolean isPrime(int bil){
		if(countFactors(bil)==0){return true;}
		else{return false;}
	}
	public static void main(String[] args){
	
	int bil1;
	System.out.print("Masukkan Bilangan integer: ");
	Scanner s = new Scanner(System.in);
	bil1 = s.nextInt();
	if(bil1>1){
	if(isPrime(bil1)==true){
		System.out.println(bil1 + "  Adalah Bilangan Prima");
	}
	else{
		System.out.println(bil1 + "  Bukan Bilangan Prima");
	}
	}

	else{
		System.out.println(bil1 + " Bukan Bilangan Prima");
	}
	}
	
}
