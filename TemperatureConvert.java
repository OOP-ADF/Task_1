import java.util.Scanner;
public class TemperaturConverter{
public static void main(String [] args)
{
    float f, c;
    f = c = 0;
    int i;
    Scanner scan = new Scanner (System.in);
    System.out.println(" 1 for Celcius ke Fahrenheit 2 for Fahrenheit ke Celcius ");
    i = scan.nextInt();
    if (a == 1) 
        FahrenheittoCelciusAndPrint();
    else
        CelciustoFahreinheitAndPrint();
}

public static void FahrenheittoCelciusAndPrint()
{
    f = c = 0;
    Scanner scan = new Scanner (System.in);
    System.out.println("Input derajat Fahrenheit : ");
    f = scan.nextFloat();
    c = (5/9)*(f-32);
    System.out.println(f + " degrees F is " + c + " degrees C.");
}

public static void CelciustoFahreinheitAndPrint()
{
    Scanner scan = new Scanner (System.in);
    System.out.println("Input derajat Celcius : ");
    c = scan.nextFloat();
    f = c*(9/5)+32;
    System.out.println(c + " degrees C is " + f + " degrees F.");
}

}
