/*
 * write a java program that ask user an input of number that represent a temperature in celcius degrees from 
 * ask the user the choices to convert the temperature to Reamur degrees from, Fahrenheit degrees from, or Kelvin
 * write the output
 *ask the user if he/she wants to convert the number to another degrees from
 */
 import java.io.IOException;
 import java.util.Scanner;
  /**
  *
  * @author Aldika W
  */
 public class TemperatureConvert 
    {
     
 public static void clrscr(){
    //Clears Screen in java
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
}
 
     public static void main(String[] args) {
      
      double inputCelcius,Hasil;
      int pilihan;
      Scanner Masukkan = new Scanner(System.in);
              
         do{
             System.out.println("Welcome to Temperature Convert Program ");
             System.out.println();
             System.out.print("Input Temperature in Celcius : ");
             inputCelcius = Masukkan.nextInt();
             System.out.println();       
             do{
             System.out.println("Choose To Convert");
             System.out.println("1. Celcius ---> Reamur");
             System.out.println("2. Celcius ---> Fahrenheit");
             System.out.println("3. Celcius ---> Kelvin");
             System.out.print("Choose Menu: ");
             pilihan = Masukkan.nextInt();
             
         }while(pilihan == 1 && pilihan == 2 && pilihan == 3 && pilihan > 3);
             System.out.println();
             do{
                 if(pilihan == 1){
                     Hasil = inputCelcius * 4/5;
                     System.out.print(inputCelcius + " Celcius ---> "+ Hasil +" Reamur" );
                     System.out.println();
                 }
                 if(pilihan == 2){
                     Hasil = inputCelcius * 9/5 + 32;
                     System.out.print(inputCelcius + " Celcius ---> "+ Hasil +" Fahrenheit");
                     System.out.println();
                }
                 if(pilihan == 3){
                     Hasil = inputCelcius + 273.15;
                     System.out.print(inputCelcius + " Celcius ---> "+ Hasil +" Kelvin");
                     System.out.println();
                 }
                 System.out.println("Do you want to return to Temperature Convert? 1.Yes , 2.No ");
                 pilihan = Masukkan.nextInt();           
             }while(pilihan != 2 && pilihan == 1 && pilihan > 2);
             clrscr();
         }while(pilihan == 1);
     }
 } 