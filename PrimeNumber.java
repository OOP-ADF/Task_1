/*
Nama	: Zardarian Ahadika N.
NIM		: 1301140112
Kelas	: IF-38-02
*/

package task_1primenumber;
import java.util.Scanner;
/**
 *
 * @author Zardarian
 */
public class Task_1PrimeNumber {

    public static boolean prima(int number) {
        for (int pembagi = 2; pembagi <= number/2; pembagi++){
            if (number % pembagi == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan Angka : ");
        angka = input.nextInt();
        if ((angka==1)||(angka==0)){
            System.out.println("Angka 1 adalah bukan bilangan prima");
        }
        else if (prima(angka)==true) {
            System.out.println("Angka "+angka+" adalah bilangan prima");
        }
        else {
            System.out.println("Angka "+angka+" adalah bukan bilangan prima");
        }
    }   
}
