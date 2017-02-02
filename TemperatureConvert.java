package temperatureconverter;

import java.util.Scanner;

public class TemperatureConverter {

    
    public static void main(String[] args) 
    {
        double celcius, fahrenheit, kelvin, reamur, x;
        int pilih;
        x = 0;
        
        Scanner suhu = new Scanner(System.in);
        while (x != 2)
        {  
        
			System.out.print("Masukkan suhu dalam Celcius: ");
			System.out.println("1. Fahreinheit ");
			System.out.println("2. Kelvin");
			System.out.println("3. Reamur");
			System.out.print("Konversi ke : ");
			celcius = suhu.nextInt();
			
			fahrenheit = 32 + (celcius * 9/5);
			kelvin = celcius + 273;
			reamur = 4/5 * celcius;
         
			pilih = suhu.nextInt();
				if (pilih == 1)
				{
					System.out.println(celcius + " ºC adalah " + fahrenheit + " ºF");
				}
				else if (pilih == 2)
				{
					System.out.println(celcius + " ºC adalah " + kelvin + " ºK");
				}
				else if (pilih == 3)
				{
					System.out.println(celcius + " ºC adalah " + reamur + " ºR");
				}
        
        System.out.println("Ingin mencoba mengonversi ke satuan lainnya? 1.Ya 2. Tidak");
        x = suhu.nextInt();
        }
    }
}