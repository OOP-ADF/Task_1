
import java.util .Scanner;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j=0;
        
        
        Scanner scan= new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int num=scan.nextInt();
       
        for(i = 1;i<=num;i++) {
            if (num % i == 0){
                j++;
            }
        }    
        if (j==2){
            System.out.println("bilangan prima");
        }
        else
            System.out.println("bukan bilangan prima");
        
    }
}