// Reza Aryadi - 1301144179 - IF3809
 
import java.util.Scanner;

public class TemperatureConvert {
 	public static void main(String[] args) {
 		System.out.println("========= KONVERSI SUHU ======== ");
		System.out.println("1.Rearmur");
 		System.out.println("2.Farenheit");
 		System.out.println("3.Kelvin");
 		int c;
 		int g;
 		Scanner n = new Scanner(System.in);
 		
		System.out.print("Masukkan pilihan : ");
		g = n.nextInt();
		System.out.print("Masukkan derajat celcius : ");
		c = n.nextInt();
 		switch (g) {
			
			case 1 : System.out.println(c*(4/5) + " derajat Reamur");
 				break;
			
			case 2 : System.out.println((c*(9/5))+32 + " derajat Farenheit");
 				break;
			
			case 3 : System.out.println(c + 273 + " derajat Kelvin");
 				break;
 		}
 	}
}