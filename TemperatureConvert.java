import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Nama: Adam Geraldy Katab
 * NIM: 1301140381
 * Kelas: IF-38-01
 */

public class TemperatureConvert {
	private static double celcius = 0;
	private static Scanner inputSuhu;
	
	public static void main(String[] args) {
		inputSuhu = new Scanner(System.in);
		
		while(true) {
			System.out.print("Masukkan suhu dalam celcius: (-1 untuk keluar) ");
			try {
				celcius = inputSuhu.nextDouble();
			} catch (InputMismatchException e) {
				inputSuhu.nextLine();
				continue;
			}
			
			if(celcius == -1) break;
			
			System.out.print("Masukkan pilihan converter(1 = Kelvin, 2 = Reamur, 3 = Fahrenheit, 4 = All): ");
			switch(inputSuhu.nextInt()) {
				case 1:
					System.out.println(celcius + " derajat celcius = " + (celcius + 273.15) + " kelvin.");
					break;
				case 2:
					System.out.println(celcius + " derajat celcius = " + (celcius * 0.8) + " reamur.");
					break;
				case 3: 
					System.out.println(celcius + " derajat celcius = " + (celcius * 1.8 + 32) + " fahrenheit");
					break;
				case 4:
					System.out.println(celcius + " derajat celcius = " + (celcius + 273.15) + " kelvin.");
					System.out.println(celcius + " derajat celcius = " + (celcius * 0.8) + " reamur.");
					System.out.println(celcius + " derajat celcius = " + (celcius * 1.8 + 32) + " fahrenheit");
					break;
				default:
					System.out.println("Pilihan yang dimasukkan salah!");
					break;
			}
		}
		inputSuhu.close();
	}
}