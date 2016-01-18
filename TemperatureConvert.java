public class temperatureconvert {
	public static void main (String [] args){
		double celcius;
		double reamur;
		double fahrenheit;
		double kelvin;
		int pil;
		int x = 1;
	
		Scanner box = new Scanner(System.in);
		
		System.out.print("Input Suhu Celcius: ");
		celcius = box.nextInt();
		System.out.println("");
		
		do
		{
			System.out.println("Convert Suhu ke: ");
			System.out.println("1. Reamur");
			System.out.println("2. Fahrenheit");
			System.out.println("3. Kelvin");
			System.out.print("Pilihan: ");
			pil = box.nextInt();
			System.out.println("");
			if (pil = 1)
			{
				reamur = ((4 * celcius)/5);
				System.out.println("Reamur = " + reamur );
			}
			else if (pil = 2)
			{
				fahrenheit = (((9 * celcius)/5) + 32);
				System.out.println("Fahrenheit = " + fahrenheit );
			}
			else if (pil = 3)
			{
				kelvin = (celcius + 273);
				System.out.println("Kelvin = " + kelvin );
			}
			
			System.out.println("");
	}
}
