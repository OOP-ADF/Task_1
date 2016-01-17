//Syahrizal Hafid Rozaqi - IF3802 - 1301144252
import java.util.Scanner;
public class PrimeNumber {   
public static void main(String[] args) {  

Scanner input = new Scanner (System.in);  
System.out.print("Masukan bilangan :");  

int bil = input.nextInt();  
int i = 1;
int b = 0;

    while (i <= bil) {        
        if ((bil % i) == 0) {
            b=b+1;
        }
        i=i+1;
    }

if (b==2)    
	System.out.println(bil + " adalah bilangan PRIMA ");    
else  
	System.out.println(bil + " adalah bukan bilangan PRIMA ");  
    }  
<<<<<<< HEAD
}  
=======
} 
>>>>>>> origin/master
