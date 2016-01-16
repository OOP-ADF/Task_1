	/* 
Nama  : Muchamad Fuad
NIM   : 1301140272
Kelas : IF-38-02
*/
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int angka,hasil,counter;
		
		System.out.println("Program Mengecek Bilangan Prima");
		System.out.print("Masukkan Angka : ");
		angka = input.nextInt();
		
		counter = 1;
		do{
			counter = counter +1;
			hasil = angka%counter;
		} while(hasil == 0);
		
		if (counter >= angka){
			System.out.print("Bilangan Prima");
		}
		else
			System.out.print("Bukan Bilangan Prima");
	}
}