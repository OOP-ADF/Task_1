/*
 Muhammad Arif Kurniawan
 1301144091
 IF-38-01
*/
package task_1;

import java.util.Scanner;

/**
 *
 * @author Kurniawan
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int a;  
	int i = 2;  	  
	Scanner input = new Scanner(System.in);  
	System.out.println("Masukkan angka: ");  
        a = input.nextInt();  	  
	boolean p = true;  	  
	while (i < a)  
	{  
            if (a % i == 0)  
            {   	
                p = false;  
		break;  
            }  
            i++;  
	}  	  
	if (p)  
            System.out.println("Bilangan " + a + " adalah Bilangan Prima ");  
	else   	
            System.out.println("Bilangan " + a + " bukan Bilangan Prima ");  
    }  
}
