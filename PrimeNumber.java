//Stephanus Prasetyo 1301142033 IF-38-01
import java.util.Scanner;
public class BilanganPrima{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Input bilangan : ");
		int bilangan = input.nextInt();
		boolean prima = true;
		
		for (int i=2; i<bilangan; i++){
			if ((bilangan%i) == 0){
				prima = false;
				break;
			}
		}
		if (prima){
			System.out.println(bilangan+" merupakan bilangan prima");
		}
		else{
			System.out.println(bilangan+" bukan bilangan prima");
		}
			
	}
}
