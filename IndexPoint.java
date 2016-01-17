/*
Nama    : Zardarian Ahadika N.
NIM     : 1301140112
Kelas   : IF-38-02
*/
package task_1indexpoints;
import java.util.Scanner;
/**
 *
 * @author Zardarian
 */
public class Task_1IndexPoints {

    public static void main(String[] args) {
        Scanner inpututs = new Scanner(System.in);
        Scanner inputuas = new Scanner(System.in);
        Scanner inputquiz = new Scanner(System.in);
        int nilai;
        int uas;
        int uts;
        int quiz;
        System.out.println("Masukkan nilai UTS : ");
        uts = inpututs.nextInt();
        System.out.println("Masukkan nilai UAS : ");
        uas = inputuas.nextInt();
        System.out.println("Masukkan nilai Quiz : ");
        quiz = inputquiz.nextInt();
        nilai=(uts*35/100)+(uas*40/100)+(quiz*25/100);
        if ((nilai>=0)&&(nilai<=49)){
            System.out.println(nilai+" Failed");
        }
        else if ((nilai>49)&&(nilai<=64)){
            System.out.println(nilai+" Accepted");
        }
        else if ((nilai>64)&&(nilai<=74)){
            System.out.println(nilai+" Good");
        }
        else if ((nilai>74)&&(nilai<=84)){
            System.out.println(nilai+" Very good");
        }
        else if ((nilai>84)&&(nilai<=100)){
            System.out.println(nilai+" Excellent");
        }
        else {
            System.out.println("Angka tidak sesuai")
        }
    }
}
