/* Nindia Cahyaning Putri IF 3907 1301154567 */
package temperatureconvert;
import java.util.Scanner;
public class TemperatureConvert {

    
    public static void main(String[] args) {
        Scanner masukan = new Scanner  (System.in);
        double c, r = 0, f, k, celcius, reamur, fahrenheit, kelvin;
        
        System.out.println("Temperature Convert");
        System.out.println("1. Reamur");
        System.out.println("2. Celcius");
        System.out.println("3. Fahrenheit");
        System.out.print("Pilih = ");
        int x = masukan.nextInt();
        
        switch (x) {
            case 1:
                System.out.print("Masukkan Suhu dalam Reamur = ");
                r = masukan.nextDouble();
                celcius = (1.25*r);
                fahrenheit = (2.25*r+32);
                kelvin = (celcius + 273);
                System.out.println("Reamur = " +celcius);
                System.out.println("Fahrenheit = " +fahrenheit);
                System.out.println("Kelvin = "+kelvin);
                break;
                
            case 2:
                System.out.print("Masukkan Suhu dalam Celcius = ");
                c = masukan.nextDouble();
                reamur = (0.8*c);
                fahrenheit = (1.8*c+32);
                kelvin = ((1.25*r)+273);
                System.out.println("Reamur = " +reamur);
                System.out.println("Fahrenheit = " +fahrenheit);
                System.out.println("Klevin = " +kelvin);
                break;
                
            case 3:
                System.out.print("Masukkan Suhu dalam Fahrenheit = ");
                f = masukan.nextDouble();
                celcius = (0.555*(f-32));
                reamur = (0.444*(f-32));
                kelvin = (0.556*(f-32)+273);
                System.out.println("Reamur = " +reamur);
                System.out.println("Celcius = " +celcius);
                System.out.println("Kelvin = " +kelvin);
                break;
             
            case 4:
                System.out.println("Masukkan Suhu dalam Kelvin ");
                k =  masukan.nextDouble();
                celcius = (k-273);
                reamur = (0.8*(k-273));
                fahrenheit = 2.25*(k-273)+32;
                System.out.println("Celcius = " +celcius);
                System.out.println("Reamur = "+reamur);
                System.out.println("Fahrenheit = "+fahrenheit);
                break;
                
             
        }
    }
}

                
          
        

         
        
    
    

