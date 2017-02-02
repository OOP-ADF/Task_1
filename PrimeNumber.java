/*
/* Azahra Kartika-1301154460-IF-39-12
package primernumber;

/**
 *
 * @author Acer
 */
import java.util.Scanner;

public class PrimerNumber {
    public static void main(String[] args) {
    
    Scanner cin = new Scanner(System.in);
    System.out.print("Masukkan Angka = ");
    int bil = cin.nextInt();
    int n =0;
    for (int i=1; i<= bil; i++)
    {
        if((bil % i) == 0)
        {
            n++;
        }
    }
    if(n == 2)
    {
        System.out.println("Angka adalah bilangan prima");
    }
    else{
        System.out.println("Angka bukan bilangan prima");
    }
}
}

