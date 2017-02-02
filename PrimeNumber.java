package bilangan.prima;
import java.util.Scanner;
public class BilanganPrima {

    public static void main(String[] args) {
        int a, b;
	int c=0;
        Scanner cin = new Scanner(System.in);
	System.out.print("Masukkan Angka : ");
	a=cin.nextInt();
	for (b=1 ; b<=a ; b++) {
		if (a % b == 0) {
                    c=c+1;
		}
	}
	if (c==2) {
		System.out.println(a+" merupakan Bilangan Prima");
	}
	else {
		System.out.println(a+" bukan Bilangan Prima");
        }   
    }
}