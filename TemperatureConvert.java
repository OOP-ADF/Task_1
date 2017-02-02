package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

  
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
int c;
float r,f,k;
System.out.print(" Masukan suhu (Celcius): ");

c = input.nextInt();
r = 4f/5f*c;
f = 9f/5f*c+32f;

k = c +273;
System.out.println("Hasil Konvert");
System.out.println("reamur :" +r);
System.out.println("fahrenhait :" + f);
System.out.println("kelvin :" +k);
    }
    
}
