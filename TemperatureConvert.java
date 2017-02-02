
package temperatureconvert;

import java.util.Scanner;


public class TemperatureConvert {

    
    public static void main(String[] args) {
        float c;
        float f;
        float r;
        float k;
        Scanner suhu = new Scanner(System.in);
        System.out.print("masukan suhu temperatur Celcius = ");
        c = suhu.nextInt();
        
        f = 9f/5f *c;
        r = 4f/5f *c;
        k = c + 273;
        
        System.out.println("reamur = "+ r);
        System.out.println("fahrenhait = "+ f);
        System.out.println("kelvin = "+ k);
        
        
        
    }
    
}
