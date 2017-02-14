/*
Nama: Faza Ahda
NIM: 1301154292
Kelas: IF-39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1;

import java.util.Scanner;

/**
 *
 * @author faza
 */
public class index {
    public static void main(String[] args) {
        // TODO code application logic here
        int akhir;
        Scanner cin = new Scanner(System.in);
        System.out.print("Masukan Nilai UTS: ");
        int nilai1=cin.nextInt();
        System.out.print("Masukan Nilai UAS: ");
        int nilai2=cin.nextInt();
        System.out.print("Masukan Nilai Quiz: ");
        int nilai3=cin.nextInt();
        akhir = (35*nilai1/100) + (40*nilai2/100) + (25*nilai3/100);
        if (akhir < 49){
                  System.out.println ("Failed");
                 }else if (akhir >= 85 && akhir <= 100){
                  System.out.println ("Excellent");
                 }else if (akhir >= 75 && akhir <= 84){
                  System.out.println ("Very Good");
                 }else if (akhir >= 65 && akhir <= 74){
                  System.out.println ("Good");
                 }else if (akhir >= 50 && akhir <= 64){
                  System.out.println ("Accepted");
                 }else{
                  System.out.println("Anda salah menginputkan akhir");
                }
        
        
    }
    
}
