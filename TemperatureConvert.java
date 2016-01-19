// SELVI WIDYAPRADITIA PANGESTI, 1301144041, IF-38-01

import java.util.Scanner;
public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner cel=new Scanner(System.in);
        System.out.print("Celcius : ");
        int c=cel.nextInt();
       
        System.out.println("Konversi ke : ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        Scanner pil=new Scanner(System.in);
        System.out.print("Masukkan Nomor Pilihan : ");
        int a=pil.nextInt();
        switch (a) {
            case 1:
                double r=(c*4/5);
                System.out.print("nilai reamur menjadi " + r);
                break;
            case 2:
                double f=((c*9/5)+32);
                System.out.print("nilai fahrenheit menjadi " + f);
                break;
            case 3:
                double kel=(c+273);
                System.out.print("nilai kelvin menjadi " + kel);
                break;
           
            default:
                throw new AssertionError();
        }
    }
}
