//Anang Kurniawan 
//1301140192
//IF-38-02
import java.util.Scanner;


public class PrimeNumber {

    public static void main(String[] args) {
         int bil;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Sebuah Bilangan: ");
        bil = input.nextInt();
        int x = 1;
        int count = 0;
        while (x <= bil)
        {
            if (bil % x == 0)
            {
                count = count + 1;
            } 
            else 
            {
                count = count + 0;
            }
            x = x+1;
        }
        String hasil;
        if (count == 2)
        {
            hasil = "Bilangan Prima";
        }
        else
        {
            hasil = "Bukan Bilangan Prima";
        }
        
        System.out.println("Bilangan "+bil+" Adalah "+hasil);
    
    }
    
}
