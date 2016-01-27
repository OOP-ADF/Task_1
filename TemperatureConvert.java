--------------BELUM SELESAI-------------------------

import java.util.Scanner;

/**
 *
 * @author IFENDO MAZENDA PUTRA
 */
public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Celcius: ");
        double bil= input.nextInt();
        char temp = 'c';
        
        System.out.println("\n1.Fahreinheit\n2.Reamur\n3.Kelvin\n\nConvert to : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1 :bil = cToF(bil);
                    temp = 'f';
                    System.out.println("in Fahreinheit : "+bil);
                    break;
            case 2 :bil = cToR(bil);
                    temp = 'r';
                    System.out.println("in Reamur : "+bil);
                    break;
            case 3 :bil = cToK(bil);
                    temp = 'k';
                    System.out.println("in Kelvin : "+bil);
                    break;
            default:
                throw new AssertionError();
        }
        
        System.out.print("\n1.Fahreinheit\n2.Reamur\n3.Kelvin\n4.exit\n\nConvert Again : ");
        pilih = input.nextInt();
        while (pilih != 4) {
            
        
            switch (pilih) {
                case 1 :if (temp == 'f') {
                            System.out.println("you're already on fahreinheit");
                        }
                        else{
                            
                        }
                        bil = 
                        System.out.println("in Fahreinheit : "+bil);
                        break;
                case 2 :bil = cToR(bil);
                        System.out.println("in Reamur : "+bil);
                        break;
                case 3 :bil = cToK(bil);
                        System.out.println("in Kelvin : "+bil);
                        break;
                default:
                    throw new AssertionError();
            }
            getch();
        }
    }
    
    public static double cToF(double bil){
        return (9/5*bil)+32;
    }
    public static double cToR(double bil){
        return (4/5*bil);
    }
    public static double cToK(double bil){
        return (bil+273.15);
    }
    public static double FToC(double bil){
        return (bil-32)*5/9;
    }
    public static double RToC(double bil){
        return (5/4*bil);
    }
    public static double KToC(double bil){
        return (bil-273.15);
    }
}
