
package indexpoint;

import java.util.Scanner;


public class IndexPoint {

    
    public static void main(String[] args) {
        float uts ;
        float uas ;
        float quis;
        float na;
        Scanner nilai = new Scanner(System.in);
        
        System.out.print("masukkan nilai uts = ");
        uts = nilai.nextFloat();
        System.out.print("masukkan nilai uas = ");
        uas = nilai.nextFloat();
        System.out.print("masukkan nilai quis = ");
        quis = nilai.nextFloat();
        
        na = (float) (0.35 * uts + 0.40 * uas + 0.25 * quis);
        
        System.out.println("hasil niali akhir  = " + na);
        
        
        if (na >= 85 && na <=100){
            System.out.println("Excellent");
        }
        else if (na > 75 && na < 85){
            System.out.println("Very Good");
        }
        else if (na > 65 && na < 75){
            System.out.println("Good");
        }
        else if (na > 50 && na< 65){
            System.out.println("Accepted");
        }
        else {
            System.out.println("Failed");
        }
        
        
        
        
        
    }
    
}
