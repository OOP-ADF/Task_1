/*Name	: Fadma Sari Yuenam E.G.
ID		: 1301144352	
Class	: IF-38-02
*/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.AND;
import java.util.Scanner;

/**
 *
 * @author Win7
 */
public class NewClass {
      private static Object Masukkan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner UAS = new Scanner(System.in);
    Scanner UTS = new Scanner (System.in);
    Scanner Quiz = new Scanner (System.in);
    System.out.print ("Masukkan Nilai Quiz : ");
    int Q = Quiz.nextInt();
    System.out.print("Masukkan Nilai UTS : ");
    int TS= UTS.nextInt();
    System.out.print("Masukkan Nilai UAS : ");
    int AS= UAS.nextInt();
    int Uts = (int) (TS*0.35);
    int Uas = (int)(AS*0.4);
    int Quis = (int)(Q*0.25);
    
    int jumlah=(int)(Uts+Uas+Quis);
    if (jumlah <= 49){
    System.out.print("Grade = Failed");
    }
    else if (jumlah<= 64 && jumlah >=50){
    System.out.print("Grade = Accepted");
    }
    else if (jumlah <= 74 && jumlah >=65){
    System.out.print("Grade = Good");
    }
    else if(jumlah >=75 && jumlah <=84){
    System.out.print("Grade = Very Good");
    }
    else {
        System.out.print("Grade = Excellent");
    }
   }
}
       
    
      
     
         
