/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureConvert;

import java.util.Scanner;

/**
 *
 * @author A455ld
 */
public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner derajat = new Scanner (System.in);  
        double ceksuhu ;
      
        
     System.out.println("tentukan suhu saat ini (celcius):");
     ceksuhu = derajat.nextDouble();
              
            System.out.println("pilihan konversi");
            System.out.println("[1]fahrenheit\n[2]kelvin\n[3]rheamur");
            int pk = derajat.nextInt();
            
            
         
            
         if (pk==1){
             ceksuhu = ceksuhu * 9/5 + 32;
             System.out.println("hasil : "+ceksuhu);
             
        }else if (pk==2){
            
            ceksuhu = ceksuhu + 273.15;
             System.out.println("hasil : "+ceksuhu);
             
        }else if (pk==3){
            
            ceksuhu = ceksuhu * 0.8;
            System.out.println("hasil : "+ceksuhu);
        }
    
         
    }
      
}
