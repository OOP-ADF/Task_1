//Elvaretta_1301154446_IF3912

public class TemperatureConvert 
{ 
	public static void main(String[] args) 
	{ 
		int s,c,x,temperature;
		
		System.out.println("Masukkan suhu (celcius) : "); 
		Scanner s = new Scanner(System.in); 
		
		int c = s.nextInt(); 
			
		System.out.println("1. Kelvin "); 
		System.out.println("2. Reamur "); 
		System.out.println("3. Farenheit "); 
		System.out.println("Pilih Skala= "); 
  
		int x = s.nextInt(); 
		int temperature; 
   
		if(x == 1) { 
			temperature = c+273; 
			System.out.println(temperature + " derajat Kelvin."); 
		} 
  
		else if(x == 2) { 
			temperature = c*4/5; 
			System.out.println(temperature + " derajat Reamur."); 
		} 

		else if(x == 3) { 
			temperature = (c*9/5)+32; 
			System.out.println(temperature + " derajat Farenheit."); 
		} 
	} 
}