package suhu;

/**
 *Nama : Zulvan Firdaus
 *NIM : 1301142292 
 */

import java.util.Scanner; 

public class task1 {

    private static char c;

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1 = new Scanner (System.in); 
        char c; 
        double o;
         System.out.print("Temperature Convert");
         System.out.println("============================");
         System.out.print("Celcius : ");
         int i = sc1.nextInt();
         do {
		 boolean cek = false;
         System.out.println("");
         System.out.println("Silakan Pilih ");
         System.out.println("1. Reamur");
         System.out.println("2. Fahrenheit");
         System.out.println("3. Kelvin");
         System.out.println("4. Exit");
         System.out.println("Pilih : ");
         int pilih = sc1.nextInt(); 
         int jawab;
         switch (pilih) {
             case 1 :   o = (i*4/5);
                        System.out.println(i+" celcius = "+o+" Reamur");
                        System.out.println("Konvert lagi?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Jawab : ");
                        jawab = sc1.nextInt();
                        if (jawab == 1) cek=true;
                        break;
             
             case 2 :   o = (i*9/5)+32;
                        System.out.println(i+" celcius = "+o+" Fahrenheit");
                        System.out.println("Konvert lagi?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Jawab : ");
                        jawab = sc1.nextInt();
                        if (jawab == 1) cek=true;
                        break;
                        
             case 3 :   o = i+273.15;
                        System.out.println(i+" celcius = "+o+" Kelvin");
                        System.out.println("Konvert lagi?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Jawab : ");
                        jawab = sc1.nextInt();
                        if (jawab == 1) cek=true;
                        break;
                        
             default :  System.out.println("Pilihan anda salah");
						cek=true;
         };
       }while(cek == true);  
    }
    
}
