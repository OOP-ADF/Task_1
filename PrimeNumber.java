
package bilanganprima;

import java.util.Scanner;


public class BilanganPrima {

    
    public static void main(String[] args) {
        int i;
        int j;
        int temp=0;
        Scanner prim = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        i = prim.nextInt();
        
        for (j=1;j<i;j++){
            if (i%j == 0){
                temp = temp + 1;
            }
        }
        if (temp ==1){
            System.out.println(i +" blangan prima");
        } else {
            System.out.println(i +" bukan bilangan prima");
        }
        
        
        
    }
    
}
