import java.util.Scanner;
public class TemperatureConvert {
	//Hirianinda Malsegianty S.
	//1301140262
	//IF - 38 - 02

    static char Convert;
    static char yn;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
int celcius;
float reamur,fahrenhait,kelvin;

System.out.println(" Masukan suhu dalam derajat celcius: ");
celcius = input.nextInt();
System.out.println(" Convert ke [R/F/K]: ");
Convert = input.next().charAt(0);

switch(Convert){
    case 'R':
        reamur = 4f/5f*celcius;
        System.out.println("reamur :" +reamur);
        break;
     
    case 'F':
        fahrenhait = 9f/5f*celcius+32f;
        System.out.println("fahrenhait :" + fahrenhait);
        break;
    
    case 'K':
        kelvin = celcius +273;
        System.out.println("kelvin :" +kelvin);
        break;}

System.out.println(" Mau convert angka ini ke bentuk lainnya? [Y/N]? ");
yn = input.next().charAt(0);
while (yn == 'Y')
{
   System.out.println(" Convert ke [R/F/K]: ");
Convert = input.next().charAt(0);

switch(Convert){
    case 'R':
        reamur = 4f/5f*celcius;
        System.out.println("reamur :" +reamur);
        break;
     
    case 'F':
        fahrenhait = 9f/5f*celcius+32f;
        System.out.println("fahrenhait :" + fahrenhait);
        break;
    
    case 'K':
        kelvin = celcius +273;
        System.out.println("kelvin :" +kelvin);
        break;}
    } 

}    
}
