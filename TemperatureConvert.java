/* 
Sulistiyo Tri Raharjo 
1301144329
IF-38-09
*/


public class TemperatureConvert {
	public static void main (String [] args){
		double celcius;
		double reamur;
		double fahrenheit;
		double kelvin;
		int pilihan;
		int i;
		i = 1;
	
		Scanner suhu = new Scanner(System.in);
		
		System.out.print("Input Suhu dalam Celcius: ");
		celcius = suhu.nextInt();
		System.out.println("");
		
		do
		{
			System.out.println("Convert Suhu ke: ");
			System.out.println("1. Reamur");
			System.out.println("2. Fahrenheit");
			System.out.println("3. Kelvin");
			System.out.print("Pilihan: ");
			pilihan = suhu.nextInt();
			System.out.println("");
			if (pilihan == 1)
			{
				reamur = ((4 * celcius)/5);
				System.out.println("Hasil Convert = " + reamur);
			}
			else if (pilihan == 2)
			{
				fahrenheit = (((9 * celcius)/5) + 32);
				System.out.println("Hasil Convert = " + fahrenheit);
			}
			else if (pilihan == 3)
			{
				kelvin = (celcius + 273);
				System.out.println("Hasil Convert = " + kelvin);
			}
			
			System.out.println("");
			
		}
	}
}
