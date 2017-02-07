
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        float c;
        float r, f, k;
        Scanner tempt = new Scanner (System.in);
        System.out.print("Input Number of Temperature : ");
        c = tempt.nextInt();
        
        r = (c*4/5);
        f = (c*9/5)+32;
        k = (c+273);
        System.out.println("Celcius to Fahrenheit = "+f);
        System.out.println("Celcius to Reamur = "+r);
        System.out.println("Celcius to Kelvin = "+k);
    }
}