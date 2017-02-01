/* Nama		: Chando Anggara Natanael Batubara 
 * Nim		: 1301154390
 * Kelas	: IF 39-12
 */


import java.util.Scanner;


public class TemperaturConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner celcius = new Scanner(System.in);
        System.out.println("Masukkan Derajat Suhu : (celsius)");
        int x = celcius.nextInt();
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        Scanner input = new Scanner(System.in);
        System.out.println("Konvers kedalam : ");
        int y = input.nextInt();
        
        double hasil;
        if ( y == 1)
        {
            hasil = x*4/5;
            System.out.print("Hasil konvers = "+hasil+" Reamur");
        }
        else if ( y == 2)
        {
            hasil = (9/5* x) + 32;
            System.out.print("Hasil konvers = "+hasil+" Fahrenheit");
        }
 
        else
        {
            hasil = x + 273;
            System.out.print("Hasil konvers = "+hasil+" Kelvin");   
        }         
    }
    
}