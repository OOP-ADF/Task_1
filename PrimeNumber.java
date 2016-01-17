/*
Name        : Pima Hani Safitri
Student ID  : 1301140202
Class       : IF-38-02
 */
package task1.prima;
import java.util.Scanner;
/**
 *
 * @author Pima Hani
 */
public class Task1Prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ang;
        System.out.print(" Inputkan angka : ");
        ang=input.nextInt();
        if ((ang==2)||(ang==3)||(ang==5)||(ang==7)){
            System.out.println(" Bilangan Prima ");
        }
        else if ((ang==1)||(ang<=0)){
            System.out.println(" Bukan Bilangan Prima ");
        }
        else if ((ang%2==0)||(ang%3==0)||(ang%5==0)||(ang%7==0)){
            System.out.println(" Bukan Bilangan Prima ");
        }
        else {
            System.out.println(" Bilangan Prima ");
        }
    }
    
}

