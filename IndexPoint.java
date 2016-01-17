import java.util.Scanner;
public class IndexPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INDEX POINT");
        System.out.print("UAS: ");
        Scanner uas = new Scanner(System.in);
        float nilaiuas = uas.nextFloat();
        System.out.print("UTS: ");
        Scanner uts = new Scanner(System.in);
        float nilaiuts = uts.nextFloat();
	System.out.print("Kuis: ");
        Scanner Kuis = new Scanner(System.in);
        float nilaikuis = Kuis.nextFloat();
        
        float hasiluas = ((40*nilaiuas)/100);
        float hasiluts = ((35*nilaiuts)/100);
        float hasilkuis = ((25*nilaikuis)/100);
        float nilaiakhir = (hasiluas+hasiluts+hasilkuis);
        if (nilaiakhir >= 85){
            String grade = "Excellent";
            System.out.println("Anda memiliki Index Point "+nilaiakhir+" dan Grade Anda adalah "+grade);
        } else if (nilaiakhir >= 75){
            String grade = "Very Good";
            System.out.println("Anda memiliki Index Point "+nilaiakhir+" dan Grade Anda adalah "+grade);
        } else if (nilaiakhir >= 65){
            String grade = "Good";
            System.out.println("Anda memiliki Index Point "+nilaiakhir+" dan Grade Anda adalah "+grade);
        } else if (nilaiakhir >= 50){
            String grade = "Accepted";
            System.out.println("Anda memiliki Index Point "+nilaiakhir+" dan Grade Anda adalah "+grade);
        } else if (nilaiakhir >= 0){
            String grade = "Failed";
            System.out.println("Anda memiliki Index Point "+nilaiakhir+" dan Grade Anda adalah "+grade);
        }
    }
}
