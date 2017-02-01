import java.util.Scanner;

/**
 *
 * @author Adli Rachman
 */
public class PrimeNumber {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World");
        int bilangan;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        bilangan = in.nextInt();
        if (bilangan != 1 | bilangan == 2 && bilangan % 2 == 1){
            System.out.println(+bilangan+ " adalah bilangan prima");
        }
        else if (bilangan % 2 == 0){
            System.out.println(+bilangan+ " Bukan bilangan prima");
        }
    }
    
}