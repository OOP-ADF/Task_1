//Elvaretta_1301154446_IF3912

public class indexpoint_1301154446
{
	public static void main (String) [] args)
	{
		int x;
		int a,b,c,d;
		
		System.out.println("Masukkan Nilai: "); 
			Scanner x = new Scanner(System.in);
  
		System.out.println("Nilai UTS : "); 
			int a = x.nextInt(); 
		System.out.println("Nilai UAS : "); 
			int b = x.nextInt(); 
		System.out.println("Nilai Kuis : "); 
			int c = x.nextInt(); 
   
		  double d = ((a*0.35)+(b*0.4)+(scoreKuis*0.25)); 
		   
		if(d >= 85 && d <= 100) { 
			System.out.println("Nilai akhir : "+ d); 
			System.out.println("Grade : Execellent"); 
		} 
  
		else if(d >=75 && d <= 84) { 
			System.out.println("Nilai akhir : "+ d); 
			System.out.println("Grade : Very Good"); 
		} 
		
		else if(d >=65 && d <= 74) { 
			System.out.println("Nilai akhir : "+ d); 
			System.out.println("Grade : Good"); 
		} 
		
		else if(d >=50 && d <= 64) { 
			System.out.println("Nilai akhir : "+ d); 
			System.out.println("Grade : Accepted"); 
		} 
		
		else if(d >= 0 && d <= 49) { 
			System.out.println("Nilai akhir : "+ d); 
			System.out.println("Grade : Failed"); 
		} 
	} 
}