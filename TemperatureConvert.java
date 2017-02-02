//Sylvia Dwi Anggraini
//1301154469
//if-39-07

package TemperatureConvert;
import java.util.Scanner;

public class TemperatureConvert{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c, r, f, k, kelvin, reamur, fahrenheit, celcius;
        int x=0;
        while(x==0){
        System.out.println("Temperature Convert");
        System.out.println("1. Celcius");
        System.out.println("2. Reamur");
        System.out.println("3. Fahrenheit");
        System.out.println("4. Kelvin");
        System.out.print(" Pilih : ");
        int pil = input.nextInt();
        
        switch(pil){
            case 1 :
                System.out.print("Masukkan Suhu Celcius : ");
                c = input.nextDouble();
                reamur     = 0.8*c;
                fahrenheit = (1.8*c)+32;
                kelvin = c+273;
                System.out.println(reamur+"' reamur dan "+ fahrenheit+"' fahrenheit dan "+ kelvin+"' kelvin");
                break;
                
            case 2 :
                System.out.println("Masukkan Suhu Reamur : ");
                r = input.nextDouble();
                celcius = 1.25*r;
                fahrenheit = (2.25*r)+32;
                kelvin = (1.25*r)+273;
                System.out.println(celcius+"' celcius dan "+ fahrenheit+"' fahrenheit"+ kelvin+"' kelvin");
                break;
                
            case 3 : 
                System.out.println("Masukkan Suhu Fahrenheit : ");
                f = input.nextDouble();
                celcius = 0.556*(f-32);
                reamur = 0.444*(f-32);
                kelvin = 0.556*(f-32)+273;
                System.out.println(celcius+"' celcius dan "+ reamur+"' reamur"+ kelvin+"' kelvin");
                break;   
                
            case 4 : 
                System.out.println("Masukkan Suhu Kelvin : ");
                k = input.nextDouble();
                celcius = k-273;
                reamur = 0.8*(k-273);
                fahrenheit = 1.8*(k-273)+32;
                System.out.println(celcius+"' celcius dan "+ reamur+"' reamur dan "+fahrenheit+"' fahrenheit.");
                break;                               
        }
        
        System.out.println("Apakah Ingin mencoba lagi? ");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Pilih : ");
        pil = input.nextInt();
        if (pil==1){
            System.out.println(pil);
        }
        else{
            System.exit(0);
        }
    }}
}