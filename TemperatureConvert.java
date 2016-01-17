/*
Nama  : akhmad saifullah
nim   :1301144242
kelas :38-02
 */
package konvert_suhu;


import java.util.Scanner;
/**
 *
 * @author akhamd
 */
public class Konvert_suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        Scanner read1= new Scanner(System.in);
        float celcius;
        float farenhait;
        float reamur;
        float kelvin;
        int i;
        
        System.out.println("masukan suhu celcius : ");
        celcius=read.nextFloat();
        System.out.println("konvert");
        System.out.println("1.farnheit");
        System.out.println("2.reamur");
        System.out.println("3.kelvin");
        System.out.println("pilih dan tulis angka");
        i=read1.nextInt();
        switch(i){
            case 1:
                farenhait=(float)(celcius*1.8+32);
                System.out.println(farenhait);
            break;
            case 2:
                reamur=(float)(celcius*0.8);
                System.out.println(reamur);
            break;
            case 3:
                kelvin=(float)(celcius+273.15);
                System.out.println(kelvin);
            break;
        };
        // TODO code application logic here
    }
    
}
