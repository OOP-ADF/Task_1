public class IndexPoint {
	public static void main(String[] args) {
		System.out.println("Masukkan Nilai anda: ");
		Scanner score = new Scanner(System.in);
		System.out.println("Nilai UTS: ");
		int scoreUTS = score.nextInt();
		System.out.println("Nilai UAS: ");
		int scoreUAS = score.nextInt();
		System.out.println("Nilai kuis: ");
		int scoreKuis = score.nextInt();
		
		double scoreAkhir = ((scoreUTS*0.35)+(scoreUAS*0.4)+(scoreKuis*0.25));
		
		if(scoreAkhir >= 85 && scoreAkhir <= 100) {
			System.out.println("Nilai akhir= "+ scoreAkhir);
			System.out.println("Grade= Excellent");
		}
		else if(scoreAkhir >=75 && scoreAkhir <= 84) {
			System.out.println("Nilai akhir= "+ scoreAkhir);
			System.out.println("Grade= Very Good");
		}
		else if(scoreAkhir >=65 && scoreAkhir <= 74) {
			System.out.println("Nilai akhir= "+ scoreAkhir);
			System.out.println("Grade= Good");
		}
		else if(scoreAkhir >=50 && scoreAkhir <= 64) {
			System.out.println("Nilai akhir= "+ scoreAkhir);
			System.out.println("Grade= Accepted");
		}
		else if(scoreAkhir >= 0 && scoreAkhir <= 49) {
			System.out.println("Nilai akhir= "+ scoreAkhir);
			System.out.println("Grade= Failed");
		}
	}
}
