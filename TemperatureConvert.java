
public class TemperatureConvert {

    public static void main(String[] args) {
        System.out.print("Suhu dalam Celsius: ");
        Scanner konversi = new Scanner(System.in);
        int k = konversi.nextInt();
        System.out.println("1.kelvin: ");
        System.out.println("2.reamur: ");
        System.out.println("3.fahrenheit: ");
        System.out.println("Diubah ke: ");
		int pilih = konversi.nextInt();
        int suhu;
        switch (pilih) {
           case 1 :
                suhu = k+273;
                System.out.println("Konversi Celcius ke Kelvin= " + suhu +" kelvin");
                break;
            case 2 :
                suhu = k*4/5;
                System.out.println("Konversi Celcius ke Reamur= " + suhu +" reamur");
                break;
            case 3 :
                suhu = (k*9/5)+32;
                System.out.println("Konversi Celcius ke Fahrenheit= " + suhu +" Fahrenheit");
                break;
        }
    }
    
}

