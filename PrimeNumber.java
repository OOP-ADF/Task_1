import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputAngka = new Scanner (System.in);
        System.out.print("Masukkan Angka : ");
        int bilangan = inputAngka.nextInt();
        int i = 1;
        int hitung = 0;
        while (i<=bilangan){
            if (bilangan % i == 0){
                hitung++;
            }
            i++;
        }
        if (hitung == 2){
            System.out.println("Angka "+bilangan+" adalah bilangan prima.");
        }else{
            System.out.println("Angka "+bilangan+" adalah bukan bilangan prima.");
        }
    }
    
}
//Akhmad Fadilah Ramadhan 1301140222 IF-38-02