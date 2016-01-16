/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1indexpoint;

/**
 * Nama : Reza Muhammad K
 * Nim  : 1301144332
 */
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
public class Task1indexpoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         input();
    }
    public static void input(){
        String grade = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai QUIZ = ");
        double QUIZ = in.nextDouble();
        System.out.print("Masukkan nilai uts = ");
        double uts = in.nextDouble();
        System.out.print("Masukkan nilai uas = ");
        double uas = in.nextDouble();
        double nilai = input(QUIZ, uts, uas);
        if (nilai > 0 && nilai <= 49 ){
            grade = "Failed" ;
        }else if(nilai > 50 && nilai <= 64){
            grade = "Accepted";
        }else if(nilai > 65 && nilai <= 74){
            grade = "Good";
        } else if (nilai > 75 && nilai <= 84){
            grade = "Very Good";
        }else if(nilai > 85 && nilai <= 100){
            grade = "Excelent";
        }
        System.out.println("Nilai = " + nilai );
        System.out.println(grade);
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah Anda akan menghitung lagi .? [y/n]");
        String pil = sc.nextLine();
        switch (pil) {
            case "Y":
            case "y":
                input();
                break;
            case "N":
            case "n":
                System.out.println("Terima Kasih ");
                break;
            default:
                break;
        }
    }
    public static double input(double QUIZ, double uts, double uas){
      
        double hasil = (uas * 40/100) + (uts * 35/100) + (QUIZ * 25/100);
        return hasil ;
    }
}
