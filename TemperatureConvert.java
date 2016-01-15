import java.util.Scanner;
public class TemperatureConvert {
    public static void main(String[] args) {
        
        System.out.println("Temperature Converter");
        System.out.println("_____________________");
        System.out.println("1. Celcius -> Reamur");
        System.out.println("2. Celcius -> Fahrenheit");
        System.out.println("3. Celcius -> Kelvin");
        Scanner pil = new Scanner (System.in);   
        System.out.print("Masukan Angka : "); 
        
        int pilih = pil.nextInt();
        if (pilih == 1){
           System.out.print("Masukan Suhu Celcius : ");  
           Scanner C = new Scanner (System.in);
            
            int celcius = C.nextInt();
            int hasilSuhu = (int) (celcius*0.8);
            System.out.println("Reamur = "+hasilSuhu); }
        if (pilih == 2){
             System.out.print("Masukan Suhu Celcius : "); 
             Scanner C = new Scanner (System.in);
           
            int celcius = C.nextInt();
            int hasilSuhu = (int) ((celcius*1.8)+32);
            System.out.println("Fahrenheit = "+hasilSuhu);}
        if (pilih == 3){
             System.out.print("Masukan Suhu Celcius : "); 
             Scanner C = new Scanner (System.in);
           
            int celcius = C.nextInt();
            int hasilSuhu = (int) (celcius+273);
            System.out.println("Kelvin = "+hasilSuhu);}
    }
}