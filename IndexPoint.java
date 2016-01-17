
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexpoint;
import java.util.Scanner;
/**
 *
 * @author Galih Setyo Ginanta 1301140182 if3802
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float quiz,uts,uas;
        float hasil;
        System.out.println("masukan nilai quiz");
        Scanner masukan = new Scanner (System.in);
        quiz = masukan.nextInt();
        System.out.println("masukan nilai uts");
        uts = masukan.nextInt();
        System.out.println("masukan nilai uas");
        uas = masukan.nextInt();
        
        hasil= (float) ((0.35*uts)+(0.40*uas)+(0.25*quiz));
        
           if ((hasil<=100) && (hasil>=85)) {
        System.out.println("grade EXCELLENT total score "+ hasil);
    }else if ((hasil>=75) && (hasil<=84)) {
        System.out.println("grade VERY GOOD total score"+ hasil);
    }else if ((hasil>=65) && (hasil<=74)) {
        System.out.println("grade GOOD total score "+ hasil);
    } else if ((hasil>=50) && (hasil<=64)) {
        System.out.println("grade ACCEPTED total score "+ hasil);
    }else if ((hasil>0) && (hasil<=49)) {
        System.out.println("grade FAILED total score"+ hasil);
    }  
        
    }
}