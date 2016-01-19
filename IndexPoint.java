import java.util.Scanner;
/*
Hizas Sabilal Rasyad
1301140251
IF3801
*/
public class IndexPoint {
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        double quiz,uts,uas,akhir; String index = "";
        System.out.print("Nilai Quiz : "); quiz = cin.nextFloat();
        System.out.print("Nilai UTS  : "); uts = cin.nextFloat();
        System.out.print("Nilai UAS  : "); uas = cin.nextFloat();
        akhir = 0.25*quiz + 0.35*uts + 0.4*uas;
        if((akhir >= 85) && (akhir <= 100)) index = "Excellent";
        else if((akhir >= 75) && (akhir <= 84)) index = "Very Good";
        else if((akhir >= 65) && (akhir <= 74)) index = "Good";
        else if((akhir >= 50) && (akhir <= 64)) index = "Accepted";
        else if((akhir >= 0) && (akhir <= 49)) index = "Failed";
        System.out.println("Grade kamu adalah : " + index);
    }
}
