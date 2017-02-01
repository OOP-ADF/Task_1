/* Nama       : Serlii Ratmala Crusita
 * Nim        : 1301154474
 * Kelas      : IF 39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturconvert;

import java.util.Scanner;

/**
 *
 * @author Serlii R. Crusita
 */
public class Temperaturconvert {
    public static void main(String[] args) {
        Scanner celcius = new Scanner(System.in);
        System.out.println("Masukkan Suhu Celcius : ");
        int cel = celcius.nextInt();
        System.out.println("1. Fahrenheit ");
        System.out.println("2. Kelvin ");
        System.out.println("3. Reamur ");
        Scanner input = new Scanner (System.in);
        System.out.println("Ingin diubah dalam ? ");
        int p = input.nextInt();
            int suhu;
            switch (p){
                case 1 :
                    suhu = (cel*9/5)+32;
                    System.out.println(suhu + " Fahrenheit");
                    break;
                case 2 :
                    suhu = cel + 273;
                    System.out.println(suhu + " Kelvin");
                    break;
                case 3 :
                    suhu = cel*4/5;
                    System.out.println(suhu + " Reamur");
                    break;     
                    
                default:
                    System.out.println("Pilihan yang dimasukkan hasilnya : ");
            }
    }
    
}
