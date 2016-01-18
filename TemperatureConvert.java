/*
 I Nyoman Tri Budhi Palantra
 1301140089
 IF 38 09
 */
 
public class TemperatureConvert {
    public static void main(String[] args) {
        float celcius;
        float fahrenheit;
        float kelvin;
        float reamur;
        int pilihan;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input Temprature (Celcius) : ");
        celcius = input.nextFloat();
        
        System.out.println("1. Convert To Reamur");
        System.out.println("2. Convert To Fahrenheit");
        System.out.println("3. Convert To Kelvin");
        
        pilihan = input.nextInt();
        
		if (pilihan == 1)
        {
            reamur = (celcius * 4/5);
            System.out.println(celcius + " Celcius = " + reamur + " Reamur");
        }
        else if (pilihan == 2)
        {
            fahrenheit = (celcius * 9/5 + 32);
            System.out.println(celcius + " Celcius = " + fahrenheit + " Fahrenheit");
        }
        else if (pilihan == 3)
        {
            kelvin = (celcius + 273.15);
            System.out.println(celcius + " Celcius = " + kelvin + " Kelvin");
        } 
        else
        {
            System.out.println("Error!");
        }
    }   
}
