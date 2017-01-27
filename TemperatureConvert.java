/**
* TemperatureConvert is a java program that ask user an input
* of number that represent a temperature and convert the number to another degrees form
*
* @author  Afnizar Nur Ghifari (1301152427) - IF3907
* @version 1.0
* @since   27-01-2017
*/

import java.util.Scanner;

public class TemperatureConvert {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p, x;
    float c, result;

    System.out.print("Input temperature (Celcius) : ");
    c = in.nextFloat();

    do {
      do {
        System.out.print("\nConvert to\n");
        System.out.print("1. Reamur\n");
        System.out.print("2. Fahrenheit\n");
        System.out.print("3. Kelvin\n");
        System.out.print("Choose menu : ");
        p = in.nextInt();
      } while(p != 1 && p != 2 && p != 3);

      switch(p) {
        case 1 :
          result = (float)(c * 4/5);
          System.out.println("\nCelcius to Reamur : "+result+"\n");
          break;
        case 2 :
          result = (float)(c * 9/5 + 32);
          System.out.println("\nCelcius to Fahrenheit : "+result+"\n");
          break;
        case 3 :
          result = (float)(c + 273.15);
          System.out.println("\nKelvin to Fahrenheit : "+result+"\n");
          break;
        default:
          break;
      }

      x = 0;
      while(x != 2 && x != 1) {
        System.out.println("Want to convert to another form? Type 1 if yes, Type 2 if no ");
        x = in.nextInt();
      }
    } while(x == 1);
  }
}
