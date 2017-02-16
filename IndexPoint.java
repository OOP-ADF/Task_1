
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

import java.util.Scanner;
/**
 *
 * @author rizkiaulia
 */
public class indexnilai 
{
     public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.print("Masukkan Nilai CLO1  : ");
        int CLO1 = Input.nextInt();
        System.out.print("         Nilai CLO2  : ");
        int CLO2 = Input.nextInt();
        System.out.print("         Nilai CLO3  : ");
        int CLO3 = Input.nextInt();
         
        int nilai;
        nilai = (CLO1*25)/100;
        nilai = nilai+(CLO2*35/100);
        nilai = nilai+(CLO3*40/100);
        
        if (nilai >= 80) {
            System.out.println("Sangat Bagus");
        } 
        else if (nilai >= 70) {
                System.out.println("Baik sekali");
        } 
        else if (nilai >= 60) {
                    System.out.println("Cukup Baik");
        }
        else if (nilai >= 50){
                        System.out.println("Baik");
        }
        else  {
                        System.out.println("Sangat Jelek");
        }
                            
    }
}
    

