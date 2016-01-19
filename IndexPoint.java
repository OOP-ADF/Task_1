//Nama : Aliya Nur Rezkita
//Nim : 1301144161
//Kelas : IF-38-01


import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args) {
        Scanner uts=new Scanner(System.in);
        System.out.print("Input Nilai Uts : ");
        int a=uts.nextInt();
        Scanner uas=new Scanner(System.in);
        System.out.print("Input Nilai Uas : ");
        int b=uas.nextInt();
        Scanner quiz=new Scanner(System.in);
        System.out.print("Input Nilai Quiz : ");
        int c=quiz.nextInt();
        
        double n=((0.35*a)+(0.4*b)+(0.25*c));
        
		System.out.println(" ");
        if(n>=85)
           System.out.println("Excellent");
        else if((n>=74)&&(n<=84))
            System.out.println("Very Good");
        else if((n>=65)&&(n<=74))
            System.out.println("Good");
        else if((n>=50)&&(n<=64))
            System.out.println("Accepted");
        else
            System.out.println("Failed");
    }
} 
