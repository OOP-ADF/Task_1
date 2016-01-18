/* 
Sulistiyo Tri Raharjo 
1301144329
IF-38-09
*/



public class IndexPoint {
	public static void main (String [] args){
		int uts;
		int uas;
		int kuis;
		double nilai;
		
		Scanner innilai = new Scanner(System.in);
		
		System.out.print("Nilai UTS : ");
		uts = innilai.nextInt();
		System.out.print("Nilai UAS : ");
		uas = innilai.nextInt();
		System.out.print("Nilai Kuis : ");
		kuis = innilai.nextInt();
		
		System.out.println("");
		nilai = ((0.35 * uts) + (0.4 * uas) + (0.25 * kuis));
		System.out.print("Nilai Akhir : " + nilai);
		System.out.println("");
		
		if (nilai >= 85)
		{
			System.out.println("Peringkat : Excellent");
		}
		else if ((nilai >= 75) && (nilai < 85))
		{
			System.out.println("Peringkat : Very Good");
		}
		else if ((nilai >= 65) && (nilai < 75))
		{
			System.out.println("Peringkat : Good");
		}
		else if ((nilai >= 50) && (nilai < 65))
		{
			System.out.println("Peringkat : Accepted");
		}
		else
		{
			System.out.println("Peringkat : Failed");
		}
	}
}
