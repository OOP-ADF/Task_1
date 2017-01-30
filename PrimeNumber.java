import java.util.Scanner;
/**
 * Hardiyan Ichsan Gunawan
 * 1301154138
 * IF-39-12
 * @author Harude
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int x,i,c;
        
        System.out.print("Input number: ");
        Scanner cin = new Scanner(System.in);
        x = cin.nextInt();
        c=0;
        for (i=x;i>=1;i--){
            if (x%i == 0){
                c++;
            }
        }
        if (c == 2){
            System.out.println(x+" is Prime Number");
        } else {
            System.out.println(x+" is not a Prime Number");
        }
    }
}
