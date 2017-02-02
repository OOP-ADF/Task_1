/* Nama		: M.Widadio Ilham 
  * Nim		: 1301154306
  * Kelas	: IF 39-12
  */
  
 import java.util.Scanner;
  
 public class IndexPoint {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
     Scanner quis = new Scanner (System.in);
     System.out.println("Masukkan Nilai Quiz : ");
     int  a = quis.nextInt();
     Scanner uts = new Scanner (System.in);
     System.out.println("Masukkan Nilai Mid-Term Test : ");
     int  b = uts.nextInt();
     Scanner uas = new Scanner (System.in);
     System.out.println("Masukkan Nilai End-Term Test : ");
     int  c = uas.nextInt();
     double finalScore;
     int nakhirQuiz, nakhirUts, nakhirUas;
     nakhirQuiz = a*25/100;
     nakhirUts  = b*35/100;
     nakhirUas  = c*40/100;
     finalScore = nakhirQuiz + nakhirUts + nakhirUas;
     if (finalScore >= 85 && finalScore <=100)
     {
         System.out.print("Index nilai akhir anda : EXCELLENT ");
     }
     else if (finalScore >= 75 && finalScore <=84)
     {
         System.out.print("Index nilai akhir anda : VERY GOOD ");
     }
     else if (finalScore >= 65 && finalScore <=74)
     {
         System.out.print("Index nilai akhir anda : GOOD ");
     }
     else if (finalScore >= 55 && finalScore <=64)
     {
         System.out.print("Index nilai akhir anda : ACCEPTED ");
     }
     else
     {
         System.out.print("Index nilai akhir anda : FAILED ");
     }
         
     }
        
 } 
