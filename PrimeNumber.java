import java.util.Scanner;
public class PrimeNumber {   
public static void main(String[] args) {  

Scanner input = new Scanner (System.in);  
System.out.print("Masukan Angka :");  

int bil = input.nextInt();  
boolean prima = true;  

for (int i=2; i<bil; i++){        
	if ((bil % i) == 0) {  
		prima = false; break; }}  
if (prima)    
	System.out.print(bil+" Merupakan Bilangan PRIMA ");    
else  
	System.out.print(bil+" Bukan bilangan PRIMA ");  
    }  
}  