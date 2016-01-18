/*Name	: Fadma Sari Yuenam E.G.
ID		: 1301144352	
Class	: IF-38-02
*/


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win7
 */
public class class1 {
      private static Object Masukkan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner cel= new Scanner(System.in);
      System.out.print("Masukkan angka dalma Celsius :");
      int celcius= cel.nextInt();
      System.out.println("Silahkan pilih Menu");
      
      System.out.print("1.Celsius ke Fareinheit");
      System.out.print("2.Celsius ke Kelvin");
      System.out.print("3.Celsius ke Reamur");
      Scanner menu= new Scanner(System.in);
      System.out.print("Pilih Menu : ");
      int pil= menu.nextInt();
      
      if(pil == 1){
          double hslF= (celcius+273);
           System.out.print("Hasil : " +hslF);
          
      }
      else if (pil == 2){
          float hslK = (float)((1.8*celcius)+32);
           System.out.print("Hasil : " +hslK);
      }
      else {
          float hslR= (float)(0.8*celcius);
           System.out.print("Hasil = +hslR");
      }
}
}
