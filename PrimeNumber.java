//NAMA:Faishal Abdillah
//kelas:IF-38-02
//NIM:1301144232

import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
		double angka;
		int faktor=0;
		Scanner input=new Scanner(System.in);
        System.out.println("masukkan bilangan anda: ");
        angka=input.nextDouble();
        for (int counter=1;counter<=angka;counter++){
            if (angka%counter==0){
                faktor++;
            }
        }
        if (faktor==2){
            System.out.println("Bilangan prima");
        }
		else{
            System.out.println("Bukan Bilangan prima");
        }
    }
} 
