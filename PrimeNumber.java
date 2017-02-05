/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Rinaldy Achmad Fauzy
//1301154357
//IF 39-07
package primenumber;

import java.util.Scanner;

/**
 *
 * @author Rinaldy A
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bilangan1,x;
        int z=0;
        Scanner cin=new Scanner (System.in);
        System.out.println("Input Bilangan: ");
        bilangan1=cin.nextInt();
        for (x=1; x<=bilangan1; x++){
                if (bilangan1%x==0){
                    z=z+1;
                }
        }
                if (z==2){
                    System.out.println("Bilangan ini adalah Prima");}
                    else{
                    System.out.println("Bilangan ini bukan bilangan Prima");}
                }
    }
