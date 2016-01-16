/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prima;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bilangan = new Scanner (System.in);  
        System.out.println("Masukan sebuah bilangan :");  
        int bil = bilangan.nextInt();  
        boolean prima = true;  
        for (int i=2; i<bil; i++){  
            if ((bil % i) == 0) {  
            prima = false; break;  
            }  
        }  
        if (prima)  
            System.out.println(bil + " adalah bilangan PRIMA ");  
        else  
            System.out.println(bil + " adalah bukan bilangan PRIMA ");  
    }  
}  
