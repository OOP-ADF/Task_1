/*Nama : Windy Israniati Jihan
NIM  : 130114309
Kelas: IF-38-09*/

import java.util.Scanner;
public class TemperatureConvert {
  public static void main (String args[]) {
    Scanner masukkan = new Scanner(System.in);
	int menu1;
	int menu2;
    System.out.println("Konfersi Suhu (CelCius");
    System.out.println("=============");
	System.out.println("1. Ke Reamur");
	System.out.println("2. Ke Fahrenheit");
	System.out.println("3. Ke Kelvin");
	System.out.println("4. Lainnya");
	System.out.println("Masukkan Pilihan Menu : ");
	menu1 = masukkan.nextInt();
	switch (menu1) {
		case 1:
			CelciusToReamur();
			break;
		case 2:
			CelciusToFarenheit();
			break;
		case 3:
			CelciusToKelvin();
			break;
		case 4:
			System.out.println("1. Kelvin -> Celcius");
			System.out.println("2. Fahrenheit -> Celsius");
			System.out.println("3. Fahrenheit -> Reamur");
			System.out.println("4. Reamur -> Fahrenheit");
			System.out.println("5. Reamur -> Celsius");
			System.out.print("Masukkan Pilihan Menu : ");
			menu2 = masukkan.nextInt();
			switch (menu2) {
			  case 1:
				System.out.println("1. Kelvin -> Celcius");
					KelvinToCelcius();
					break;
			  case 2:
				System.out.println("3. Fahrenheit -> Celsius");
					FarenheitToCelcius();
					break;
			  case 3:
				System.out.println("4. Fahrenheit -> Reamur");
					FarenheitToReamur();
					break;
			  case 4:
				System.out.println("5. Reamur -> Fahrenheit");
					ReamurToFarentheit();
					break;
			  case 5:
				System.out.println("6. Reamur -> Celsius");
					ReamurToCelcius();
					break;
					
			  default:
				System.out.println("Menu yang anda masukkan tidak terdaftar");
			  }
			  break;
	}
}
private static void CelciusToFarenheit(){
Scanner masukkan = new Scanner(System.in);
float f,cel;
System.out.print("Masukkan nilai derajat Celcius : ");
cel = masukkan.nextFloat();
f = (9/5 * cel) + 32;
System.out.println("Nilai Farentheitnya adalah : "+f);
}
private static void CelciusToReamur(){
Scanner masukkan = new Scanner(System.in);
float reamur,celci;
System.out.print("Masukkan nilai derajat Celcius : ");
celci = masukkan.nextFloat();
reamur = 4/5 * celci;
System.out.println("Nilai Reamurnya adalah : "+reamur);
}
private static void FarenheitToCelcius(){
Scanner masukkan = new Scanner(System.in);
float farent,celciu;
System.out.print("Masukkan nilai derajat Fahrenheit : ");
farent = masukkan.nextFloat();
celciu = 5/9 * (farent - 32);
System.out.println("Nilai Celciusnya adalah : "+celciu);
}
private static void FarenheitToReamur(){
Scanner masukkan = new Scanner(System.in);
float fa,ream;
System.out.print("Masukkan nilai derajat Fahrenheit : ");
fa = masukkan.nextFloat();
ream = 4/9 * (fa - 32);
System.out.println("Nilai Celciusnya adalah : "+ream);
}
private static void ReamurToCelcius(){
Scanner masukkan = new Scanner(System.in);
float reamu,c;
System.out.print("Masukkan nilai derajat Reamur : ");
reamu = masukkan.nextFloat();
c = 5/4 * reamu;
System.out.println("Nilai Celciusnya adalah : "+c);
}
private static void ReamurToFarentheit(){
Scanner masukkan = new Scanner(System.in);
float far,rea;
System.out.print("Masukkan nilai derajat Reamur : ");
rea = masukkan.nextFloat();
far = 9/4 * (rea + 32);
System.out.println("Nilai Celciusnya adalah : "+rea);
}
private static void CelciusToKelvin(){
Scanner masukkan = new Scanner(System.in);
float cel,kel;
System.out.print("Masukkan nilai derajat Celcius : ");
cel = masukkan.nextFloat();
kel = cel + 273;
System.out.println("Nilai Celciusnya adalah : "+kel);
}
private static void KelvinToCelcius(){
Scanner masukkan = new Scanner(System.in);
float cel,kel;
System.out.print("Masukkan nilai derajat Kelvin : ");
kel = masukkan.nextFloat();
cel = kel - 273;
System.out.println("Nilai Celciusnya adalah : "+cel);
}
}
