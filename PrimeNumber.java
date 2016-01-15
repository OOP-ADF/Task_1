package prima;

/**
 *
 * @author HP
 * Nama : Zulvan Firdaus
 * NIM : 1301142292
 */
import java.util.Scanner; 
public class task1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner masukan = new Scanner (System.in);  
    System.out.print("Angka : ");  
    int angka = masukan.nextInt();  
    boolean cek = true;  
    for (int i=2; i<angka; i++){  
      
        if ((angka % i) == 0) {  
            cek = false; break; 
        }  
    }  
    if (cek)  
        System.out.println(angka + " adalah bilangan PRIMA ");  
    else  
        System.out.println(angka + " adalah bukan bilangan PRIMA ");  
    }  
}
