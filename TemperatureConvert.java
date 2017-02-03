package task_1;
import java.util.Scanner;
/**
 *
 * @author Andre Anugrah
 */
public class TemperatureConverter 
{
    public static void main(String[] args) 
    {
        //input
        Scanner inp = new Scanner (System.in);
        System.out.print("Masukkan suhu (celcius) : ");
        float n = inp.nextInt();
        
        //program
        int pil = 1;
        while (pil > 0)
        {
            System.out.println("1. Farenheit");
            System.out.println("2. Reamur");
            System.out.println("3. Kelvin");
            System.out.println("0. Exit");
            System.out.print("Pilih : \n");
            pil = inp.nextInt();
            float total;
            
            //output
            switch(pil){
                case 1 :
                        total = (n * 9/5 + 32);
                        System.out.println(n + " Celcius = " + total + " Farenheit");
                        break;
                case 2 :
                        total = (n * 4/5);
                        System.out.println(n + " Celcius = " + total + " Reamur");
                        break;
                case 3 :
                        total = (n + 273);
                        System.out.println(n + " Celcius = " + total + " Kelvin");
                        break;
            }
        }
    }
}
