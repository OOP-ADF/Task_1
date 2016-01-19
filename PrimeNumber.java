/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//ATIKA WAHYUGIRINI -1301144211
package primenumberr;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class PrimeNumberr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner inp=new Scanner(System.in);
      System.out.print("Masukkan bilangan : ");
      int bil=inp.nextInt();
      int p=0;
      
      for (int i=1;i<=bil;i++) 
      {
	if(bil%i==0)
	p=p+1;
      }
			
      if(p == 2)
        {
            System.out.println(bil + " adalah bilangan Prima");
	}
    else
	{
	   System.out.println(bil + " bukan bilangan Prima");
			}
      
      
    }
    
}

