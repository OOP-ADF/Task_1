import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		int angka,count;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number : ");
		angka= input.nextInt();
		count=0;
		for(int i=1;i<=angka;i++) {
			if (angka%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.print(angka+" is a prime number");
		} else {
			System.out.print(angka+" is not a prime number");
		}
	}
}
