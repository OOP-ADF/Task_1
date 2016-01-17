//Nama : Windy Israniati Jihan//
//NIM  : 130114309//
//Kelas: IF-38-09//

public class TemperatureConvert {
  public static void main (String args[]) {
    
    System.out.println("Konfersi Suhu");
    System.out.println("=============");
    switch (menu) {
      case 1:
        System.out.println("1. Celcius -> Fahrenheit");
        break;
      case 2:
        System.out.println("2. Celcius -> Reamur");
        break;
      case 3:
        System.out.println("3. Fahrenheit -> Celsius");
        break;
      case 4:
        System.out.println("4. Fahrenheit -> Reamur");
        break;
      case 5:
        System.out.println("5. Reamur -> Fahrenheit");
        break;
      case 6:
        System.out.println("6. Reamur -> Celsius");
        break;
      default:
        System.out.println("Menu yang anda masukkan tidak terdaftar");
      }
    }
}
