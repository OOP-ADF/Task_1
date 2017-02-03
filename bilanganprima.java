/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganprima;

/**
 *
 * @author Rendy
 */
import java.util.Scanner;

public class bilanganprima {
  
  public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  System.out.print("Masukan Bilangan : ");
  int bilangan = input.nextInt();

boolean prime = true;
for (int i=2; i<bilangan; i++){
    
if ((bilangan % i) == 0) {

prime = false; break;

    }
}
 if (prime)

System.out.println(bilangan + " merupakan bilangan Prima ");

else

System.out.println(bilangan + " tidak bilangan Prima ");
    }
}