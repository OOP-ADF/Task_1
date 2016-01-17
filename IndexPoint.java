//Raja Ryan Pradana
//IF-38-02
//1301140302

import java.util.Scanner;
public class IndexPoint {
public static void main(String[] args) {  
    System.out.print("Masukkan Nilai Quiz : ");
        Scanner nilai = new Scanner(System.in);
        float nilaiquiz = nilai.nextFloat();
        System.out.print("Masukkan Nilai UTS : ");
        float nilaiuts = nilai.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        float nilaiuas = nilai.nextFloat();
        
        
        float jumlahquiz = ((25*nilaiquiz)/100);
        float jumlahuts = ((35*nilaiuts)/100);
        float jumlahuas = ((40*nilaiuas)/100);
        float totalnilai = (jumlahquiz+jumlahuts+jumlahuas);
        
if (totalnilai >= 85) {
    String grade = "Excellent";
    System.out.println("Score point anda adalah " +totalnilai+ ", dan grade "+grade);
}
else if (totalnilai >= 75) {
    String grade = "Very Good";
    System.out.println("Score point anda adalah " +totalnilai+ ", dan grade "+grade);
}
else if (totalnilai >= 65) {
    String grade = "Good";
    System.out.println("Score point anda adalah " +totalnilai+ ", dan grade "+grade);
}
else if (totalnilai >= 50) {
    String grade = "Accepted";
    System.out.println("Score point anda adalah " +totalnilai+ ", dan grade "+grade);
}
else if (totalnilai >= 0) {
    String grade = "Failed";
    System.out.println("Score point anda adalah " +totalnilai+ ", dan grade "+grade);
}
}
}
