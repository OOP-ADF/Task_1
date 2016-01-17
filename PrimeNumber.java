/*
Nama: ZULFA UMI WARDANI
Nim: 1301144082
Kelas: IF-38-02
*/


import java.util.Scanner;

/**
 *
 * @author ZULFA UMI WARDANI
 */
public class PrimeNumber{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Aplikasi Cek Bilangan Prima");
        System.out.print("Angka : ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        int temp=0;
        for (int i=1;i<input;i++){
            if (input%i==0){
                temp=temp+1;
            }
        }
        if (temp==1){
            System.out.println("Prime Number");
        }else{
            System.out.println("NOT Prime Number");
        }
    }
    
}
