//aryaditya H.p - 1301144162 - IF3802

import java.util.Scanner;
public class TemperatureConvert {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
  
     double celcius, hasilf, hasilk, hasilr;
  
  System.out.print("Masukan Suhu Celcius  : ");
  celcius = input.nextInt();
  System.out.println("");
  System.out.println("1. Fahrenheit");
  System.out.println("2. Kelvin");
  System.out.println("3. Reamur");
  System.out.print("Masukan Pilihan :");
  int pilih = input.nextInt();
  System.out.println("");
  
  switch(pilih){
  case 1 :
   hasilf = (celcius*9/5)+32;
   System.out.println(celcius + " Celcius = " + hasilf +" Fahrenheit");
   break;
  case 2 :
   hasilk = celcius+273.15;
   System.out.println(celcius + " Celcius = " + hasilk +" Kelvin");
   break;
  case 3 :
   hasilr = celcius*4/5;
   System.out.println(celcius + " Celcius = " + hasilr +" Reamur");
   break;
  default :
   System.out.println("Pilihan salah");
   break;
  }
 }
}