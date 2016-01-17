//Raja Ryan Pradana 
//IF-38-02
//1301140302

import java.util.Scanner;
public class PrimeNumber {   
public static void main(String[] args) {  

Scanner bil = new Scanner (System.in);  
System.out.print("Masukan bilangan : ");  

int bilangan = bil.nextInt();  
int i = 1;
int b = 0;

while (i <= bilangan){
    if ((bilangan % i) == 0) {
    b=b+1;
    }
    i=i+1;
}
if (b==2) {
    System.out.println(bilangan + " adalah bilangan prima");
}
else{
    System.out.println(bilangan + " bukan bilangan prima");
}
}
}