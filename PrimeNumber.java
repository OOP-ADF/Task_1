package primenumber;
import java.util.Scanner;
/**
 *
 * @author Andi Akhmad Fauzi
 */
 
/* Andi Akhmad Fauzi IF-38-09 1301144009 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inp;
		int x;
		int i;
		x=0;
		System.out.println("===PRIME NUMBER PROGRAM===");
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan bilangan: "); 
		inp = s.nextInt();
		
		for (i=1; i<=inp; i++) 
	    { if (inp % i==0)
				x=x+1;
		}
		
		if (x==2) 
			System.out.println("Bilangan tersebut merupakan bilangan prima");
		else if (x!=2)
			System.out.println("Bilangan tersebut bukan bilangan prima");
    
}
}