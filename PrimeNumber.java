Alim Nuriqra A
1301144032
IF-38-02

package conditional;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner masukan=new Scanner(System.in);
        System.out.println("masukkan bilangan :");
        int x=masukan.nextInt();
        int temp=0;
        for (int i=1;i<x;i++){
            if (x%i==0){
                temp=temp+1;
            }
        }
        if (temp==1){
            System.out.println("bilangan prima");
        }else{
            System.out.println("Bukan Bilangan prima");
        }
    }
    
}
