public class PrimeNumber {
	public static void main (String[] args) {
		int angka;
		boolean prima= false;
		if (angka >=2) {
			prima=true;
			for (int a=2; a < angka; a++) {
				if (angka % a==0) {
					prima = false;
					break;
				}
			}
		}
		System.out.println((prima==true?angka+" adalah bilangan prima":angka+" bukan termasuk bilangan prima"));
	}
}