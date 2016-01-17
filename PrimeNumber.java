/*
Nama  :Akhmad saifullah
kelas :38-02
NIM   :1301144242
 */
package tugas.pkg1;

import java.util.Scanner;
/**
 *
 * @author akhmad
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca= new Scanner(System.in);
        int no;
        int i=1;
        int j=0;
        
        System.out.println("masukan angka :");
        no = baca.nextInt();     
        do{
            if((no % i)==0){
            j++;
            }
            i++;
        }while(i<no+1);
        
        if(j==2){
        System.out.println("angka prima");
        }else{
        System.out.println("angka tidak prima");
        };
        // TODO code application logic here
    }
    
}

