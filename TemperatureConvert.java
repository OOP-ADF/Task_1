package soalkonversi;
import java.util.Scanner;

public class SoalKonversi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
int celcius;
float reamur,fahrenhait,kelvin;
System.out.print(" Masukan suhu kedalam derajat celcius: ");

celcius = input.nextInt();
reamur = 4f/5f*celcius;
fahrenhait = 9f/5f*celcius+32f;
kelvin = celcius +273;

System.out.println("reamur :" +reamur);
System.out.println("fahrenheit :" + fahrenhait);
System.out.println("kelvin :" +kelvin);
    }
    
}
