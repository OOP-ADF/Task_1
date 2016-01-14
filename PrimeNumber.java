//Erwin Yulizar F || 1301144031 || IF-38-01


import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan : ");
        int bilangan = input.nextInt();
        
        if (bilangan ==1 ){
            System.out.println("Bukan bilangan prima");
        }else if ((bilangan ==2) || (bilangan == 3) || (bilangan ==5) || (bilangan ==7)){
            System.out.println("Bilangan prima");
        }
        else if ((bilangan % 2 == 0) || (bilangan % 3 == 0) || (bilangan % 5 == 0) || (bilangan % 7==0)){
            System.out.println("Bukan Bilangan prima");
        } else{
            System.out.println("Bilangan prima");
        }
    }
}
