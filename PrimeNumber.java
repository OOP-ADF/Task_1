/* Nama: Dainty Amanda
Nim: 13011440062
Kelas: IF-38-02*/

package PrimeNumber;
//import utilitas java yaitu scanner untuk memasukkan data
import java.util.Scanner;


public class PrimeNumher {
	

	public static void main (String[] args) {
		//membuat scanner baru
		Scanner masukan = new Scanner (System.in);
		System.out.print ("=== PRIME NUMBER ===")
		//memasukkan nilai bilangan
		System.out.print ("Masukan Sebuah Bilangan : ");
		//membuat variabel untuk menampung nilai bilangan
		int bil = masukan.nextInt();
		//membuat variabel untuk menampung nilai prima
		boolean prima = true;
		for (int i=2; i<bil; i++) {

			//pengondisian dan memunculkan nilai prima	
			if ((bil % i) == 0) {

				prima = false; break;
			}
		}
		if (prima)
		System.out.println(bil + " adalah bilangan PRIMA");
		else
		System.out.println (bil + " adalah bukan bilangan PRIMA");
	}	
}



