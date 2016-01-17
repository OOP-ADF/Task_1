
import java.util.Scanner;
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	System.out.println("CEK BILANGAN PRIMA");
		Scanner inputan = new Scanner (System.in);
		System.out.print("Masukan angka: ");
		int angka = inputan.nextInt();
		if (angka%2==1){
			System.out.println(angka+" adalah bilangan prima");
		} else {
			System.out.println(angka+" bukan bilangan prima");
		}
    }
    
}
