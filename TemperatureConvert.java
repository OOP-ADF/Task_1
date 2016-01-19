import java.util.Scanner;
/*
Hizas Sabilal Rasyad
1301140251
IF3801
*/
public class TemperatureConvert {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double suhu1, suhu2; char choose; char back = '1';
        System.out.println("Temperature Converter");
        System.out.println("");
        System.out.print("Input Temperature in Celcius : ");
        suhu1 = cin.nextDouble();
        while(back == '1') {
        System.out.println("Convert to : ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");       
        System.out.println("3. Kelvin");
        choose = cin.next().charAt(0);
        switch(choose)
        {
            case '1' : suhu2 = suhu1*0.8;  
                       System.out.println(suhu1 + " Celcius = " + suhu2 + " Reamur");
                       break;
            case '2' : suhu2 = suhu1*1.8 + 32; 
                       System.out.println(suhu1 + " Celcius = " + suhu2 + " Fahrenheit"); 
                       break;
            case '3' : suhu2 = suhu1 + 273.15; 
                       System.out.println(suhu1 + " Celcius = " + suhu2 + " Kelvin");
                       break;
            default : System.out.println("Choose the right choice!"); break;
        }
        System.out.println("Convert Again(N for No) : ?");
        choose = cin.next().charAt(0);
        if((choose == 'N') || (choose == 'n')) back = '0';
        }   
    }  
}
