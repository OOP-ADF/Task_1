//author Syahidul Akbar Mardhotillah 1301140331

import java.util.Scanner;

public class Temperature{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double celcius, f, k, r;
int pil;

System.out.print("Masukan Suhu Celcius : ");
celcius = input.nextDouble();
System.out.println("1. Fahrenheit");
System.out.println("2. Kelvin");
System.out.println("3. Reamur");
System.out.print("Masukan Pilihan konversi suhu : ");
pil = input.nextInt();
System.out.println("");

switch(pil){
   case 1 :
    f = (celcius*9/5)+32;
    System.out.println(celcius + " Celcius = " + f +" Fahrenheit");
    break;
   case 2 :
    k = celcius+273.15;
    System.out.println(celcius + " Celcius = " + k +" Kelvin");
    break;
   case 3 :
    r = celcius*4/5;
    System.out.println(celcius + " Celcius = " + r +" Reamur");
    break;
   default :
    System.out.println("Pilihan Tidak Ada");
    break;
}
}
}
