/* Nama		: Fadhlillah
 * NIM		: 1301154110
 * Kelas	: IF 39-12
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganPrima;

/**
 *
 * @author Fadhlillah
 */

import java.util.Scanner;

/**
 *
 * @author Fadhlillah
 */
public class bilanganPrima {
    public static void main(String[] args){
        Scanner masukan=new Scanner(System.in);
        System.out.println("masukkan bilangan :");
        int x=masukan.nextInt();
        int y=0;
        for (int i=1;i<x;i++){
            if (x%i==0){
                y=y+1;
            }
        }
        if (y==1){
            System.out.println("bilangan prima");
        }else{
            System.out.println("Bukan Bilangan prima");
        }
    }
};
    

