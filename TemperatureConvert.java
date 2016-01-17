/*
 * Nama : Fauzy Alfy A.
 * Nim : 1301144269
 * Kelas : IF-38-09
 */
package temperatureconvert;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner
/**
 *
 * @author Metteora
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner i = new Scanner(System.in);
   
      float celcius, convertf, convertk, convertr;
   
   System.out.print("Masukan Suhu Celcius  : ");
   celcius = i.nextFloat();
   System.out.println("");
   System.out.println("1. Fahrenheit");
   System.out.println("2. Kelvin");
   System.out.println("3. Reamur");
   System.out.print("Masukan Pilihan :");
   int pilih = i.nextInt();
   System.out.println("");
   
   switch(pilih){
   case 1 :
    convertf = (celcius*9/5)+32;
    System.out.println(celcius + " Celcius = " + convertf +" Fahrenheit");
    break;
   case 2 :
    convertk = celcius+273.15;
    System.out.println(celcius + " Celcius = " + convertk +" Kelvin");
    break;
   case 3 :
    convertr = celcius*4/5;
    System.out.println(celcius + " Celcius = " + convertr +" Reamur");
    break;
   default :
    System.out.println("Pilihan salah");
    break;
   }
  }
 }   
