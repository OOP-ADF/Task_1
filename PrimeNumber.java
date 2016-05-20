// nama : adrian g nurcahyo
// kelas : if-38-02
// nim : 1301140092
import java.util.Scanner;
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukkan Sebuah Bilangan :");
        int bil = masukan.nextInt();
        boolean prima = true;
        for (int i=2; i<bil; i++){
            if ((bil % i)==0){
                prima = false; break;
            }
        }
        if (prima)
            System.out.println(bil + " adalah bilangan PRIMA ");
        else
            System.out.println(bil + " adalah bukan bilangan PRIMA");
    }
    
}