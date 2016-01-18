//Nama    : Aristya Wirawan
//NIM     : 1103134329
//Kelas   : IF-38-09

import java.util.Scanner;
public class IndexPoint{
	private static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String nama;
		double nUts, nUas, nQuiz, nAkhir;
		System.out.print("Masukkan Nama : ");
		nama = input.nextLine();
		System.out.print("Nilai UTS : ");
		nUts = input.nextDouble();
		System.out.print("Nilai UAS : ");
		nUas = input.nextDouble();
		System.out.print("Nilai Quiz : ");
		nQuiz = input.nextDouble();
		
		nAkhir = ((nUts*0.35)+(nUas*0.4)+(nQuiz*0.2));
		System.out.println("Nilai Akhir yang diperoleh : "+nAkhir);
		if (nAkhir<50){
			System.out.println("Grade : Failed");
		}else if(nAkhir<65){
			System.out.println("Grade : Accepted");
		}else if(nAkhir<75){
			System.out.println("Grade : Good");
		}else if(nAkhir<85){
			System.out.println("Grade : Very Good");
		}else{
			System.out.println("Grade : Excellent");
		}
		
	}
}