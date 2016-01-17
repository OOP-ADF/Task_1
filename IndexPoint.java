/*
Nama : Qisti Raya Arvianti
Nim : 1301142392
Kelas : IF-38-02
*/
import java.util.scanner;
public class indexpoint {


/**
* @param args the command line arguments
*/
public static void main (string [] args)
    double uts,uas,kuis,nilai;
    
    Scanner read = new scanner (system.in);
    system.out.print("masukkan nilai uts :");
    uts = read.nextdouble();
    system.out.print("masukkann nilai kuis :");
    kuis = read.nextdouble();
    system.out.print("masukkan nilai uas :");
    uas = read.nextdouble();
    
    nilai = (uts*0.35)+(kuis*0.25)+(uas*0.4);
    
    if ((nilai>=80) & (nilai<=100)) {
        system.out.print("Excellent");
    }
    else if ((niai>=75) & (nilai>=84)) {
        system.out.print("Verry Good");
    }
    else if ((nilai>=65) & (nilai<=74)) {
        system.out.print("Good");
    }
    else if ((nilai>=50) & (nilai<=64)) {
        system.out.print("Falled");
        
    }

}