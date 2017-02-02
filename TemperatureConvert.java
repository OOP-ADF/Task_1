import java.util.Scanner;
public class ConvertSuhu {
    public static void main(String[] args) {
    double suhu, Fahrenheit, Reamur, Kelvin;
    int b;
    Scanner cin = new Scanner(System.in);
    System.out.println("KONVERSI SUHU");
    System.out.print("Masukkan suhu dalam satuan Celcius: ");
    suhu=cin.nextDouble();
    System.out.println("Suhu akan diubah ke: ");
    System.out.println("1. Fahreheit");
    System.out.println("2. Reamur");
    System.out.println("3. Kelvin");
    System.out.print("Masukkan Pilihan: ");
    b=cin.nextInt();
    
    Fahrenheit=(1.8*suhu)+32;
    Reamur=0.8*suhu;
    Kelvin=suhu+273;
    
    if (b==1) {
	System.out.println("Convert suhu Celcius ke Fahrenheit: "+Fahrenheit);
	}
    else if (b==2) {
	System.out.println("Convert suhu Celcius ke Reamur: "+Reamur);
	}
    else if (b==3) {
	System.out.println("Convert suhu ke Kelvin: "+Kelvin);
	}
    else {
	System.out.println("Tidak ada pilihan");
	}
    }
}