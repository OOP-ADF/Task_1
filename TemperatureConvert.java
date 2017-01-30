package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author  Kukuh Rahingga P
 *          1301150035
 *          IF-39-07
 */
public class TemperatureConvert 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan suhu dalam celcius : ");
        float inp = input.nextInt();
        int pil = 1;
        while (pil < 4)
        {
            System.out.println("Masukkan angka untuk memilih");
            System.out.println("1. Farenheit");
            System.out.println("2. Reamur");
            System.out.println("3. Kelfin");
            System.out.println("4. Exit");
            System.out.print("Pilih : ");
            pil = input.nextInt();
            float hasil;
            
            switch(pil)
            {
                case 1 :
                        hasil = (inp * 9/5 + 32);
                        System.out.println(inp + " Celcius = " + hasil + " Farenheit \n");
                        break;
                case 2 :
                        hasil = (inp * 4/5);
                        System.out.println(inp + " Celcius = " + hasil + " Reamur \n");
                        break;
                case 3 :
                        hasil = (inp + 273);
                        System.out.println(inp + " Celcius = " + hasil + " Kelvin \n");
                        break;
            }
        }
    }   
}