/*write a java program that ask user an input of integer and 
determine whether the number is prime or not
write the output*/

package primenumber;

import java.util.Scanner;

/**
 *
 * @author Aldika W
 */
public class PrimeNumber {
    static int bbukti, counter ,inputan;
    static Scanner masukkan = new Scanner(System.in);
    
    public void primenumber(int n)
    {
        counter = 0;
        for(bbukti = 1; bbukti<=n ; bbukti++)
        {
            if(n%bbukti==0)
                counter++;
        }
       
    if(counter==2)
    System.out.println("Bilangan Prima");
    else
    System.out.println("Bukan Bilangan Prima");
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        PrimeNumber PN = new PrimeNumber();
        System.out.println("============Program Uji Bilangan Prima=============");
        System.out.println("===================================================");
        System.out.print("Silakan Inpun Bilangan yang ingin diuji: ");
        inputan = masukkan.nextInt();
        PN.primenumber(inputan);
        
    }
    
}

