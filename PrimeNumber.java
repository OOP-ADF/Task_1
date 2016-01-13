//Syahrizal Hafid Rozaqi - IF3802 - 1301144252
import java.util.Scanner;
public class PrimeNumber {   
public static void main(String[] args) {  

Scanner input = new Scanner (System.in);  
System.out.println("Masukan bilangan :");  

int bil = input.nextInt();  
boolean prima = true;  

for (int i=2; i<bil; i++){        
	if ((bil % i) == 0) {  
		prima = false; break;  
  
    }  
}  

if (prima)    
	System.out.println(bil + " adalah bilangan PRIMA ");    
else  
	System.out.println(bil + " adalah bukan bilangan PRIMA ");  
    }  
}  