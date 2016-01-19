//Indriani Mentaruk 1301144121 IF-38-01

import java.util.Scanner;
public class IndexPoint {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int nilaiuts, nilaiuas, nilaikuis;
		double pointuts, pointuas, pointkuis, nilaiakhir;
		System.out.print("Nilai UTS: ");
		nilaiuts = input.nextInt();
		System.out.print("Nilai UAS: ");
		nilaiuas = input.nextInt();
		System.out.print("Nilai Tugas Mandiri : ");
		nilaikuis = input.nextInt();
		
		pointuts= nilaiuts*0.35;
		pointuas= nilaiuas*0.40;
		pointkuis= nilaikuis*0.25;
		nilaiakhir= pointuts+pointuas+pointkuis;
		System.out.println("Nilai Anda");
		System.out.println("Niali UTS : " +(int) nilaiuts);
		System.out.println("Niali UAS : " +(int) nilaiuas);
		System.out.println("Niali Kuis : " +(int) nilaikuis);
		System.out.println("Nilai Akhir :" +(int) nilaiakhir);
}
}

