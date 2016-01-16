//aryaditya H.p - 1301144162 - IF3802

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.printf("Masukkan Bilangan : ");
        int n=s.nextInt();
        int b = 0;
        for(int i=1;i<=n;i++){
        if(n%i==0)
            b=b+1;  }
        if(b==2)
            System.out.printf("Bilangan adalah bil.prima ");
        else
            System.out.printf("Bilangan bukan bil.prima ");
    }
