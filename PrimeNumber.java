/*Nama : Yusuf Yunadian
 *NIM  : 1301150012
 *Kelas: IF-39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Input bilangan: ");
        int bilangan = cin.nextInt();
        int x=0;
        for (int i = 1; i <= bilangan; i++){
            if((bilangan%i)==0){
                x++;
            }
        }
        if(x==2){
            System.out.println("Prima");
        }
        else{
            System.out.println("Bukan Prima");
        }
    }
    
}

