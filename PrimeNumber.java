
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Nama : Irvan Nur Apendi
 * Kelas : IF-39-12
 * NIM : 1301154208
 *
 * @author Irvan
 */
import java.util.Scanner;
public class ProgramPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan : ");
        int bilangan = input.nextInt();
        int i = 0;
        for (int j = 1; j < bilangan; j++) {
            if (bilangan % j == 0) 
            {
                i = i+1;
            }
        }
        if (i == 1) 
        {
            System.out.println("Bilangan Prima");
        }
        else
        {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
