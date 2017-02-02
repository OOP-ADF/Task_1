/*
* abdulnursahid - 1301154385 - if39-07
*/

package temperatureconvert;

import java.util.Scanner;

public class TemperatureConvert {

    public static void main(String[] args) {
        int celcius, reamur, fahrenhit, kelvin,menu;
        Scanner cin = new Scanner(System.in);
        System.out.println("Masukan Besar Derajat Celcius : ");
        celcius = cin.nextInt();
        
        do{
        do {
        System.out.println("Menu Utama");
        System.out.println("1. celcius ke reamur");
        System.out.println("2. celcius ke fahrenhit");
        System.out.println("3. celcius ke kelvin");
        System.out.println("Silahkan Pilih : ");
        menu = cin.nextInt();
        }while(menu != 1 && menu != 2 && menu != 3);
        
        
        switch (menu){
            case 1:
                     reamur = celcius * 4/5;
                     System.out.println("Hasil Convert C ke R = "+ reamur);
                break;
            case 2:
                    fahrenhit = celcius *9/5+32;
                    System.out.println("Hasil Convert C ke F = "+ fahrenhit );
                break;
            case 3 :
                    kelvin = celcius + 273;
                    System.out.println("Hasil Convert C ke K = "+ kelvin);
                break;
        }    
        do{
            System.out.println("Kembali ke Menu Utama? Tekan 1'Ya' atau Tekan 2'Tidak'");
                System.out.println("Silahkan Pilih : ");
                menu = cin.nextInt();
        } while(menu == 1 && menu != 2 && menu>2);
    }while(menu == 1);
    }  
}
