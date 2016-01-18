/*
 * Nama     : GENTUR CIPTO TRI ATMAJA
 * NIM      : 1301140239
 * KELAS    : IF 38-09
 */
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author GENTUR CIPTO TRI ATMAJA
 */
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int quiz;
    int uts;
    int uas;
    double ntot;
        
    Scanner scan = new Scanner (System.in);
    System.out.print("Masukkan Nilai QUIZ : ");
    quiz = scan.nextInt();
    System.out.print("Masukkan Nilai UTS : ");
    uts = scan.nextInt();
    System.out.print("Masukkan Nilai UAS : ");
    uas = scan.nextInt();
    

    ntot= ((quiz*25 + uts*35 +  uas*40)/100);
    
    System.out.print("NILAI TOTAL ");
    System.out.println(ntot);
    
    if (0<ntot && ntot<50)
    {
        System.out.println("FAILED");
    }
    
    else if(50<=ntot && ntot<65)
        {
            System.out.println("ACCEPTED");
        }
    
    else if(65<=ntot && ntot<75)
        {
            System.out.println("GOOD");
        }
    
    else if(75<=ntot && ntot<85)
        {
            System.out.println("VERY GOOD");
        }
        
    else if(85<=ntot && ntot<=100)
        {
            System.out.println("EXCELENT");
        }
    }}
    


