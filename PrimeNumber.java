import java.util.Scanner;

public class PrimeNumber {

/*
* Created by 
* Name       : Dede Kiswanto
* Student ID : 1301140171
* Class      : IF-38-01
*/

    public static void main(String[] args){
	System.out.println("Prime Number Exercise");
	System.out.print("Input Number : ");
        
        // Create an Integer Scanner & Input a number into a variable
        Scanner varScan = new Scanner(System.in);
        int inputNum = varScan.nextInt();        
        varScan.close();
        
        boolean primeCheck = true;
        
        if(inputNum < 2) // Negative isn't Prime Number, and 1 is Special Number
            primeCheck = false;
        else {
            for (int i = 2; i < inputNum; i++) {
                // Condition if input divisible from 2 until (inputNum-1)
                if(inputNum % i == 0){
                    primeCheck = false;
                    break;  
                }
            }
        }
        
        if(primeCheck)
            System.out.println("Its Prime Number!!");
        else
            System.out.println("Its NOT Prime Number!!");
        
        /* Test Case
        * Negative : Not Prime Number
        * 0 : Not Prime Number
        * 1 : Not Prime Number
        * 2 : Prime Number
        * 3 : Prime Number
        * 4 : Not Prime Number
        * 19 : Prime Number        
        */
    }
}