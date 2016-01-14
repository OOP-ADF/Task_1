//Erwin Yulizar F || 1301144031 || IF-38-01


import java.util.Scanner;

public class TemperatureConvert{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        double f,r;
        
        System.out.print("Masukkan temperature dalam celcius : ");
        int temperature = input.nextInt();
        f = (9 * temperature/5) +32;
        r = (4 * temperature/5);
        k = temperature + 273;
        
        System.out.println("Nilai fahrenheit dari input tadi : "+f);
        System.out.println("Nilai reamur dari input tadi : "+r);
        System.out.println("Niali Kelvin dari input tadi : "+k);
    }
}