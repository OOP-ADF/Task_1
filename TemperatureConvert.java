public class TemperaturConvert {

    
     public static void main(String [] args) {
       
         float celcius;
         float fahrenheit;
         float reamur;
         double kelvin;
         int pilih;
         Scanner s = new Scanner(System.in);
         
         System.out.println("masukkan suhu awal (celcius) : ");
         celcius = s.nextFloat();
         
         System.out.println("1. ubah ke fahrenheit");
         System.out.println("2. ubah ke reamur");
         System.out.println("3. ubah ke kelvin");
     }
     
}
