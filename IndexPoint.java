/*
Nama  : Akhmad Saifullah
Nim   : 1301144242
kelas : 38-02
 */
package hitung.nilai;

import java.util.Scanner;
/**
 *
 * @author akhmad
 */
public class HitungNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca1= new Scanner(System.in);
        Scanner baca2= new Scanner(System.in);
        Scanner baca3= new Scanner(System.in);
        int uas;
        int uts;
        int quis;
        float nilai;
        
        System.out.println("masukan nilai uas : ");
        uas = baca1.nextInt();
        System.out.println("masukan nilai uts : ");
        uts = baca2.nextInt();
        System.out.println("masukan nilai quis : ");
        quis= baca3.nextInt();
        nilai= (float)((0.35*uts)+(0.4*uas)+(0.25*quis));
        
        if(nilai>=85){
        System.out.println("excellent");
        }else if(nilai>=75){
        System.out.println("very good");
        }else if(nilai>=65){
        System.out.println("good");
        }else if(nilai>=50){
        System.out.println("accepted");
        }else if(nilai>=0){
        System.out.println("failed");
        }
        // TODO code application logic here
    }
    
}

