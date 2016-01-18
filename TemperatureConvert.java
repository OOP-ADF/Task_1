import java.util.Scanner;

public class TemperatureConvert {
	/**
	*program java menentukan konversi suhu
	*oleh I Putu Prima Ananda IF-38-01 1301144291
	*/
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char pilih;
		char pil;
		double celcius, reamur, fahrenhait, kelvin;
		boolean valid=false;
		System.out.print("Masukan suhu yang dengan derajat celcius : ");
		celcius = input.nextInt();
		reamur = celcius*0.8;
		fahrenhait = celcius*1.8+32;
		kelvin = celcius+273.15;
		System.out.println("Konversi suhu ke :");
		System.out.println("1. Reamur ");
		System.out.println("2. Fahrenhait ");
		System.out.println("3. Kelvin");
		System.out.println("");
		while (valid!=true){
			System.out.print("Pilihan : ");
			pilih = input.next().charAt(0);
			switch(pilih){
				case '1' : {
					System.out.println("Reamur : " + reamur);
					break;
				}
				case '2' : {
					System.out.println("Fahrenhait : " + fahrenhait);
					break;
				}
				case '3' : {
					System.out.println("Kelvin : " + kelvin);
					break;
				}
				default : {
					System.out.println("Masukan pilihan dengan benar");
				}
			}
			System.out.print("Apakah ingin konversi ke suhu lain? Y/N : ");
			pil = input.next().charAt(0);
			switch(pil){
				case 'Y' : {
					valid = false;
					break;
				}
				case 'y' : {
					valid = false;
					break;
				}
				default : {
					valid = true;
				}
			}
		}
		
	}
}
