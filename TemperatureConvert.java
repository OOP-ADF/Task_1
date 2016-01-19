/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 // atika wahyugirini/1301144211/if3801
package temperatureconvert;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner celcius= new Scanner(System.in);
        Scanner plh= new Scanner(System.in);
        System.out.println("Masukkan suhu dalam celcius: ");
        int c=celcius.nextInt();
        System.out.println("   --Konversi suhu-- ");
        System.out.println("1.kelvin ");
        System.out.println("2. reamur ");
        System.out.println("3. fahrenheit");
        System.out.print("Pilih konversi suhu: ");
        int p=plh.nextInt();
        switch (p) 
        {
            case 1 :
            {
                double k=(c+273);
                System.out.println("Suhunya menjadi "+k+" derajat kelvin");
                break;
                
            }
            
            case 2:
            {
                double r=(4/5 * c);
                System.out.println("Suhunya menjadi "+r+" derajat reamur");
                break;
            }
            
            case 3:
            {
                double f=((c*9/5)+32);
                System.out.println("Suhunya menjadi "+f+" derajat fahrenheit");
                break;
                
            }
    
        }
    }
}
