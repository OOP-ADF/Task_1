/*
Name        : Pima Hani Safitri
Student ID  : 1301140202
Class       : IF-38-02
 */
package task1.indeks;
import java.util.Scanner;
/**
 *
 * @author Pima Hani
 */
public class Task1Indeks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input1 = new Scanner(System.in);
       Scanner input2 = new Scanner(System.in);
       Scanner input3 = new Scanner(System.in);
       int uts,uas,kuis;
       double nilaiAkhir;
       System.out.print(" Masukkan nilai UTS mahasiswa : ");
       uts=input1.nextInt();
       System.out.print(" Masukkan nilai UAS mahasiswa : ");
       uas=input2.nextInt();
       System.out.print(" Masukkan nilai Kuis mahasiswa : ");
       kuis=input3.nextInt();
       nilaiAkhir=((0.35*uts)+(0.4*uas)+(0.25*kuis));
       if((85<=nilaiAkhir)&&(nilaiAkhir<=100)){
           System.out.println(" excellent ");
       }
       else if((75<=nilaiAkhir)&&(nilaiAkhir<=84)) {
           System.out.println(" very good ");
       }
       else if((65<=nilaiAkhir)&&(nilaiAkhir<=74)){
           System.out.println(" good ");
       }
       else if((50<=nilaiAkhir)&&(nilaiAkhir<=64)){
           System.out.println(" accepted ");
       }
       else if((0<=nilaiAkhir)&&(nilaiAkhir<=49)){
           System.out.println(" failed ");
       }
       else {
           System.out.println(" Inputan Salah ");
       }
       
    }
    
}

