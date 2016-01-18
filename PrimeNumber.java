
/*
Nama 	: Iqbal Pratomo Santoso
Kelas	: IF-38-02
NIM 	: 1301144042
 */
package primenumber;

import java.util.Scanner;
/**
 *
 * @author iqbal
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        int angka;
        int cc;
        int c;
        System.out.println("Masukkan Angka : ");
        angka = baca.nextInt();
        cc = 1;
        c = 0;
        do{
            if ((angka % cc)==0){
                c++;
            }
            cc++;
        }while(cc<=angka);
        if (c==2){
            System.out.println("Bilangan Prima");
        }else{
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
