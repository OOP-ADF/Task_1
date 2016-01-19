//Nama : Aliya Nur Rezkita
//NIM : 1301144161
//Kelas : IF-38-01

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int x=input.nextInt();
        int a=0;
        for (int i = 1; i < x; i++) {
            if(x%i==0)
                a=a+1;
        }
        if(a==1)
            System.out.println(x + " adalah bilangan Prima");
        else   
            System.out.println(x + " bukan bilangan Prima");
    }
}
