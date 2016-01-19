import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {               
        System.out.println("Program Bilangan Prima");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Input Bilangan : ");
        int bilangan = input.nextInt();
        int x = 0;
        for (int i = 1; i < bilangan; i++){
            if (bilangan % i == 0){
                x++;
            }
        }
        if (x == 1) {
            System.out.println(bilangan+" bilangan prima");
        }
        else {
            System.out.println(bilangan+" bukan bilangan prima");
        }
    }
}
