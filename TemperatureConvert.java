/* 
Kevin Prakarsa B R (1301144169)
IF-38-09
*/

import java.util.Scanner;
public class konversisuhu {

public static void main (String [] args){
Scanner input = new Scanner (System.in);
int celcius;
float reamur,fahrenhait,kelvin;
System.out.println(" Masukan suhu: ");

celcius = input.nextInt();
reamur = 4f/5f*celcius;
fahrenhait = 9f/5f*celcius+32f;

kelvin = celcius +273;
System.out.println("reamur :" +reamur);
System.out.println("fahrenhait :" + fahrenhait);
System.out.println("kelvin :" +kelvin);
} 
}
