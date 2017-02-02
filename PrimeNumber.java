public class PrimeNumber {
		public static void main(String[] args) {
			System.out.print("Masukkan Angka: ");
			Scanner numb = new Scanner(System.in);
			int n = numb.nextInt();
			int counter = 0;
			for (int i=2; i<n; i++) {
				if(n % i==0){
					counter++;
				}
			}
			if(n>0 && counter == 0){
				System.out.println("Angka "+ n +" adalah bilangan prima.");
			}
			else {
				System.out.println("Angka "+ n +" bukan termasuk dalam bilangan prima.");
			}
		}
}

