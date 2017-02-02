/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconvert.java;
import java.io.*;
/**
 *
 * @author Alwi faisal
 */
public class TemperatureConvertJava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException
    {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    double celcius, hasilfahrenheit, hasilkelvin,hasilreamur;
    
    
 system.out.print("suhu dalam celcius    :");
    celcius  = Integer.parseInt(input.readLine());
    System.out.println("");
    System.out.println("1.Kelvin");
    System.out.println("2.Fahrenheit");
    System.out.println("3.Reamur");
    System.out.println("masukan pilihan :");
    int masukanpilihan = Integer.parseInt(input.readLine());
    System.out.println("");
    
switch(pilih){
    case 1 :
        hasilfahrenheit = (celcius*9/5)+32;
        System.out.println(celcius  + "celcius =" + hasilfahrenheit +"fahrenheit");
        break;
    case 2 :
        hasilreamur =  (celcius*4/5);
        System.out.println(celcius + "celcius =" +  hasilreamur +"hasilreamur");
        break;
    case 3 : 
        hasilkelvin = (celcius+273.15);
        System.out.println(celcius + "celcius ="+ hasilkelvin + "hasilkelvin");
        break;
    default :
        System.out.println("user memasukan angka yang salah");
        break;
        
               
}
    }
}