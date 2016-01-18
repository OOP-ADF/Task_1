import java.util.Scanner; 
public class PrimeNumber {
	//Hirianinda Malsegianty S.
	//1301140262
	//IF - 38 - 02
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner masukan = new Scanner (System.in);  
System.out.println("Masukan sebuah angka :");  
int bil = masukan.nextInt();  
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
