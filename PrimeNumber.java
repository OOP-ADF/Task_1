import java.util.Scanner;
/*
Hizas Sabilal Rasyad
1301140251
IF3801
*/.
public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int angka;
        System.out.print("Enter a number : ");
        angka = cin.nextInt();
        boolean prima;        
        prima = false;
        int x = 0;
        for(int y = 1; y <= angka; y++)
        {
            if(angka%y == 0) x++;
        }
        if(x == 2) prima = true;
        
        if(prima) System.out.println(angka + " is a Prime Number!");
        else System.out.println(angka + " is not a Prime Number.");
    }
}
