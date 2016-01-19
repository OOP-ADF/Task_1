/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//ATIKAWAHYUGIRINI 1301144211-IF3801
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner uts=new Scanner(System.in);
        Scanner uas=new Scanner(System.in);
        Scanner quiz=new Scanner(System.in);
        System.out.print("Nilai UTS : ");
        int t=uts.nextInt();
        System.out.print("Nilai UAS : ");
        int a=uas.nextInt();
        System.out.print("Nilai Quiz: ");
        int q=quiz.nextInt();
        
        double ttl=((0.35*t)+(0.4*a)+(0.25*q));
        if ((ttl>=85) && (ttl<=100)) {
            System.out.println("   EXCELLENT ");
        }
        else if ((ttl>=75) && (ttl<=84)) {
            System.out.println("   VERY GOOD    ");
        }
        else if ((ttl>=65) && (ttl<=74)) {
            System.out.println("   GOOD  ");
        }
        else if ((ttl>=50) && (ttl<=64)) {
            System.out.println("  ACCEPTABLE   ");
        }
        else if (ttl<=49) {
            System.out.println(" FAILED  ");
        }
        
    }
        
 }
    


