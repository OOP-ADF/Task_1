//Sylvia Dwi Anggraini
//1301154469
//if-39-07

package primenumber;
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();
        int i;
        boolean bilprima = true;
        
        for(i=2 ; i<angka ; i++){
            if((angka % i) == 0){
                bilprima = false;
            }
        }
        if(bilprima)
            System.out.println(angka+"adalah bilangan prima.");
        
        else
            System.out.println(angka+"bukan bilangan prima");
        
    }
}
