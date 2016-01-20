/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatur;

import java.util.Scanner;

/**
 *
 * @author junandre
 */
public class Temperatur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner inputSuhu = new Scanner(System.in);
        suhu ObjSuhu = new suhu();
        int menu = 0;
        double nilai;
        while(menu!=4){
            nilai=0;
            System.out.println("MENU");
            System.out.println("1. Celcius to Reamur");
            System.out.println("2. Celcius to Farenheit");
            System.out.println("3. Celcius to Kelvin");
            System.out.println("4. Exit");
            System.out.print("Choose : ");
            menu = x.nextInt();
            switch(menu){
                case 1:
                        System.out.print("Masukkan Nilai Suhu : ");
                        nilai = inputSuhu.nextDouble();
                        ObjSuhu.celciusToReamur(nilai);
                        break;
                case 2:
                        System.out.print("Masukan Nilai Suhu : ");
                        nilai = inputSuhu.nextDouble();
                        ObjSuhu.celciusToFarenheit(nilai);
                        break;
                case 3:
                        System.out.print("Masukan Nilai Suhu : ");
                        nilai = inputSuhu.nextDouble();
                        ObjSuhu.celciusToKelvin(nilai);
                        break;
                case 4:
                        break;
                default:
                        System.out.println("Menu tidak ada");
                        break;
            }
            System.out.println();
        }
    }
    
}
