//Elvaretta_1301154446_IF3912

public class primenumber_1301154446 
{ 
	public static void main(String[] args) 
	{ 
		int x, i, n, counter;
		
		System.out.print("Masukkan Bilangan : "); 
		Scanner x = new Scanner(System.in); 
		
		int n = x.nextInt(); 
		int counter = 0; 
   
	for (int i = 2; i < n; i++) { 
		if(n % i == 0){ 
			counter++; 
		} 
   
		if(n > 0 && counter == 0){ 
			System.out.println("Bilangan "+ n +" adalah bilangan prima."); 
		} 
	
		else { 
			System.out.println("Bilangan "+ n +" bukan bilangan prima."); 
		} 
	}
	}	
}
