package TUGASPBO;

import java.util.Scanner;

/**
 *
 * @author Ergandhi Yudha Kurniawan 1301154147
 */
public class No1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner (System.in);
        System.out.print("Masukkan bilangan yang akan anda buktikan : ");
        int angka = Input.nextInt();
        
        boolean cekprima = true;
        for (int p=2 ; p < angka ; p++ )
        {
            if ((angka % p ) == 0)
            {
                 cekprima = false; break;  
            }   
        }
        
    if (angka == 1) 
            System.out.print(angka + " : Bilangan yang Anda masukkan ini bukan bilangan prima ");
    else 
        if (cekprima)
            System.out.print(angka + " : Bilangan yang Anda masukkan ini adalah bilangan prima ");
    else
            System.out.print(angka + " : Bilangan yang Anda masukkan ini bukan bilangan prima ");
    
    }
    
}

