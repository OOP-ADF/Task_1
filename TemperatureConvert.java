//Ranestari Sastriani, 1301154553, IF3907

import java.util.Scanner;
public class TemperatureConvert{
	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		double suhuFahrenheit,suhuKelvin,suhuReamur;
		Integer menu=0;
		 
		
		
		
		System.out.println("=======KONVERSI SUHU========"); 
		System.out.println("  masukan suhu (celcius) : "); 
		double suhuCelcius= sc.nextDouble();
		
		while(menu==0) {
			
			System.out.println("1. Reamur");
			System.out.println("2. Fahrenheit");
			System.out.println("3. kelvin");
			System.out.println("pilih no : ");
			Integer no=sc.nextInt();
		
		
			if (no==1){
			suhuReamur=0.8*suhuCelcius;
			System.out.println(suhuReamur+" reamur");
			}
			else if (no==2){
			suhuFahrenheit=(9/5*suhuCelcius)+32;
			System.out.println(suhuFahrenheit+" fahrenheit");
			}
			else if (no==3){
			suhuKelvin=suhuCelcius+273;
			System.out.println(suhuKelvin+" kelvin");
			}
			else{
			System.out.println("input salah!!!");
			}
			
			System.out.println("KONVERSI lagi? 1.ya/2.tidak ");
			System.out.println("pilih no :");
			Integer ulang=sc.nextInt();
			if (ulang == 1)
				System.out.println("===KONVERSI SUHU====");
				
				
			else
				System.exit(0);
			
			
		
			
			
		}	
			
		
		
		
		
		
		
		
		
	}
	
	
	
}