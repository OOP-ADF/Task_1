Nama : Qisti Raya Arvianti
NIM : 1301142392
kelas : IF-38-02

import java.util.scanner;
public class TemperatureConvert {

/**
* @param args the command line arguments
*/
public static void main(string[] args) {

double angka,fahrenheit,reamur,kelvin;
int pilih;
char beralih;

Scanner read = new scanner (system.in);
Scanner read2 = new scanner (system.in);
Scanner read3 = new scanner (system.in);
System.out.println("MENU :");
System.out.println("1. Merubah suhu Celcius ke reamur ");
system.out.println("2. Merubah suhu Celcius ke Fahrenheit ");
system.out.println("3. Merubah suhu Celcius ke Kelvin ");
system.out.println("masukkan suhu :");

angka = read.nextdouble();
system.out.print("masukkan pilihan :");
pilih = read2.nextInt();

switch (pilih) {

case 1 :
    reamur = (4*angka)/5;
    system.out.print("maka suhu reamur adalah: " +reamur);
    break;
case 2:
    fahrenheit = (9*angka)/5 + 32;
    system.out.print("maka suhu fahrenheit adalah: " +fahrenheit);
    break;
case 3:
    kelvin = (angka + 273);
    system.out.print("maka suhu kelvin adalah: " +kelvin);
    break;
}
system.out.println();
system.out.println("masih ingin mengubah suhu? : y/n");
beralih = read3.next().charAt(0);
system.out.println();
}while(beralih !='n');