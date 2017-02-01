/* Nama 	: Kukuh Sanddi Razaq
 * NIM 		: 1301154264
 * Kelas	: IF 39-12
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

/**
 *
 * @author Kukuh Sanddi
 */
import java.util.Scanner;

/**
 *
 * @author Kukuh Sanddi
 */
public class indexNilai {
	public static void main (String[] args) {

            Scanner quiz=new Scanner (System.in);
            System.out.println("Nilai Quiz : ");
            int x=quiz.nextInt();
            Scanner uts=new Scanner (System.in);
            System.out.println("Nilai UTS : ");
            int y=uts.nextInt();
            Scanner uas=new Scanner (System.in);
            System.out.println("Nilai UAS : ");
            int z=uas.nextInt();
			int hasil;
			int nilaiQuiz, nilaiUts, nilaiUas;
			String grade;
			nilaiQuiz=x*25/100;
			nilaiUts=y*35/100;
			nilaiUas=z*40/100;
			hasil=nilaiQuiz+nilaiUts+nilaiUas;
			if ((85<=hasil)&(hasil<=100)){
					grade=hasil+" A (excellent)";
			}	else if ((70<=hasil)&(hasil<=84)){
					grade=hasil+" AB  (verygood)";
			}	else if ((65<=hasil)&(hasil<=74)){
					grade=hasil+" B (good)";
			}	else if ((50<=hasil)&(hasil<=64)){
					grade=hasil+" C (accepted)";
			}	else
					grade=hasil+" D (failed)";
				
			
            System.out.println("Grade anda : " + grade);
        }
}

