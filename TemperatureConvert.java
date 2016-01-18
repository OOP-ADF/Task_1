//Dhiva Azhara 1301144101 IF3801

package temperaturconverter;

import java.util.Scanner;

/**
 *
 * @author dhivazhr
 */
public class TemperaturConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int celcius, pilih;
        double fah, kel, ream;
        
        System.out.print("Masukkan suhu dalam celcius: ");
        Scanner input1 = new Scanner(System.in);
        celcius = input1.nextInt();
        
        do{
        System.out.println("Convert celcius ke: ");
        System.out.println("1. Fahrenheit ");
        System.out.println("2. Kelvin ");
        System.out.println("3. Reamur ");
        System.out.println("4. Exit ");
        
        System.out.print("Pilihan: ");
        Scanner input2 = new Scanner(System.in);
        pilih = input2.nextInt();
        
        switch(pilih){
            case 1:
            {
                fah = ((celcius*9/5)+32);
                System.out.println("Hasilnya: " +fah+ " Fahrenheit");
                System.out.println();
                break;
            }
            case 2:
            {
                kel=(celcius+273);
                System.out.println("Hasilnya:  " +kel+ " Kelvin");
                System.out.println();
                break;
            }
            case 3:
            {
                ream=(celcius*4/5);
                System.out.println("Hasilnya: " +ream+ " Reamur");
                System.out.println();
                break;
            } 
        }
    }
    while(pilih<4);
    }
}
