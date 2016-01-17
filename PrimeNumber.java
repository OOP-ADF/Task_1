/*Name	: Fadma Sari Yuenam E.G.
ID		: 1301144352	
Class	: IF-38-02
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Win7
 */
public class JavaApplication1 {
    private static Object Masukkan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean isPrima = false;
        Scanner s=new Scanner(System.in);
        System.out.println ("Masukkan Angka : ");
        int bil= s.nextInt();
          for (int i=2; i<=bil; i++){
            isPrima = false;
            if(bil % i == 0){
                    isPrima = true;
                    break;
                }
          }
            if(isPrima)
                System.out.print(bil + " adalah bilangan PRIMA " );
            else
                System.out.println (bil + " bukan Bilangan PRIMA");
            }
        }    



