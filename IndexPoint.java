/*
Nama 	: Muhammad Zakaria Musa
NIM 	: 1103130047
Kelas	: IF-39-07
*/
import java.util.Scanner;
public class IndexPoint{
	public static double hitungNilai(int uts, int uas, int quis){
		double total = (uts*0.35)+(uas*0.40)+(quis*0.25);
		return total;
	}
	public static String cekNilai(int uts, int uas, int quis){
		double total = hitungNilai(uts,uas,quis);
		if(total > 84){
			return "excellent";
		}if(total > 74){
			return "very good";
		}if(total > 64){
			return "good";
		}if(total > 49){
			return "accepted";
		}return "failed";
		}
	public static void main(String[] args){
		System.out.println("Inputkan Nilai dengan bilangan bulat!!! ");
		Scanner in = new Scanner(System.in);
		System.out.print("Inputkan Nilai UTS  : ");
		int uts = in.nextInt();
		System.out.print("Inputkan Nilai UAS  : ");
		int uas = in.nextInt();
		System.out.print("Inputkan Nilai Quis  : ");
		int quis = in.nextInt();
		double total = hitungNilai(uts,uas,quis);
		String hasil = cekNilai(uts, uas ,quis);
		System.out.println("Nilai anda adalah "+total+" dengan grade "+hasil);
	}

}

