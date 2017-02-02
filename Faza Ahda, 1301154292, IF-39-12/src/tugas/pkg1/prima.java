/*
Nama: Faza Ahda
NIM: 1301154292
Kelas: IF-39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1;

import java.util.Scanner;

/**
 *
 * @author faza
 */
public class prima {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner(System.in);
        System.out.print("Masukan Bialangan: ");
        int bil=cin.nextInt();
        boolean prima = true;
        for (int i=2; i<bil; i++){
    
if ((bil % i) == 0) {

prima = false; break;

    }
}
 if (prima)

System.out.println(bil + " bilangan PRIMA ");

else

System.out.println(bil + " bukan bilangan PRIMA ");
    
}
    
}
