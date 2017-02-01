/**
 * Nama: Herica Bunga Maharani
 * Nim: 1301154572
 * Kelas: IF-39-12
 */
import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
    	Scanner cin = new Scanner(System.in);
        
	System.out.print("Masukkan Suhu (Celcius): ");
    	int suhu = cin.nextInt();
        
	System.out.println("-Konversi Ke-");
    	System.out.println("1. Reamur");
	System.out.println("2. Fahrenheit");
	System.out.println("3. Kelvin");
    	System.out.print("Pilih: ");
	int menu = cin.nextInt();
        
	double result;		
	if (menu==1){
        	result = 0.8*suhu;
        	System.out.println(result+"Reamur");		}
	else if (menu==2){
        	result = (1.8*suhu) + 32;
        	System.out.println(result+"Fahrenheit");
	} else{
        	result = 273+suhu;
        	System.out.println(result+"Kelvin");
	}
    }
}
    
