Jeremiah Hasudungan IF 39-07 1301154287

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturconvert;

import java.util.Scanner;

/**
 *
 * @author Jeremi
 */
public class TemperaturConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanC = new Scanner(System.in);
        Scanner scanF = new Scanner(System.in);
        Scanner scanR = new Scanner(System.in);
        Scanner scanP = new Scanner(System.in);
        Scanner scanP2 = new Scanner(System.in);
        Scanner scanP3 = new Scanner(System.in);
        Scanner scanP4 = new Scanner(System.in);
        
        System.out.println(" Pilih Suhu yang akan di masukan ");
        System.out.println(" 1. Celcius ");
        System.out.println(" 2. Reamur  ");
        System.out.println(" 3. Fahrenheit ");
        int pil = scanP.nextInt();
        switch (pil){
            
            case 1 :
                System.out.println(" Masukan Derajat Celcius ");
                double cel = scanC.nextDouble();
                System.out.println(" Kemana akan dikonvert ");
                System.out.println(" 1. Reamur  ");
                System.out.println(" 2. Fahrenheit ");
                int pil2 = scanP2.nextInt();
                    switch (pil2){
                        case 1 :
                            double hasilReamur1 = cel*0.8;
                            System.out.println(hasilReamur1 + " Reamur ");
                            break;
                        case 2 :
                            double hasilFahrenheit1 = (cel*1.8)+32;
                            System.out.println(hasilFahrenheit1 + " Fahreinheit ");
                            break;
                    }
                    break;
            case 2 :
                System.out.println(" Masukan Derajat Reamur ");
                double rea = scanR.nextDouble();
                System.out.println(" Kemana akan dikonvert ");
                System.out.println(" 1. Celcius ");
                System.out.println(" 2. Fahreinheit ");
                int pil3 = scanP3.nextInt();
                switch (pil3) {
                    case 1 :
                        double hasilCelcius1 = rea/0.8;
                        System.out.println(hasilCelcius1 + " Celcius ");
                        break;
                    case 2 :
                        double hasilFahrenheit2 = (rea*2.25)+32;
                        System.out.println(hasilFahrenheit2 + " Fahreinheit ");
                        break;
                    }
                break;
                
            case 3 :
                System.out.println(" Masukan Derajat Fahrenheit ");
                double F = scanF.nextDouble();
                System.out.println(" Kemana akan dikonvert ");
                System.out.println(" 1. Celcius ");
                System.out.println(" 2. Fahreinheit ");
                int pil4 = scanP4.nextInt();
                switch (pil4) {
                    
                    case 1 :
                        double hasilCelcius2 = (F-32)/1.8;
                        System.out.println(hasilCelcius2 + " Celcius ");
                        break;
                    case 2 :
                        double hasilReamur2 = (F-32)/2.25;
                        System.out.println(hasilReamur2 + " Reamur ");
                        break;
                }
                break;
        }
    }
}
    


