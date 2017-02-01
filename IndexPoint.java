/* Nama       : Serlii Ratmala Crusita
 * Nim        : 1301154474
 * Kelas      : IF 39-12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Serlii R. Crusita
 */

public class indexPoint{
	public static void main (String [] args){
		Scanner quiz = new Scanner (System.in);
		System.out.println ("Nilai Quiz : ");
		int a = quiz.nextInt();
		Scanner uts = new Scanner (System.in);
		System.out.println ("Nilai UTS : ");
		int b = uts.nextInt();
		Scanner uas = new Scanner (System.in);
		System.out.println ("Nilai UAS : ");
		int c = uas.nextInt();
		int tempt;
		String grade;
		tempt = (a+b+c)/3;
		if ((85 <= tempt) & (tempt <= 100)){
				grade = "Excellent";
		}	else if ((75 <= tempt) & (tempt <= 84)){
				grade = "Very good";
		}	else if ((65 <= tempt) & (tempt <= 74)){
				grade = "Good";
		}	else if ((50 <= tempt) & (tempt <= 64)){
				grade = "Accepted";
		}	else
				grade = "Failed";
		
		System.out.println("Grade Anda adalah : " + grade);
	}
}
