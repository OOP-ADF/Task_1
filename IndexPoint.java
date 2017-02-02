/* Nama		: Muhammad Rakha
 * Nim		: 1301154124
 * Kelas	: IF 39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

import java.util.Scanner;

/**
 *
 * @author Alienware
 */
public class Test4 {

    
    public static void main(String[] args) {
          int quiz,uts,uas;
          String grade = null;
          
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Quiz: ");
        quiz=input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts=input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas=input.nextInt();
        
        int nilai = ((quiz*25)/100)+((35*uts)/100)+((uas*40)/100);
        
        if (nilai >= 85){
            grade="EXCELLENT";
        }
        
        else if ((nilai >= 75) && (nilai < 85)){
            grade="VERY GOOD";
        }
        
        else if ((nilai >= 65) && (nilai < 75)){
            grade="GOOD";
        }
        
        else if ((nilai >= 50) && (nilai < 65)) {
            grade="ACCEPTED";
        }
        
        else {
            grade="FAILED";
        }
        
        System.out.println("Hasil adalah : "+nilai);
        System.out.println("grade= "+grade);  
    }

    private static void grade(String failed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

