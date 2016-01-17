/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconvert;

import java.util.Scanner;
/**
 *
 * @author Galih Setyo Ginanta 1301140182 if3802
 */
public class TemperatureConvert {
    public static void main(String[] args) {
 System.out.println("convert celcius to ");
        Scanner masukan = new Scanner (System.in);
        int C = masukan.nextInt();
   int pilih = 0;
   float hasil;
 System.out.println("convert celcius"+"\n1.reamur"+"\n2.fahrenheit"+"\n3.kelvin");
pilih = masukan.nextInt();
 switch(pilih)
{
case 1:
    System.out.println("convert celcius to reamur");
    System.out.println("Masukkan nilai celcius :");
    hasil = (float) (C* 0.8);
    System.out.println("reamur :"+hasil);
break;
case 2:  
    System.out.println("convert celcius to fahrenheit");
    System.out.println ("Masukkan nilai celcius :");
    hasil= (float) ((0.18*C) +32);
    System.out.println("FAHRENHEIT :"+hasil);
break;    
case 3:
    System.out.println("convert celcius to KELVIN");
    System.out.println("Masukkan nilai celcius :");
    hasil = C+273;
    System.out.println("KELVIN :"+hasil);
break;  
}
   }
}