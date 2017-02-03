/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndexPoint;

import java.util.Scanner;





/**
 *
 * @author A455ld
 */
public class IndexPoint {
    
    public static void main(String[] args) {
    Scanner score = new Scanner (System.in);
    int cekgrade;
    int nilaiUTS;
    int nilaiUAS;
    int nilaiQuiz; 
    
        System.out.println("Masukkan Score");
        
        System.out.println("Masukkan nilai UTS :");
        nilaiUTS = score.nextInt();
        System.out.println("Masukkan nilai UAS :");
        nilaiUAS = score.nextInt();
        System.out.println("Masukkan nilai Quiz :");
        nilaiQuiz = score.nextInt();
        
        if ((nilaiUTS * 0.35 + nilaiUAS * 0.40 + nilaiQuiz * 0.25) >= 85 ){
            System.out.println("excellent");
        
        }else if ((nilaiUTS * 0.35 + nilaiUAS * 0.40 + nilaiQuiz * 0.25) >= 75 ){
            System.out.println("Verry Good");
            
        }else if ((nilaiUTS * 0.35 + nilaiUAS * 0.40 + nilaiQuiz * 0.25) >= 65 ){
            System.out.println("Good");
            
        }else if ((nilaiUTS * 0.35 + nilaiUAS * 0.40 + nilaiQuiz * 0.25) >= 50 ){
            System.out.println("Accepted");
            
        }else if ((nilaiUTS * 0.35 + nilaiUAS * 0.40 + nilaiQuiz * 0.25) <= 49 ){
            System.out.println("Failed");
        }
        
        
        
    }
    
    
}

