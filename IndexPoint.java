/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexnilai;

/**
 *
 * @author junandre
 */

public class Nilai {
    double nilai;

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    public void cekIndex(){
        if(this.nilai>80){
            System.out.println("Index A");
        }else if(this.nilai>75 && this.nilai<=80){
            System.out.println("Index AB");
        }else if(this.nilai>70 && this.nilai<=75){
            System.out.println("Index B");
        }else if(this.nilai>60 && this.nilai<=70){
            System.out.println("Index BC");
        }else if(this.nilai>50 && this.nilai<=60){
            System.out.println("Index C");
        }else if(this.nilai>40 && this.nilai<=50){
            System.out.println("Index D");
        }else{
            System.out.println("Index E");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexnilai;

import java.util.Scanner;

/**
 *
 * @author junandre
 */
public class IndexNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Nilai n = new Nilai();
        
        System.out.print("Nilai Mahasiswa N : ");
        double x = s.nextDouble();
        n.setNilai(x);
        System.out.println("Nilai n : "+n.getNilai());
        n.cekIndex();
    }
    
}

