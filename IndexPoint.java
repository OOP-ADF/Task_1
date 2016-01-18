// Agung Suhendar - 1301140279 - IF3809

public class IndexPoint {
	public static void main(String[] args) {
		int uts;
		int uas;
		int quiz;
		float total;
		Scanner n = new Scanner(System.in);
		
		System.out.println("Masukkan nilai uts : ");
		uts = n.next();
		System.out.println("Masukkan nilai uas : ");
		uas = n.next();
		System.out.println("Masukkan nilai quiz : ");
		quiz = n.next();
		
		total = ((35/100 * uts) + (40/100 * uas) + (25/100 * quiz));
		
		if ((total >= 85) && (total <= 100)) {
			System.out.println("excellent");
		}
		else if (total >= 75) {
			System.out.println("very good");
		}
		else if (total >= 65) {
			System.out.println("good");
		}
		else if (total >= 50) {
			System.out.println("accepted");
		}
		else if (total >= 0) {
			System.out.println("failed");
		}
	}
} 