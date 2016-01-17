/*
Nama: ZULFA UMI WARDANI
Nim: 1301144082
Kelas: IF-38-02
*/

import java.util.Scanner;

/**
 *
 * @author ZULFA UMI WARDANI
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suhu;
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Suhu : ");
        suhu = scan.nextDouble();
        System.out.println("1. From Celcius to Kelvin, Fahrenheit, Reamur");
        System.out.println("2. From Kelvin to Celsius, Fahrenheit, Reamur");
        System.out.println("3. From Fahrenheit to Kelvin, Celcius, Reamur");
        System.out.println("4. From Reamur to Kelvin, Fahrenheit, Celcius");
        System.out.print("Pilih : ");
        input = scan.nextInt();
        
        switch(input) {
            case 1 :
                    System.out.println("Kelvin      : "+ (suhu+273.15)+" K");
                    System.out.println("Fahrenheit  : "+ (suhu*1.8+32)+" F");
                    System.out.println("Reamur      : "+ (suhu*0.8)+" R");
                    break;
            case 2 : 
                    System.out.println("Celcius     : "+ (suhu-273.15)+" K");
                    System.out.println("Fahrenheit  : "+ (suhu*1.8-459.67)+" F");
                    System.out.println("Reamur      : "+ ((suhu-273.15)*0.8)+" R");
                    break;
            case 3 :
                    System.out.println("Kelvin      : "+ ((suhu+459.67)/ 1.8)+" K");
                    System.out.println("Celcius     : "+ ((suhu-32)/1.8)+" F");
                    System.out.println("Reamur      : "+ ((suhu-32)/2.25)+" R");
                    break;
            case 4 :
                    System.out.println("Kelvin      : "+ (suhu/0.8+237.15)+" K");
                    System.out.println("Fahrenheit  : "+ (suhu*2.25+32)+" F");
                    System.out.println("Celcius     : "+ (suhu/0.8)+" R");
                    break;
        }
        
    }
    
}
