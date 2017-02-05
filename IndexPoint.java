/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Rinaldy Achmad Fauzy
//1301154357
//IF 39-07
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author Rinaldy A
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double p,mid,end,quiz,finals;
//        int r=0;
//        p = cin.nextInt();
        Scanner cin=new Scanner(System.in);
        
//        for (r=1; r<=p; r++ ){}
        System.out.println("Masukkan Nilai UTS: ");
        mid=cin.nextDouble();
        System.out.println("Masukkan Nilai UAS: ");
        end=cin.nextDouble();
        System.out.println("Masukkan Nilai Quiz: ");
        quiz=cin.nextDouble();
        finals= (0.35*mid)+(0.4*end)+(0.25*quiz);
        
        if (finals>=85 && finals<=100){
            System.out.println("Excellent");
        }
        else if (finals>=75 && finals<=84){
            System.out.println("Very Good");
        }
        else if (finals>=65 && finals<=74){
            System.out.println("Good");
        }
        else if (finals>=50 && finals<=64){
            System.out.println("Accepted");
        }
        else if (finals>=0 && finals<=49){
            System.out.println("Failed");
        }
        
        
        
        
    }
    
}

