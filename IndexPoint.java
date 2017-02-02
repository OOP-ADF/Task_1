/*
write a java program that ask user 3 inputs of number that represent mid-term score (UTS), 
end-term score (UAS), and Quiz score
calculate the final score of 35% mid-term score, 40% end-term score, and 25% Quiz score
determine the grade of the score using these rules, and write the output grade

*/
package indexpoint;

import java.util.Scanner;

/**
 *
 * @author Aldika W
 */
public class IndexPoint {
    static int nilaiUts,nilaiUas,nilaiQuiz;
    static double nilaiakhir;
    
    static Scanner Masukkan = new Scanner(System.in);
    public void inputdata()
    {
         System.out.print(" Input Nilai UTS : ");
         nilaiUts = Masukkan.nextInt();
         System.out.print(" Input Nilai UAS : ");
         nilaiUas = Masukkan.nextInt();
         System.out.print(" Input Nilai Quiz: ");
         nilaiQuiz = Masukkan.nextInt();
     }
    
    public void nilaiakhir()
    {
       nilaiakhir=(0.35*nilaiUts)+(0.4*nilaiUas)+(0.25*nilaiQuiz);
       System.out.println(" Nilai Akhir : " +nilaiakhir);
       
       if(85<=nilaiakhir && nilaiakhir<=100)
       {
           System.out.println(" Grade : Excelent");
       }
       if(75<=nilaiakhir && nilaiakhir<=84)
       {
           System.out.println(" Grade : Very Good");
       }
       if(65<=nilaiakhir && nilaiakhir<=74)
       {
           System.out.println(" Grade : Good");
       }
       if(50<=nilaiakhir && nilaiakhir<=64)
       {
           System.out.println(" Grade : Acceptable");
       }
       if(nilaiakhir<=49)
       {
           System.out.println(" Grade : Failed");
       }
    }          
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IndexPoint IP = new IndexPoint();
        IP.inputdata();
        IP.nilaiakhir();
    }
    
}
