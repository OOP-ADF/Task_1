/*
Nama : Qisti Raya Arvianti
NIM : 1301142392
Kelas : IF-38-02
*/

import java.util.scanner;
public class PrimaNumber {

public static void main(string[] args) {
Scanner angka = new Scanner(system.in);
system.out.print("masukkan angka :");
int bilangan = angka.nextInt();
boolean prima = true;
for (int i=2; i<bilangan; i++) {

if ((bilangan % i))== 0) {

prima = false ; break;
    }
}
    if (prima)
        
system.out.print(bilangan +" Adalah bilangan prima");

else

system.out.print(bilangan +" Adalah bukan bilangan prima");
        
    }
}