//Firda Aminy Ma'ruf 1301144311 IF3801
package temperatureconverter;

import java.util.Scanner;

/**
 *
 * @author Iwan Ma'ruf
 */
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner celcius=new Scanner(System.in);
        Scanner pilihan=new Scanner(System.in);
        System.out.print("Please enter the Celcius degree: ");
        int cel=celcius.nextInt();
        System.out.println("Convert the Celcius into: ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Reamur");
        System.out.println("3. Kelvin");
        System.out.print("Enter the menu number that you choose: ");
        int pil=pilihan.nextInt();
        switch(pil) {
            case 1:
            {
                double fah=((cel*9/5)+32);
                System.out.println("The result of the convert is " +fah+ " Fahrenheit");
                break;
            }
            case 2:
            {
                double rea=(cel*4/5);
                System.out.println("The result of the convert is " +rea+ " Reamur");
                break;
            }
            case 3:
            {
                double kel=(cel+273);
                System.out.println("The result of the convert is " +kel+ " Kelvin");
                break;
            }
            default:
                throw new AssertionError();
        }
    }
}
