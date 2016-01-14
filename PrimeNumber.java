/* Nama: Hani Dika Riani
   Nim: 1301144012
   Kelas: IF-38-02
 */


import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int number, counter, counter2;
        
        Scanner nilai = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        number=nilai.nextInt();
        counter= 1;
        counter2=0;
        while(number >= counter) {
            if(number%counter == 0){
                counter2++;
            }
            counter++;
            
        }
        if (counter2==2){
            System.out.print("Bilangan Prima");
        }
        else{
            System.out.print("Bukan Bilangan Prima");
        }
    }
}