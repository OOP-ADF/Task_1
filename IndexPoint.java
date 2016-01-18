public class indexpoint {
	public static void main (String [] args){
		int uts;
		int uas;
		int kuis;
		double total;
		Scanner box = new Scanner(System.in);
		
		System.out.print("UTS : ");
		uts = box.nextInt();
		System.out.print("UAS : ");
		uas = box.nextInt();
		System.out.print("Quiz : ");
		kuis = box.nextInt();
		
		System.out.println("");
		total = ((0.35 * uts) + (0.4 * uas) + (0.25 * quiz));
		System.out.print("Total Nilai: " + total);
		System.out.println("");
		
		if (total >= 85)
		{
			System.out.println("Excellent");
		}
		else if ((total >= 75) && (total < 85))
		{
			System.out.println("Very Good");
		}
		else if ((total >= 65) && (total < 75))
		{
			System.out.println("Good");
		}
		else if ((total >= 50) && (total < 65))
		{
			System.out.println("Accepted");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
