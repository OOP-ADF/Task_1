/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * Nama : Afif Darmawan
 * NIM	: 1301154133
 * Kelas: IF 39-07
 */
package tugas1;
import javax.swing.JOptionPane;

public class No1 {

    public static void main(String[] args){
        int angka =Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan: "));
        //System.out.println("Masukkan Angka Yang Anda Inputkan : ");
        boolean prima=false;
        if(angka>=2){
            prima=true;
            for(int a=2; a<angka; a++){
                if(angka%a==0){
                    prima=false;
                    break;
                }
            }
        }
        System.out.println((prima==true?angka+ "BILANGAN PRIMA":angka+"BUKAN BILANGAN PRIMA"));
    }
}

