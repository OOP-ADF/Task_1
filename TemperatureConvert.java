/* Nama: Hani Dika Riani
   Nim: 1301144012
   Kelas: IF-38-02
 */



import java.util.Scanner;
public class JavaApplication4 {

   public static void main(String[] args) {
        double suhu, hasil;
        int pilih;
        char ulang;
        
        Scanner nilai = new Scanner(System.in);
        Scanner nilai2 = new Scanner(System.in);
        do {
         System.out.println("MENU");
         System.out.println("1. CONVERT TO REAMUR");
         System.out.println("2. CONVERT TO FAHRENHEIT");
         System.out.println("3. CONVERT TO KELVIN");
         System.out.println();
         System.out.print("Pilih: ");
         pilih=nilai.nextInt();
        
        switch(pilih) {
            case 1:
                System.out.print("Masukkan Suhu: ");
                suhu=nilai.nextDouble();
                hasil=(4 * suhu)/5;
                System.out.print("Hasil: "+hasil+" Reamur");
                break;
            case 2:
                System.out.print("Masukkan Suhu: ");
                suhu=nilai.nextDouble();
                hasil=((9 * suhu)/5)+32;
                System.out.print("Hasil: "+hasil+" Fahrenheit");
                break;
            case 3:
                System.out.print("Masukkan Suhu: ");
                suhu=nilai.nextDouble();
                hasil= suhu+273;
                System.out.print("Hasil: "+hasil+" Kelvin");
                break;
        }
        System.out.println();
        System.out.println("Ingin merubah ke suhu lainnya ? (y/n)");
        System.out.print("Pilih : ");
        ulang=nilai2.next().charAt(0);
        System.out.println();
      }while (ulang != 'n' );
    }
}
