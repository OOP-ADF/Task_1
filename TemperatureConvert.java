package temperatureconvert;
import java.util.Scanner;
/**
 *
 * @author Andi Akhmad Fauzi
 */
/* Andi Akhmad Fauzi IF-38-09 1301144009 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float c;
        float f;
        float r;
        double k;
		int op;
        
        System.out.println("===PROGRAM TEMPERATURE CONVERTER===");
		Scanner s = new Scanner(System.in); // Scanner Float
		Scanner z = new Scanner(System.in); // Scanner Integer
        System.out.println("1. Celcius to Fahrenheit ");
        System.out.println("2. Celcius to Reamur ");
        System.out.println("3. Celcius to Kelvin ");
        System.out.print("Pilihan : ");
        op = z.nextInt();
		switch(op)
		{    case 1:{ System.out.print("Masukkan suhu (C): "); 
                      c = s.nextFloat();
                      f = (c * (9/5) + 32);
                      System.out.println(c + " celcius (C) = " + f + " fahrenheit (F)");
                      break;  }
             case 2:{ System.out.print("Masukkan suhu (C): "); 
                      c = s.nextFloat();
                      r = (c * 4/5);	
                      System.out.println(c + " celcius (C) = " + r + " reamur (R)");
                      break;  }
             case 3:{ System.out.print("Masukkan suhu (C): "); 
                      c = s.nextFloat();
                      k = (c + 273.15);
                      System.out.println(c + " celcius (C) = " + k + " kelvin (K)");
                      break;  }
             default: System.out.println("Inputan Salah");
                      break;
        }
    }
    
}