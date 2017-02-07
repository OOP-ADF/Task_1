/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Rinaldy Achmad Fauzy
//1301154357
//IF 39-07

package temperatureconvert;

import java.util.Scanner;

/**
 *
 * @author Rinaldy A
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            double celcius,reamur,fahrenheit,kelvin;
//            boolean menu;
            int i;
        Scanner cin= new Scanner(System.in);
       
        System.out.print("Masukkan Suhu dalam Celcius: ");
        celcius=cin.nextDouble();
        
        reamur=celcius*0.8;
        fahrenheit=celcius*1.8+32;
        kelvin=celcius+273;
        
        System.out.println("Mau di Koneversikan ke?");
        System.out.println("1.Reamur");
        System.out.println("2.Fahrenheit");
        System.out.println("3.Kelvin");
//        menu=cin.nextBoolean();
        i=cin.nextInt();
        
        if (i==1) {
            System.out.println("Suhu di dalam Reamur adalah: "+reamur+" R");
        }
        else if (i==2){
            System.out.println("Suhu di dalam Fahrenheit adalah: "+fahrenheit+"F");
        }
        else if (i==3){
            System.out.println("Suhu di dalam Kelvin adalah: "+kelvin+"K");
        }
        else {
            System.out.println("TETOT! Maaf inputan tidak ada... ");
        }
        
        
    }
    
}
