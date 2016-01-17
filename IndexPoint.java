//Anggi Agustian - 1301144149

import java.util.Scanner;
public class IndexPoint {
 	public static void main(String[] args){

        double uas, uts, quiz, nilaiakhir ;

 		Scanner input = new Scanner(System.in);

 		System.out.print("Masukkan Nilai UAS : ");
 		uas = input.nextDouble();

 		System.out.print("Masukkan Nilai UTS : ");
 		uts = input.nextDouble();

 		System.out.print("Masukkan Nilai QUIZ : ");
 		quiz = input.nextDouble();

 		nilaiakhir = (0.35 * uts)+(0.4 * uas)+(0.25 * quiz);

                 if (nilaiakhir>85) {
                     System.out.print(" Grade : Excellent");
                 }
                 else if (nilaiakhir>75) {
                     System.out.print("Grade : Very Good");
                 }
                 else if (nilaiakhir>65) {
                     System.out.print("Grade : Good");
                 }
                else if (nilaiakhir>50) {
                     System.out.print("Grade : Average");
                 }
                 else if (nilaiakhir<50) {
                     System.out.print("Grade : Failed");
                 }

     }
 }
