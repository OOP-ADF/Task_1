package task_1;
import java.util.Scanner;
/**
 *
 * @author Andre Anugrah
 */
public class PrimeNumber 
{
    public static void main(String[] args)
    {
        //input
        Scanner inp = new Scanner (System.in);
        System.out.println("Input angka : ");
        int x = inp.nextInt();
        
        //program
        int count = 0;
	for (int i = 1; i <= x; i++){
		if (x % i == 0){
			count = count + 1;
		}
	}
        
        //output
        if (count == 2)
		System.out.println("Bilangan prima");
	else
		System.out.println("Bukan prima");	 
    }
}
