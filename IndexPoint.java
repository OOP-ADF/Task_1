/*
Nama    : Arindra Rizky R
NIM     : 1103134466
Kelas   : IF-38-09
*/

package indexpoint;



/**
 *
 * @author Admin
 */

import java.util.Scanner;
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        double uts, uas, quiz, akhir;
        System.out.print("Nama : ");
        nama = input.nextLine();
	System.out.print("UTS : ");
	uts = input.nextDouble();
	System.out.print("UAS : ");
	uas = input.nextDouble();
	System.out.print("Quiz : ");
	quiz = input.nextDouble();
	
	akhir = ((uts*0.35)+(uas*0.4)+(quiz*0.2));
	System.out.println("Nilai Akhir yang diperoleh : "+akhir);
	if (akhir<50){
		System.out.println("Grade : Failed");
	}else if(akhir<65){
		System.out.println("Grade : Accepted");
	}else if(akhir<75){
		System.out.println("Grade : Good");
	}else if(akhir<85){
		System.out.println("Grade : Very Good");
	}else{
		System.out.println("Grade : Excellent");
	}
        // TODO code application logic here 
    }
    
}
