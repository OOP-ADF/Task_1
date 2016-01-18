//Nama    : Aristya Wirawan
//NIM     : 1103134329
//Kelas   : IF-38-09

import java.util.Scanner;
public class TemperatureConvert{
	private static void main(String[] args){
		Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
 
        String x;
        int pil;
        double n1, n2;

        for (x = "Y"; x.equals("Y") || x.equals("y");) {
            System.out.print("Masukkan suhu derajat Celcius : ");
            n1 = input.nextDouble();
            System.out.println("MENU ");
            System.out.println("1. Convert to Reamur ");
            System.out.println("2. Convert to Fahrenheit ");
            System.out.println("3. Convert to Kelvin ");
            System.out.print("Pilih : ");
            pil = input.nextInt();
            switch (pil) {
                case 1: {
                    n2 = 0.8 * n1;
                    System.out.println("Suhu Reamurnya : " + n2);
                    break;
                }
                case 2: {
                    n2 = (1.8 * n1) + 32;
                    System.out.println("Suhu Fahrenheitnya : " + n2);
                    break;
                }
                case 3: {
                    n2 = n1 + 273;
                    System.out.println("Suhu Kelvinnya : " + n2);
                    break;
                }
                default:
					System.out.println("Inputan Salah!");
                    break;
            }
            System.out.print("Coba lagi [Y/T]? ");
            x = input1.next();
        }

	}
}