// NAMA : DZAKYTA AFUZAGANI
// NIM	: 1301140122
// KELAS: IF 38 02

import java.util.Scanner;
public class IndexPoint{
	public static void main(String[] args){
		double nilai,uts,uas,quis,akhir;
		Scanner input=new Scanner(System.in);
		System.out.print("Nilai UTS : ");
		uts=input.nextDouble();
		System.out.print("Nilai UAS : ");
		uas=input.nextDouble();
		System.out.print("Nilai Quiz : ");
		quis=input.nextDouble();
		akhir=(uts*0.35+uas*0.45+quis*0.25);
		if (akhir >= 85 ){
			System.out.print(" EXCELLENT ");
		}
		else if (akhir >= 75 ){
			System.out.print(" VERY GOOD ");
		}
		else if (akhir >= 65 ) {
			System.out.print(" GOOD ");
		}
		else if (akhir >= 50 ) {
			System.out.print(" ACCEPTED ");
		}
		else if (akhir <= 49 ) {
			System.out.print(" FAILED ");
		}
		else{
			System.out.print(" ERROR ");
		}
		
	}
}