import java.util.Scanner;

public class TemperatureConvert
{
    public static void main(String[] args)
    {
        System.out.println("Program Konverter Temperatur");
        System.out.println();
        Scanner ulang = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        char u = 'Y';
        do
        {
            System.out.print("Input Suhu (Celcius) : ");
            float celcius = input.nextFloat();

            System.out.println();

            System.out.println("Konvert Ke Satuan :"); 
            System.out.println(" 1. Reamur");
            System.out.println(" 2. Fahrenheit");
            System.out.println(" 3. Kelvin");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = input.nextInt();

            if (pilihan == 1)
            {
                float reamur = (celcius * 4/5);
                System.out.println(celcius + " celcius = " + reamur + " reamur");
            }
            else if (pilihan == 2)
            {
                float fahrenheit = (celcius * 9/5 + 32);
                System.out.println(celcius + " celcius = " + fahrenheit + " fahrenheit");
            }
            else if (pilihan == 3)
            {
                double kelvin = (celcius + 273.15);
                System.out.println(celcius + " celcius = " + kelvin + " kelvin");
            }
            else
            {
                System.out.println("Input Salah");
            }
            System.out.print("Ulang Program (Y/N): ");
			      u = ulang.next().charAt(0);
        }
        while(u == 'Y' || u =='y');
    }

}
