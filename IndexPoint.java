/* Nama 	: Fadhlillah
 * NIM 		: 1301154110
 * Kelas	: IF 39-12
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

/**
 *
 * @author Fadhlillah
 */
import java.util.Scanner;

/**
 *
 * @author Fadhlillah
 */
public class indexNilai {
	public static void main (String[] args) {

            Scanner quiz=new Scanner (System.in);
            System.out.println("Nilai Quiz : ");
            int a=quiz.nextInt();
            Scanner uts=new Scanner (System.in);
            System.out.println("Nilai UTS : ");
            int b=uts.nextInt();
            Scanner uas=new Scanner (System.in);
            System.out.println("Nilai UAS : ");
            int c=uas.nextInt();
			int hasil;
			int nilaiQuiz, nilaiUts, nilaiUas;
			String grade;
			nilaiQuiz=a*25/100;
			nilaiUts=b*35/100;
			nilaiUas=c*40/100;
			hasil=nilaiQuiz+nilaiUts+nilaiUas;
			if ((85<=hasil)&(hasil<=100)){
					grade=hasil+" Excellent";
			}	else if ((70<=hasil)&(hasil<=84)){
					grade=hasil+" Verygood";
			}	else if ((65<=hasil)&(hasil<=74)){
					grade=hasil+" Good";
			}	else if ((50<=hasil)&(hasil<=64)){
					grade=hasil+" Accepted";
			}	else
					grade=hasil+" Failed";
				
			
            System.out.println("Grade anda : " + grade);
        }
}

