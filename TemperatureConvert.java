import java.util.Scanner;
public class TemperatureConvert {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Temperature Convert");
        System.out.println("1. Celcius to Reamure");
        System.out.println("2. Celcius to Fahrenheit");
        System.out.println("3. Celcius to Kelvin");
        Scanner inputAngka = new Scanner (System.in);   
        System.out.print("Pilihan : ");
        int pil = inputAngka .nextInt();
        
        if (pil == 1){
            System.out.print("Temperature Celcius : "); 
            int celcius = inputAngka.nextInt();
            int reamure = (int) (celcius*0.8);
            System.out.println("Temperature Reamure = "+reamure); 
        }
        if (pil == 2){
            System.out.print("Temperature Celcius : "); 
            int celcius = inputAngka.nextInt();
            int fahrenheit = (int) ((celcius*1.8)+32);
            System.out.println("Temperature Fahrenheit = "+fahrenheit);
        }
        if (pil == 3){
            System.out.print("Temperature Celcius : "); 
            int celcius = inputAngka.nextInt();
            int kelvin = (int) (celcius+273);
            System.out.println("Temperature Fahrenheit = "+kelvin);
        }
    }    
}
//Akhmad Fadilah Ramadhan 1301140222 IF-38-02