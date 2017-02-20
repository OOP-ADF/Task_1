
package task3;

import java.util.Scanner;

/**
 *
 * @author RakaSetya
 */

    public class Task3 {
        public static void main(String[] args) 
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan suhu celcius: ");
            int celcius = input.nextInt();
            int suhureamur = celcius*4/5;
            int suhufahrenheit = celcius*9/5+32;
            int suhukelvin = celcius+273;
            int menu = 1;
            while (menu>0)
            {
                
            System.out.println("Menu convert");
            System.out.println("1. Reamur");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("0. Exit");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();
            switch (menu)
            {
                  case 1: 
                    System.out.println(suhureamur);
                     break;
                     
                  case 2:
                    System.out.println(suhufahrenheit);
                    break;
                    
                  case 3:
                    System.out.println(suhukelvin);
                    break;
                    
            }
        }
     
  }
 }

