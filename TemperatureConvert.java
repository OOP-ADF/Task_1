/*
nama:Lenni Syarifah Lubis
nim:1301144152
kelas:IF 38 02
*/


import java.util.Scanner;
public class TemperatureConvert {
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args){
        double reamur, fahrenheit, kelvin, hasil;
        int pilih;
        char pindah;
        
        Scanner read1 = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);
        Scanner read3 = new Scanner(System.in);
        do{
            
        
        System.out.println("Menu:");
        System.out.println("1.Celcius ke Reamur :");
        System.out.println("2.Celcius ke Fahrenheit :");
        System.out.println("3.Celcius ke Kelvin");
        System.out.println("Masukkan Suhu :");
        hasil = read1.nextDouble();
        
        
        System.out.print("Pilih :");
        pilih = read2.nextInt();
        switch (pilih){
            case 1:
                reamur = (4*hasil)/5;
                System.out.print("Hasilnya adalah :"+reamur);
                break;
            case 2:
                fahrenheit = (9*hasil)/5+32;
                System.out.print("Hasilnya adalah :"+fahrenheit);
                break;
            case 3:
                kelvin = hasil+273;
                System.out.print("Hasilnya adalah :"+kelvin);
                break;
        }
        System.out.println();
        System.out.println("Mau diubah ke Suhu Lain? : y/n");
        pindah=read3.next().charAt(0);
        System.out.println();
        }while (pindah != 'n');
        
                
        
        
        
    }
}